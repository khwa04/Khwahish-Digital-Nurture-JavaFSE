// 1. Define the Document Interface
interface Document {
    void open();
    void close();
}

// 2. Create Concrete Document Classes
class WordDocument implements Document {
    @Override
    public void open() { System.out.println("Opening Word Document (.docx)..."); }
    @Override
    public void close() { System.out.println("Closing Word Document."); }
}

class PdfDocument implements Document {
    @Override
    public void open() { System.out.println("Opening PDF Document (.pdf)..."); }
    @Override
    public void close() { System.out.println("Closing PDF Document."); }
}

class ExcelDocument implements Document {
    @Override
    public void open() { System.out.println("Opening Excel Spreadsheet (.xlsx)..."); }
    @Override
    public void close() { System.out.println("Closing Excel Spreadsheet."); }
}

// 3. Implement the Abstract Factory
abstract class DocumentFactory {
    // The Factory Method
    public abstract Document createDocument();
}

// 4. Create Concrete Factory Classes
class WordDocumentFactory extends DocumentFactory {
    @Override
    public Document createDocument() {
        return new WordDocument();
    }
}

class PdfDocumentFactory extends DocumentFactory {
    @Override
    public Document createDocument() {
        return new PdfDocument();
    }
}

class ExcelDocumentFactory extends DocumentFactory {
    @Override
    public Document createDocument() {
        return new ExcelDocument();
    }
}

// 5. Test the Implementation
public class DocumentManagementSystem {
    public static void main(String[] args) {
        System.out.println("--- Testing Factory Method Pattern ---\n");

        // We want a Word Document, so we use the Word Factory
        DocumentFactory wordFactory = new WordDocumentFactory();
        Document myWordDoc = wordFactory.createDocument();
        myWordDoc.open();

        // We want a PDF Document, so we use the PDF Factory
        DocumentFactory pdfFactory = new PdfDocumentFactory();
        Document myPdfDoc = pdfFactory.createDocument();
        myPdfDoc.open();

        // We want an Excel Document, so we use the Excel Factory
        DocumentFactory excelFactory = new ExcelDocumentFactory();
        Document myExcelDoc = excelFactory.createDocument();
        myExcelDoc.open();
    }
}