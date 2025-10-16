package com.mycompany.drivingcost;

public class Drivingcost {
    
    public static void main(String[] args){
        drivingCost2 f;
        drivingCost2 drive= new drivingCost2();
        drive.setValues(700, 3, 25, 20, 50);
        drive.Calctotalgal();
        drive.CalctotalgasExp();
        System.out.println("the amount of gallons ==>"+drive.gettotalgal);
    }
}
    

