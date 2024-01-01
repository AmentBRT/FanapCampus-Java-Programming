package org.example.bank_account;

public class BasicAccount extends BankAccount {
    private static int TRANSACTION_LIMIT = 200;

    public BasicAccount(int accountNumber, String ownerName, int balance) {
        super(accountNumber, ownerName, balance);
    }

    @Override
    public void deposit(int amount) {
        if (amount < TRANSACTION_LIMIT) {
            super.deposit(amount);
        }
    }

    @Override
    public void withdraw(int amount) {
        if (amount < TRANSACTION_LIMIT) {
            super.withdraw(amount);
        }
    }
}
