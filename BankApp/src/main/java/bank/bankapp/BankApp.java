/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package bank.bankapp;

import java.util.Scanner;

public class BankApp {
    public static void main(String[] args) {
        Scanner money = new Scanner(System.in);

        System.out.print("Enter owner's name: ");
        String name = money.nextLine();
        Account account = new Account(name);

        System.out.print("Enter initial balance: ");
        double initialBalance = money.nextDouble();
        Balance balance = new Balance(initialBalance);

        System.out.print("Enter amount to withdraw: ");
        double withdrawAmount = money.nextDouble();
        double prevBalance = balance.getAmount();
        balance.withdraw(withdrawAmount);
        double afterWithdraw = balance.getAmount();
       

        System.out.print("Enter amount to deposit: ");
        double depositAmount = money.nextDouble();
        balance.deposit(depositAmount);
        double finalBalance = balance.getAmount();

        System.out.println("\n--Summary--");
        System.out.println("Owner: " + account.getName());
        System.out.println("Previous Balance: $" + prevBalance);
        System.out.println("New Balance $" + finalBalance);

        money.close();
    }
}


    
