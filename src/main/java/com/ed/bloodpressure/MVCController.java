package com.ed.bloodpressure;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MVCController {
    

	BloodPressureCheck checker = new BloodPressureCheck();

	
	@RequestMapping("/")
	public String home() {
		return "index";
	}
	
	@GetMapping("/BloodPressure")
	public String showForm(Model model) {
		SystolicDiastolicValues point = new SystolicDiastolicValues();
		model.addAttribute("point", point);
			
		return "blood_pressure_entry";
	}
	
	@PostMapping("/calculate")
	public String submitForm(@ModelAttribute("point") SystolicDiastolicValues model) {

		Point bloodPressure = new Point(model.getSystolic(), model.getDiastolic()); 
		
		double BMI =  model.getWeight() / (model.getHeight() * model.getHeight());
		model.setResult(checker.getRating(bloodPressure));
		

		System.out.println("height in cm" + model.getHeight());

		if(model.getHeight() >  1.2 && model.getHeight()  < 2.2 && model.getWeight() >  50 && model.getWeight() < 200 )
		{
			double BMICalc = model.getWeight() / Math.pow(model.getHeight(), 2);
			
			model.setBMI(Double.toString(BMICalc));
		}
		else
		{
			model.setBMI("height or weight is outside of calculation range");
		}

		System.out.println(model.getBMI());
	

		return "blood_pressure_result";
	}
 // https://www.cdc.gov/nccdphp/dnpao/growthcharts/training/bmiage/page5_1.html#:~:text=With%20the%20metric%20system%2C%20the,by%2010%2C000%2C%20can%20be%20used.
}
