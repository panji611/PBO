/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assigment;

/**
 *
 * @author Panji
 */
public class BankSystem {
    private String bankName;
    private int totalAccounts;
    private boolean systemStatus;
    private String adminName;
    private String location;

    public BankSystem() {
        systemStatus = true;
    }

    public BankAccount createAccount(String accNumber, String owner) {

        BankAccount acc = new BankAccount(accNumber, owner);

        System.out.println("Akun berhasil dibuat");
        System.out.println("Nama: " + acc.getOwnerName());

        return acc;
    }
}
