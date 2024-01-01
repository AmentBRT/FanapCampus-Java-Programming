package org.example.bank_account;

public class BasicAccount extends BankAccount {
    protected static int transactionLimit = 200;

    public BasicAccount(int accountNumber, String ownerName, int balance) {
        super(accountNumber, ownerName, balance);
    }

    @Override
    public void deposit(int amount) {
        if (amount < transactionLimit) {
            super.deposit(amount);
        }
    }

    @Override
    public void withdraw(int amount) {
        if (amount < transactionLimit) {
            super.withdraw(amount);
        }
    }
}
