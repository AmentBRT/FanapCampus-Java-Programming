package org.example.bank_account;

import java.util.Random;

public class PremiumAccount extends BasicAccount {
    static {
        PremiumAccount.transactionLimit = 1000;
    }

    private static final double INTEREST_RATE = 5.00;

    private static final int INIT_VALUE = 10;
    private static int currencyValue = INIT_VALUE;
    private static Random random = new Random();
    private static boolean randNumSign = false;
    private int currencyCount = 0;


    public PremiumAccount(int accountNumber, String ownerName, int balance) {
        super(accountNumber, ownerName, balance);
    }


    @Override
    public void deposit(int amount) {
        super.deposit(amount);
        super.deposit((int) (amount * INTEREST_RATE / 100));
    }


    public static int getAdjustedCurrencyValue() {
        int randNum = getSignedRandNum();

        currencyValue += randNum;

        return currencyValue;
    }

    public void buyCurrency(int count) {
        int cost = getCurrencyCost(count);
        if (getBalance() >= cost) {
            currencyCount += count;
            withdraw(cost);
        }
    }

    public void sellCurrency(int count) {
        if (currencyCount >= count) {
            currencyCount -= count;
            deposit(getCurrencyCost(count));
        }
    }


    private static int getSignedRandNum() {
        int randNum = random.nextInt(INIT_VALUE);
        if (!randNumSign) {
            randNum *= -1;
        }
        randNumSign = !randNumSign;

        return randNum;
    }

    private static int getCurrencyCost(int count) {
        return currencyValue * count;
    }
}
