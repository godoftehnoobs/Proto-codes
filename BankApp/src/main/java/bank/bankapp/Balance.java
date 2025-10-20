/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank.bankapp;

public class Balance {
    private double amount;

    public Balance(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void deposit(double depositAmount) {
        if (depositAmount > 1000) {
            System.out.println("Cannot deposit more than $1000 at once.");
        } else {
            amount += depositAmount;
            System.out.println("Deposited $" + depositAmount);
        }
    }

    public void withdraw(double withdrawAmount) {
        if (withdrawAmount > amount) {
            System.out.println("Insufficient balance.  Cannot Withdrawa.");
        } else {
            amount -= withdrawAmount;
            System.out.println("Withdrew $" + withdrawAmount);
            
        }
    }
}

    
