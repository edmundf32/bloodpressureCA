package com.ed.bloodpressure;
public class Rectangle {
    private Point lowerLeft;
    private Point upperRight;

    public Rectangle(Point lowerLeft, Point upperRight) {
        this.lowerLeft = lowerLeft;
        this.upperRight = upperRight;
    }  

    public boolean getResult(Point point){
        if((point.diastolic >= lowerLeft.diastolic && point.diastolic <= upperRight.diastolic) && (point.systolic >= lowerLeft.systolic && point.systolic <= upperRight.systolic)){
            return true;
        }
        return false;
    }
    
}
