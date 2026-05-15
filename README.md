# Java Mortgage Calculator 🏠

A simple, interactive command-line application written in Java that calculates fixed monthly mortgage payments. 

## 📌 Overview
This lightweight program prompts the user to input their loan details—Principal amount, Annual Interest Rate, and Loan Term (in years)—and instantly computes the required monthly payment. It serves as a great, practical example of basic Java I/O (using `Scanner`), mathematical operations (`Math.pow`), and currency formatting (`NumberFormat`).

## ✨ Features
* **Interactive CLI:** Simple, easy-to-read terminal prompts for data entry.
* **Precise Calculations:** Accurately converts annual rates to monthly rates and years to total payment periods.
* **Currency Formatting:** Automatically formats the final calculation into standard, readable currency output (specifically tailored for RM - Malaysian Ringgit).

## 🧮 How It Works
The calculator uses the standard amortization formula to determine the fixed monthly payment:

$$M = P \frac{r(1+r)^n}{(1+r)^n - 1}$$

Where:
* **M** = Total monthly payment
* **P** = Principal loan amount
* **r** = Monthly interest rate (Annual rate / 100 / 12)
* **n** = Total number of payments (Years * 12)

## 🚀 Getting Started

### Prerequisites
* Java Development Kit (JDK) 8 or higher installed on your machine.

### How to Run
1. Clone the repository to your local machine.
2. Open your terminal or command prompt and navigate to the project directory.
3. Compile the Java file:
   ```bash
   javac MortgageCalculator.java

### Output 
<img width="343" height="230" alt="image" src="https://github.com/user-attachments/assets/838610cb-296b-474c-b8bc-c9ca769832e9" />

### Output 2 (After adding a while loop)
<img width="502" height="418" alt="image" src="https://github.com/user-attachments/assets/2dff9fe3-c9fc-4129-8565-5235cc32a41e" />

