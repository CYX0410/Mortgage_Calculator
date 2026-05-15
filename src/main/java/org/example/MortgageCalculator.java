package org.example;

import java.security.Principal;
import java.security.PublicKey;
import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {
    final static int month = 12;
    final static int percent = 100;
    public static void main(String[] args) {
        //Principal

        int principal = (int) readNumber("Principal: ", 1000, 1000000);
        //Annual Interest Rate
        float annualInterest = (float) readNumber("Annual Interest Rate: ", 1, 30);
        //Period in years
        int years = (int) readNumber("Period (Years): ", 1, 30);

        double mortgage1 = calculateMortgage(principal, annualInterest, years);
            //Change the amount to currency
            String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage1);
            System.out.println("MORTGAGE");
            System.out.println("--------");
            System.out.println("Monthly Payments: " + mortgageFormatted);

            System.out.println();
            System.out.println("Payment Schedule");
            System.out.println("----------------");
            for(short month1 = 1; month1 < years * month; month1++) {
                double balance = paymentSchedule(principal, annualInterest, years, month1);
                String balanceFormatted = NumberFormat.getCurrencyInstance().format(balance);
                System.out.println(balanceFormatted);
            }
        }
    //read number
        public static double readNumber(String prompt, double min, double max){
            Scanner scanner =  new Scanner(System.in);
            double value;
            while (true){
                System.out.print(prompt);
                value = scanner.nextFloat();
                if(value >= min && value <= max)
                    break;
                System.out.println("Enter a value between " + min + " and " + max);
            }
            return value;
        }
    //calculate mortgage
        public static double  calculateMortgage(int principal, float annualInterest, int years){
            int period = years * month;
            float monthly_interest = (annualInterest / percent) / month;
            double mortgage = principal * (monthly_interest * (Math.pow(1 + monthly_interest, period))) / ((Math.pow(1 + monthly_interest, period)) - 1);
            return mortgage;
        }
        public static double paymentSchedule(int principal, float annualInterest, int years, short numOfPayments){
            int period = years * month;
            float monthly_interest = (annualInterest / percent) / month;
            double balance = principal *
                    (Math.pow(1 + monthly_interest, period) - Math.pow(1 + monthly_interest, numOfPayments))
                    / (Math.pow(1 + monthly_interest, period) -1);
            return balance;
        }
    }

