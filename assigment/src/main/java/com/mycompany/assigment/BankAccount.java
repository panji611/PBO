/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assigment;

/**
 *
 * @author Panji
 */
public class BankAccount {
    private String accountNumber;
    private String ownerName;
    private double balance;
    private String accountType;
    private boolean status;

    public BankAccount() {
        balance = 0;
        status = true;
    }

    public BankAccount(String accountNumber, String ownerName) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = 0;
        this.status = true;
    }

    public void deposit(double amount) {
        if(amount > 0){
            balance += amount;
        }else{
            System.out.println("Jumlah deposit tidak valid");
        }
    }

    public void withdraw(double amount) {
        if(amount > 0 && amount <= balance){
            balance -= amount;
        }else{
            System.out.println("Saldo tidak cukup atau jumlah salah");
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setOwnerName(String ownerName) {
        if(ownerName != null && !ownerName.isEmpty()){
            this.ownerName = ownerName;
        }
    }

    public String getOwnerName() {
        return ownerName;
    }
}
