package com.expense;

import java.util.ArrayList;
import java.util.Scanner;

public class ExpenseTracker {
    private static void addExpense(Scanner scanner, ArrayList<Expense> expenses) {
        System.out.print("Description: ");
        String description = scanner.nextLine();

        System.out.print("Amount: ");
        double amount = scanner.nextDouble();
        scanner.nextLine();

        expenses.add(new Expense(description, amount));

        System.out.println("Expense added!");
    }

    private static void viewExpense(ArrayList<Expense> expenses) {
        if (expenses.isEmpty()) {
            System.out.println("No expenses");
        }

        for (int i = 0; i < expenses.size(); i++) {
            System.out.println("Description: " + expenses.get(i).getDescription() + ", Amount: $" + expenses.get(i).getAmount());
        }
    }

    private static void viewTotal(ArrayList<Expense> expenses) {
        if (expenses.isEmpty()) {
            System.out.println("No expenses");
        }
        double total = 0;

        for (int i = 0; i < expenses.size(); i++) {
            total += expenses.get(i).getAmount();
        }
        System.out.println("Total Amount: $" + total);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Expense> expenses = new ArrayList<>();

        while (true) {
            System.out.println("\n===== Expense Tracker =====");
            System.out.println("1. Add Expense");
            System.out.println("2. View Expenses");
            System.out.println("3. View Total");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();
            // /n "Enter" keystroke is not clear from memory buffer so use nextLine() to clear it
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addExpense(scanner, expenses);
                    break;
                case 2:
                    viewExpense(expenses);
                    break;
                case 3:
                    viewTotal(expenses);
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
