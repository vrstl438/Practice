package patterns.task9;

public class Main {
    public static void main(String[] args) {

        DocumentProcessor documentAdapter = new DocumentAdapter(new DOCProcessor(), "doc");

        documentAdapter.process("qqq.pdf");

        DocumentProcessor pdfAdapter = new DocumentAdapter(new PDFProcessor(), "pdf");

        pdfAdapter.process("www.doc");
    }
}
