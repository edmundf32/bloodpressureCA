package com.ed.bloodpressure;

import java.util.List;

public class BloodPressureArea {
    

    private boolean result;
    private List<Rectangle> rectangles;

    public BloodPressureArea(List<Rectangle> rectangles) {
 
        this.rectangles = rectangles;      
    }

    public boolean getResult(Point point)
    {

    
        result = false;
        for(Rectangle rectangle : rectangles)
        {
            if(rectangle.getResult(point)){
                result = true;
                break;
            }
        }
        return result;
    }
    
}
