/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.drivingcost;



public class DrivingCost {

    public static void main(String[] args) {
        
        drivingCost2 drive= new drivingCost2();
        drive.setValues(700, 3, 25, 20, 50);
        drive.Calctotalgal();
        drive.gettotalgal();
        drive.CalctotalExp();
        drive.gettotalExp();
        System.out.println("the amount of gallons ==>" + drive.gettotalgal());
        System.out.println("The driving cost is ==>" + drive.gettotalExp());
        
        
    }
}
