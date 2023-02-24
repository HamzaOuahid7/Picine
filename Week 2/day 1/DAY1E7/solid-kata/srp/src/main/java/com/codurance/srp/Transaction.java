package com.codurance.srp;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.time.LocalDate;
import java.util.Locale;

public class Transaction {
    private TransactionRepository transactionRepository;
    private LocalDate date;
    private Clock clock;
    private int amount;
    private Transaction transactionWith(int amount) {
        return new Transaction(clock.today(), amount);
    }

    Transaction(LocalDate date, int amount) {
        this.date = date;
        this.amount = amount;
    }

    public LocalDate date() {
        return date;
    }

    public int amount() {
        return amount;
    }
    public void deposit(int amount) {
        transactionRepository.add(transactionWith(amount));
    }

    public void withdraw(int amount) {
        transactionRepository.add(transactionWith(-amount));
    }

}
