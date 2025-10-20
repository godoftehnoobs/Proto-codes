package acum.accumilator;
import java.util.Scanner;
public class Accumilator {
    public static void main(String[] args) {
        String StoreName;
        double sales;
        double TotalSales=0;
        int months;
        Scanner sc=new Scanner(System.in);
        System.out.println("Best Buy sales Analysis");
        System.out.println("===================");
        System.out.println("Enter the Store name");
        StoreName=sc.nextLine();
        System.out.print("How many months do you wish to evaluate ==>");
        months=sc.nextInt();
        for(int i=0; i<months; i++)
        {
            System.out.println("Enter sales for Month$"+(1+1)+"==>");
            sales=sc.nextDouble();
            TotalSales=acumSales(TotalSales, sales);
        }
        System.out.println("Store Name ==> "+StoreName);
        System.out.println("Total Sales ==>"+TotalSales);
        }
    
    
    public static double acumSales(double t, double cs)
    {
        t+=cs;
        return t;
    }
}

