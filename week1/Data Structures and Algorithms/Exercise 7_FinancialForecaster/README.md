# Recursive Financial Forecaster

## Overview
This repository contains a Java-based financial forecasting tool that predicts the future value of an investment based on historical growth rates. It serves as a practical demonstration of **recursive algorithms** applied to real-world financial compounding.

## Features
* **Recursive Calculation:** Utilizes a method that calls itself to calculate compounding year-over-year growth, mimicking the mathematical progression of compound interest.
* **Base Case & State Management:** Demonstrates proper recursive stopping conditions (when years reach `0`) to prevent stack overflow errors.
* **Precision Formatting:** Implements Java's `System.out.printf` to handle floating-point inaccuracies and cleanly format output to two decimal places (e.g., standard currency format).

## Time and Space Complexity
* **Time Complexity:** O(n) — The method executes exactly `n` times, where `n` is the number of years being forecasted.
* **Space Complexity:** O(n) — Each year calculated adds a new frame to the call stack in memory until the base case is reached.

## Getting Started

### Prerequisites
* Java Development Kit (JDK) 8 or higher installed.

### How to Run
1. Clone this repository or download the `FinancialForecaster.java` file.
2. Open a terminal and navigate to the folder containing the file.
3. Compile the Java file using the following command:
   ```bash
   javac FinancialForecaster.java