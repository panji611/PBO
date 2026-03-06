/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.assigment;
import java.util.Scanner;

/**
 *
 * @author Panji
 */
public class Assigment {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("=== BANK ACCOUNT SYSTEM ===");

        System.out.print("Masukkan Nomor Rekening : ");
        String accNumber = input.nextLine();

        System.out.print("Masukkan Nama Pemilik : ");
        String owner = input.nextLine();

        BankAccount account = new BankAccount(accNumber, owner);

        System.out.print("Masukkan Jumlah Deposit : ");
        double deposit = input.nextDouble();
        account.deposit(deposit);

        System.out.print("Masukkan Jumlah Withdraw : ");
        double withdraw = input.nextDouble();
        account.withdraw(withdraw);

        System.out.println("\n=== DATA AKUN ===");
        System.out.println("Nama Pemilik : " + account.getOwnerName());
        System.out.println("Saldo : " + account.getBalance());

        System.out.println("\n=== DATA TRANSAKSI ===");
        Transaction trx = new Transaction("TRX001", "Deposit", deposit);
        trx.printTransaction();

        input.close();
    }
}
