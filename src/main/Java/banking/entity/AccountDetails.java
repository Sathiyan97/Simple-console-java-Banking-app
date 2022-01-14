package main.Java.banking.entity;

import java.util.Scanner;

public class AccountDetails {

    private String accno;
    private String name;
    private String address;

    private Double balance;
    Scanner sc = new Scanner(System.in);

    //method to open new account
    public void openAccount() {
        System.out.print("Enter Account No: ");
        accno = sc.next();
        System.out.print("Enter Name: ");
        name = sc.next();
        System.out.print("Enter address: ");
        address = sc.next();
        System.out.print("Enter Balance: ");
        balance = sc.nextDouble();
    }

    public void showAccount() {
        System.out.println("Name of account holder: " + name);
        System.out.println("Account no : " + accno);
        System.out.println("Your address : " + address);
        System.out.println("Balance: " + balance);
    }

    public void deposit() {
        double amt;
        System.out.println("Enter the amount you want to deposit: ");
        amt = sc.nextDouble();
        balance = balance + amt;
        System.out.println("Balance after deposit: " + balance);
    }

    //method to withdraw money
    public void withdrawal() {
        double amt;
        System.out.println("Enter the amount you want to withdraw: ");
        amt = sc.nextDouble();
        if (balance >= amt) {
            balance = balance - amt;
            System.out.println("Balance after withdrawal: " + balance);
        } else {
            System.out.println("Your balance is less than " + amt + "\tTransaction failed...!!");
        }
    }


    public void moneyTransfer(){
        double transferAmount;
        System.out.println("Enter the amount you want to transfer: ");
        transferAmount = sc.nextDouble();
        if (balance >= transferAmount) {
            balance = balance - transferAmount;
            System.out.println("Transaction successful");
            System.out.println("Balance after transfer: " + balance);
        } else {
            System.out.println("Your balance is less than " + transferAmount + "\tTransaction failed...!!");
        }
    }


}
