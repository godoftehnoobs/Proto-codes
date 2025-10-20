
package bank.bankaccount;

import java.util.Scanner;

public class Bankaccount {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        
        System.out.print("enter your name: ");
        String userName = input.nextLine();
        
        BankAccount account = new BankAccount(userName);
        account.showName();
        
        while (true) {
            System.out.println("\n1. Deposite");
            System.out.println("2. Withdraw");
            System.out.println("3. Show Balance");
            System.out.println("4. Set balance");
            system.out.println("5. Exit");
            System.out.print("What can we do for you:");
            int choice = input.nextInt();
            
            if (choice ==1){
                System.out.print("Enter deposite:");
                double amount = input.nextDouble();
                account.deposite(amount);
            }else if (choice ==2){
                System.out.print("How much do you wish to withdraw:");
                double amount = input.nextDouble();
                account.withdraw(amount);
            }else if(choice ==3){
                account.showBalance();
            }else if(choice ==4){
                System.out.print("New balance: ");
                double amount = input.nextDouble();
                account.setValue(amount);
            }else if (choice ==5){
                System.out.println("Bye");
                break;
            }else {
                System.out.println("Invalide input. Try again");
            }
                
             
            }
            
                
        }
        
                
        
        


        
    }

