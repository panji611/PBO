/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assigment;

/**
 *
 * @author Panji
 */
public class Transaction {
    private String transactionId;
    private String type;
    private double amount;
    private String date;
    private String accountNumber;

    public Transaction(String transactionId, String type, double amount) {
        this.transactionId = transactionId;
        this.type = type;
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public void printTransaction() {
        System.out.println("ID: " + transactionId);
        System.out.println("Type: " + type);
        System.out.println("Amount: " + amount);
    }
}
