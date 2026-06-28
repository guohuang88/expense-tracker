package com.expense;

public class Expense {
    private String description;
    private double amount;

    public Expense(String description, double amount) {
        this.description = description;
        this.amount = amount;
    }

    public String getDescription() {
        return this.description;
    }

    public double getAmount() {
        return this.amount;
    }
}
