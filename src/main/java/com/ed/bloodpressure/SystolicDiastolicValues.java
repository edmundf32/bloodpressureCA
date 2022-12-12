package com.ed.bloodpressure;

public class SystolicDiastolicValues {
    

	private int systolic;
	private int diastolic;
	private double height;
	private int weight;

	private String result;
	private String BMI;




	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getBMI() {
		return BMI;
	}

	public void setBMI(String BMI) {
		this.BMI = BMI;
	}

	public int getDiastolic() {
		return diastolic;
	}

	public void setDiastolic(int diastolic) {
		this.diastolic = diastolic;
	}

	public int getSystolic() {
		return systolic;
	}

	public void setSystolic(int systolic) {
		this.systolic = systolic;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}




	@Override
	public String toString() {
		return "SystolicDiastolic [systolic=" + systolic + ",diastolic=" + diastolic + "]";
	}	
    
}
