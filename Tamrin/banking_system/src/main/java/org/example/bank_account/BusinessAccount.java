package org.example.bank_account;

public class BusinessAccount extends PremiumAccount {
    static {
        BusinessAccount.transactionLimit = 10_000;
        BusinessAccount.interestRate = 10.00;
    }

    public BusinessAccount(int accountNumber, String ownerName, int balance) {
        super(accountNumber, ownerName, balance);
    }
}
