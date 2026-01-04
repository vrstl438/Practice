package patterns.task9;

public class PDFProcessor implements DocumentProcessor{
    @Override
    public void process(String format){
        System.out.println("Обработка '.pdf' файла");
    }
}
