package org.example;

import javax.swing.text.NumberFormatter;
import java.text.NumberFormat;

public class MortgageReport {
    private MortgageCalculator mortgageCalculator;
    private NumberFormat currency;

    public MortgageReport(MortgageCalculator mortgageCalculator){
        this.mortgageCalculator = mortgageCalculator;
        currency = NumberFormat.getCurrencyInstance();
    }
    public void printMortgage() {
        double mortgage1 = mortgageCalculator.calculateMortgage();
        //Change the amount to currency
        System.out.println("MORTGAGE");
        System.out.println("--------");
        System.out.println("Monthly Payments: " + currency.format(mortgage1));
    }
    public void printPaymentSchedule() {
        System.out.println();
        System.out.println("Payment Schedule");
        System.out.println("----------------");
        for(short month1 = 1; month1 < mortgageCalculator.getNumberOfPayments(); month1++) {
            double balance = mortgageCalculator.paymentSchedule(month1);
            String balanceFormatted = NumberFormat.getCurrencyInstance().format(balance);
            System.out.println(balanceFormatted);
        }
    }
}
