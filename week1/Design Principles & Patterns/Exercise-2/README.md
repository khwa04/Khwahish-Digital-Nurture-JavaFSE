# Factory Method Pattern: Document Management System

This repository demonstrates a classic implementation of the **Factory Method Design Pattern** in Java. It models a simple Document Management System that can create and manage different types of documents (Word, PDF, Excel) without coupling the client code to the specific document classes.

## 📖 Overview

The **Factory Method Pattern** defines an interface for creating an object but lets subclasses alter the type of objects that will be created. 

In this example, the `DocumentManagementSystem` (the client) doesn't need to know *how* to create a `WordDocument` or `PdfDocument`. Instead, it asks the appropriate factory to instantiate and return the correct document type. This makes the system highly extensible—adding a new document type (e.g., `TextDocument`) simply requires adding a new concrete class and a corresponding factory, without modifying existing client code.

## 🏗️ Project Structure

* **`Document` (Interface):** Defines the standard behaviors (`open()`, `close()`) that all documents must implement.
* **Concrete Documents:** * `WordDocument`
    * `PdfDocument`
    * `ExcelDocument`
* **`DocumentFactory` (Abstract Factory):** Declares the abstract `createDocument()` factory method.
* **Concrete Factories:** Implement the factory method to instantiate their specific document types.
    * `WordDocumentFactory`
    * `PdfDocumentFactory`
    * `ExcelDocumentFactory`

## 🚀 How to Run

1.  **Ensure you have Java installed** on your machine.
2.  **Clone the repository** (or copy the code into a file named `DocumentManagementSystem.java`).
3.  **Compile the code:**
    ```bash
    javac DocumentManagementSystem.java
    ```
4.  **Run the application:**
    ```bash
    java DocumentManagementSystem
    ```

## 💻 Expected Output

When you run the program, the console will output the following:

```text
--- Testing Factory Method Pattern ---

Opening Word Document (.docx)...
Opening PDF Document (.pdf)...
Opening Excel Spreadsheet (.xlsx)...