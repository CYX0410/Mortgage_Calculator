# Advanced Java Mortgage Calculator & Amortization Schedule 🏦

A robust, interactive command-line application written in Java that calculates fixed monthly mortgage payments and generates a complete amortization payment schedule.

## 📌 Overview
This application prompts the user for standard loan details (Principal, Annual Interest Rate, and Term) and computes the monthly payment. It then goes a step further by generating a month-by-month payment schedule showing the remaining loan balance. 

The codebase is structured with clean code principles in mind, utilizing dedicated methods for math operations and robust input validation to ensure a seamless user experience.

## ✨ Features
* **Amortization Schedule:** Automatically calculates and prints the remaining loan balance for every month of the loan term.
* **Robust Input Validation:** Utilizes a custom `readNumber` method with a `while` loop to ensure users only enter data within valid, realistic boundaries (e.g., preventing negative interest rates or abnormally high loan terms).
* **Modular Architecture:** Business logic is separated into single-responsibility methods (`calculateMortgage` and `paymentSchedule`), keeping the `main` method clean and readable.
* **Currency Formatting:** Automatically formats all monetary outputs into standard, readable currency strings.

## 🧮 The Mathematics
The calculator relies on standard financial formulas to compute the payments and balances.

**Monthly Payment Formula:**
$$M = P \frac{r(1+r)^n}{(1+r)^n - 1}$$

**Remaining Balance Formula (after $p$ payments):**
$$B = P \frac{(1+r)^n - (1+r)^p}{(1+r)^n - 1}$$

**Where:**
* **$M$** = Total monthly payment
* **$B$** = Remaining balance
* **$P$** = Principal loan amount
* **$r$** = Monthly interest rate (Annual rate / 100 / 12)
* **$n$** = Total number of payments (Years * 12)
* **$p$** = Number of payments already made

## 🚀 Getting Started

### Prerequisites
* Java Development Kit (JDK) 8 or higher installed on your machine.

### How to Run
1. Clone this repository to your local machine.
2. Open your terminal and navigate to the project directory.
3. Compile the application:
   ```bash
   javac MortgageCalculator.java

### Output 
<img width="343" height="230" alt="image" src="https://github.com/user-attachments/assets/838610cb-296b-474c-b8bc-c9ca769832e9" />

### Output 2 (After adding a while loop)
<img width="502" height="418" alt="image" src="https://github.com/user-attachments/assets/2dff9fe3-c9fc-4129-8565-5235cc32a41e" />

### Output 3 (Add Payment Schedule function)
<img width="395" height="545" alt="image" src="https://github.com/user-attachments/assets/1a38a7ee-e53f-41c6-b49b-99212c5f0aa2" />

