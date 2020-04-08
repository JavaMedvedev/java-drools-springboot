package com.example.drools;

public class Calculator {

    private String bankName;
    private double amountToBorrow;
    private int termInMonths;
    private double totalCost;
    private double totalInterest;
    private double monthlyPayment;
    private double interestRate;

    public Calculator(String bankName, double amountToBorrow, int termInMonths, double totalCost, double totalInterest, double monthlyPayment, double interestRate) {
        this.bankName = bankName;
        this.amountToBorrow = amountToBorrow;
        this.termInMonths = termInMonths;
        this.totalCost = totalCost;
        this.totalInterest = totalInterest;
        this.monthlyPayment = monthlyPayment;
        this.interestRate = interestRate;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public double getAmountToBorrow() {
        return amountToBorrow;
    }

    public void setAmountToBorrow(double amountToBorrow) {
        this.amountToBorrow = amountToBorrow;
    }

    public int getTermInMonths() {
        return termInMonths;
    }

    public void setTermInMonths(int termInMonths) {
        this.termInMonths = termInMonths;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    public double getTotalInterest() {
        return totalInterest;
    }

    public void setTotalInterest(double totalInterest) {
        this.totalInterest = totalInterest;
    }

    public double getMonthlyPayment() {
        return monthlyPayment;
    }

    public void setMonthlyPayment(double monthlyPayment) {
        this.monthlyPayment = monthlyPayment;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
}


