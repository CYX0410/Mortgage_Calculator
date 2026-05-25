package org.example;

public class MortgageCalculator {
    private final static int month = 12;
    private final static int percent = 100;

    private int principal;
    private float annualInterest;
    private int years;

    public MortgageCalculator(int principal, float annualInterest, int years){
        this.principal = principal;
        this.annualInterest = annualInterest;
        this.years = years;
    }

    public double  calculateMortgage(){
        int period = getNumberOfPayments();
        float monthly_interest = getMonthlyInterest();
        return principal * (monthly_interest * (Math.pow(1 + monthly_interest, period)))
                / ((Math.pow(1 + monthly_interest, period)) - 1);
    }
    public double paymentSchedule(short numOfPayments){
        int period = getNumberOfPayments();
        float monthly_interest = getMonthlyInterest();
        return principal *
                (Math.pow(1 + monthly_interest, period) - Math.pow(1 + monthly_interest, numOfPayments))
                / (Math.pow(1 + monthly_interest, period) -1);
    }

    // Public getter so the report knows how many months to loop through
    public int getNumberOfPayments() {
        return years * month;
    }

    // Private helper method (Encapsulation of internal logic)
    private float getMonthlyInterest() {
        return (annualInterest / percent) / month;
    }
}
