package com.mycompany.eventspro;

public class Finance {
    private double income;
    private double expenses;

    public void addIncome(double amount) {
        income += amount;
    }

    public void addExpense(double amount) {
        expenses += amount;
    }

    public double getBalance() {
        return income - expenses;
    }
    public double getExpensesPorcentage(){
        if(income==0){
            return 0;
        }
        return (expenses/income)*100;
    }
    public double getSavingsPorcentage(){
        if(income==0){
            return 0;
        }
        return ((income - expenses)/income)*100;
    }
    public void showStatistics(){
        System.out.println("Financial statistics");
        System.out.println("Total income: " + income);
        System.out.println("Total expenses: " + expenses);
        System.out.println("Current Balance: " + getBalance());
        System.out.println("Expenses represent: " + getExpensesPorcentage() + " of income");
        System.out.println("Savings represent: " + getSavingsPorcentage() + "of income");
    }
}
