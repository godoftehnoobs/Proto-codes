package com.mycompany.drivingcost;
public class drivingCost2 {
    private double totmiles;
    private double gasprice;
    private double milespergallon;
    private double parkingfee;
    private double tollfee;
    private double totalgal;
    private double totalgasExp;
    public double totalExp;
    public void setValues(double t, double gp, double mpg, double pf, double tf){
        this.totmiles=t;
        this.gasprice=gp;
        this.milespergallon=mpg;
        this.parkingfee=pf;
        this.tollfee=tf;
    }
        
    public void Calctotalgal()
    {
        this.totalgal=this.totmiles/this.milespergallon;
    }
    public void CalctotalgasExo()
    {
        this.totalgasExp=this.totalgal*this.gasprice;
    }
    public void CalctotalExp()
    {
        this.totalExp=this.totalgasExp+this.tollfee+this.parkingfee;
    }
    public double gettotalgal()
    {
        return this.totalgal;
    }
    public double gettotalgasExp()
    {
        return this.totalgasExp;
    }    
    public double gettotalExp()
    {
        return this.totalExp;
    }
}
