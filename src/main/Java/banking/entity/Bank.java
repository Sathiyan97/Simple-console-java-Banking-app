package main.Java.banking.entity;

import java.util.Scanner;

public class Bank {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        //create initial accounts
        System.out.print("How many number of customers do you want to input? ");
        int n = sc.nextInt();
        AccountDetails[] C = new AccountDetails[n];
        for (int i = 0; i < C.length; i++) {
            C[i] = new AccountDetails();
            C[i].openAccount();
        }


        for (AccountDetails bankDetails : C) {
            bankDetails.showAccount();
            bankDetails.deposit();
            bankDetails.withdrawal();
            bankDetails.moneyTransfer();
        }
    }
}
