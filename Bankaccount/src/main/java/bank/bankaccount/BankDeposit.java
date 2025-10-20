/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank.bankaccount;


public class BankAccount{
    private String name;
    private double balance;
    
    pubilc BankAccount(String ownername){
        name= ownername;
        balance= 0.0;
    }
    public void setValues(double amount){
        if (amount >=0){
            balance=amount;
            System.out.println("Your current balance is $" + balance);
        }else {
            System.out.println("You van't have a negative balance!!");
        }
            
    }
    
    public void deposite(double amount){
        if (amount<= 0){
            System.out.println("Desposite must be greater than 0");
        }
        else if(amount> 1000){
            System.out.println("YOu cannot deposite more than $1000 at once!!");
        }
        else {
            balance = balance + amount;
            System.out.println("Deposite $"+ amount);
    }
    
public void withdraw(double amount) {
    if (amount <= 0) {
        System.out.println("Your withdrawal must be more than zero");
    } else if (amount > balance) {
        System.out.println("Amount exceeds balance! Try again");
    } else {
        balance = balance - amount;
        System.out.println("Withdrew $" + amount);
    }
}

    
    public void showBalance(){
        System.out.println("Balance is ==>$"+ balance);
    }
    public void showName(){
        System.out.println("Account name ==>" + name);
    }
}    
        
    
    
    
        
        
    
    
    

