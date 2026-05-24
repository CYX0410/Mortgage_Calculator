package org.example;

public class Main {
    public static void main(String[] args) {
        //Principal
        int principal = (int) ConsoleReader.readNumber("Principal: ", 1000, 1000000);
        //Annual Interest Rate
        float annualInterest = (float) ConsoleReader.readNumber("Annual Interest Rate: ", 1, 30);
        //Period in years
        int years = (int) ConsoleReader.readNumber("Period (Years): ", 1, 30);
        var calculator = new MortgageCalculator(principal, annualInterest, years);
        var report = new MortgageReport(calculator);
        report.printMortgage();
        report.printPaymentSchedule();
    }
    }

