# E-Commerce Product Search Algorithms

## Overview
This repository contains a Java-based demonstration of search algorithms applied to a mock e-commerce platform. It compares the performance and implementation differences between **Linear Search** and **Binary Search** when looking up products in an inventory by their Product ID.

## Features
* **Product Data Model:** A custom `Product` class that stores ID, Name, and Category.
* **Comparable Interface:** The `Product` class implements `Comparable<Product>` to allow native array sorting by `productId`.
* **Linear Search:** An algorithm that iterates through an unsorted array one by one to find the target item.
* **Binary Search:** A highly optimized algorithm that repeatedly halves a *sorted* array to find the target item.

## Time Complexity Analysis

| Algorithm | Best-Case | Average-Case | Worst-Case | Space Complexity |
| :--- | :--- | :--- | :--- | :--- |
| **Linear Search** | O(1) | O(n) | O(n) | O(1) |
| **Binary Search** | O(1) | O(log n) | O(log n) | O(1) |


## Getting Started

### Prerequisites
* Java Development Kit (JDK) 8 or higher installed on your machine.

### How to Run
1. Clone this repository or download the `ECommerceSearch.java` file.
2. Open a terminal and navigate to the folder containing the file.
3. Compile the Java file using the following command:
   ```bash
   javac ECommerceSearch.java