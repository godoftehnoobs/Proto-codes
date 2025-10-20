package hwgrade.hwgradebookapp;
public class HwStudent {
    private String Studentname;//Name entered by student
    private double Totalgrades;//Sum of all grades entered
    private int Gradecount;//keeps track of how many grades have been entered

//This is the constructor that stores the students name
public HwStudent(String name){
    this.Studentname=name;
    this.Totalgrades=0;
    this.Gradecount=0;
}
//This adds up the grades and adds more grade inputs to the counter
public void AddAverage(double grade){
    Totalgrades += grade;
    Gradecount++;
}
public double CalcAverage(){//Chechs grade count and calculates average
    if (Gradecount == 0) return 0;
    return Totalgrades / Gradecount;
}
public String GetAverage(){//Returns letter grade based on the average
    double average = CalcAverage();
    
    if (average >= 100) return "A+";
    else if (average >= 93) return "A";
    else if (average >= 90) return "A-";
    else if (average >= 87) return "B+";
    else if (average >= 83) return "B";
    else if (average >= 80) return "B-";
    else if (average >= 77) return "C+";
    else if (average >= 73) return "C";
    else if (average >= 70) return "C-";
    else if (average >= 67) return "D+";
    else if (average >= 63) return "D";
    else if (average >= 60) return "D-";
    else return "F";
}
public String getName(){//Gets name
    return Studentname;  
}    
}
