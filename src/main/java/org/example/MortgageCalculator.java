package org.example;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {
    public static void main(String[] args){
        final int month = 12;
        final int percent = 100;
        //Principal
        Scanner scan = new Scanner(System.in);
        System.out.println("Principal: ");
        int principal = scan.nextInt();
        //Annual Interest Rate
        System.out.println("Annual Interest Rate: ");
        float annualInterest = scan.nextFloat();
        float monthly_interest = (annualInterest/percent) / month;
        //Period in years
        System.out.println("Period (Years): ");
        int years = scan.nextInt();
        int period = years * month;
        //calculate mortgage
        double mortgage = principal * (monthly_interest * (Math.pow(1 + monthly_interest,period))) / ((Math.pow(1 + monthly_interest,period)) - 1);
        //Change the amount to currency
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result = currency.format(mortgage);
        System.out.println("Mortgage(RM): " + result);
    }
}
