package org.example;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {
    public static void main(String[] args) {
        final int month = 12;
        final int percent = 100;
        int principal = 0;
        float annualInterest = 0.00F;
        int years = 0;
        //Principal
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Principal (RM1k - RM1M): ");
            principal = scan.nextInt();
            if(principal >= 1000 && principal <= 1000000)
                break;
            System.out.println("Enter a number between 1,000 and 1,000,000.");
        }
            //Annual Interest Rate
            while (true){
                System.out.println("Annual Interest Rate: ");
                annualInterest = scan.nextFloat();
                if(annualInterest >= 1 && annualInterest <= 30)
                    break;
                System.out.println("Enter a value greater than 0 and less than or equal to 30.");
            }
            float monthly_interest = (annualInterest / percent) / month;
            //Period in years

            while(true){
                System.out.println("Period (Years): ");
                years = scan.nextInt();
                if(years >= 1 && years <= 30)
                    break;
                System.out.println("Enter a value between 1 and 30");
            }
            int period = years * month;
            //calculate mortgage
            double mortgage = principal * (monthly_interest * (Math.pow(1 + monthly_interest, period))) / ((Math.pow(1 + monthly_interest, period)) - 1);
            //Change the amount to currency
            NumberFormat currency = NumberFormat.getCurrencyInstance();
            String result = currency.format(mortgage);
            System.out.println("Mortgage(RM): " + result);
        }
    }

