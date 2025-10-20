package review.midtermreview2025;
import java.util.Scanner;
public class MidtermReview2025 {

    public static void main(String[] args) {
        String lname;
        String fname;
        int yob;
        Scanner sc= new Scanner(System.in);
        System.out.println("The message app");
        System.out.println("===================");
        System.out.print("Enter you first name");
        fname=sc.nextLine();
        System.out.print("Enter your last name");
        lname=sc.nextLine();
        System.out.print("Enter you year of birth");
        yob=sc.nextInt();
        CreateMessage gustavo=new CreateMessage(lname, fname, yob);
        gustavo.PrintMessage();
        
    }
}
