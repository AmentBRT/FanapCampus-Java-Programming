package org.example.bank_account;

public abstract class BankAccount {
    public int accountNumber;
    public String ownerName;
    private int balance;

    BankAccount(int accountNumber, String ownerName, int balance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public void deposit(int amount) {
        if (0 < amount) {
            balance += amount;
        }
    }

    public void withdraw(int amount) {
        if (0 < amount && amount <= balance) {
            balance -= amount;
        }
    }

    public int getBalance() {
        return balance;
    }
}
