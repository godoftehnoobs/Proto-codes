package hwgrade.hwgradebookapp;
import java.util.Scanner;
public class HwGradeBookApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter student name: ");//Enter the student's name
        String Studentname = scanner.nextLine();
        HwStudent s1 = new HwStudent(Studentname);
        System.out.print("How many grades are you entering? ");
        int Gradecount = scanner.nextInt();
        int count = 0;
        while (count < Gradecount){
            System.out.print("Enter grade number" + (count + 1)+":");
            double grade = scanner.nextDouble();
            if (grade < 0 || grade > 100){
            System.out.println("Not a valide grade try again");
            continue;
        }
        s1.AddAverage(grade);
        count++;
        }
        double average = s1.CalcAverage();
        String letterGrade = s1.GetAverage();
        
        System.out.println("\n--grades--");
        System.out.println("Student name: " + s1.getName());
        System.out.println("Student average:"+ average);
        System.out.println("Letter grade: " + letterGrade);
        
        
        }
    }
        
              
        
            
            
  
                
            
    

