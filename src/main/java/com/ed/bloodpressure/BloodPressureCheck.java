package com.ed.bloodpressure;

import java.util.ArrayList;

public class BloodPressureCheck {
    
    Rectangle high1 = new Rectangle(new Point(90, 70), new Point(90, 190));
	Rectangle high2 = new Rectangle(new Point(40, 140), new Point(100, 190));

    Rectangle pre1 = new Rectangle(new Point(80, 70), new Point(89, 139));
	Rectangle pre2 = new Rectangle(new Point(40, 120), new Point(79, 139));

	Rectangle ideal1 = new Rectangle(new Point(60, 70), new Point(79, 119));
	Rectangle ideal2 = new Rectangle(new Point(40, 90), new Point(59, 119));

	Rectangle low1 = new Rectangle(new Point(40, 70), new Point(59, 89));

    public String getRating(Point pointToCheck){
        String result = "not found";
        
        BloodPressureArea low = new BloodPressureArea(new ArrayList<Rectangle>(){{add(low1);}});
		BloodPressureArea ideal = new BloodPressureArea(new ArrayList<Rectangle>(){{add(ideal1);add(ideal2);}});
        BloodPressureArea pre = new BloodPressureArea(new ArrayList<Rectangle>(){{add(pre1);add(pre2);}});
        BloodPressureArea high = new BloodPressureArea(new ArrayList<Rectangle>(){{add(high1);add(high2);}});

        if(low.getResult(pointToCheck))result = "Low";
        if(ideal.getResult(pointToCheck))result = "Ideal";
        if(pre.getResult(pointToCheck))result = "Pre-high";
        if(high.getResult(pointToCheck))result = "High";

        return result;
    }    
    
}
