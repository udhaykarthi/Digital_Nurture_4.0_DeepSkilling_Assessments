public class Main {
    public static void main(String[] args) {
        Document wordDoc = new Word();
        Document excelDoc = new Excel();
        Document pdfDoc = new PDF();

        wordDoc.open();  
        excelDoc.open();
        pdfDoc.open();   
    }
}
