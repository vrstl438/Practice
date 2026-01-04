package patterns.task9;

public class DOCProcessor implements DocumentProcessor{
    @Override
    public void process(String format){
        System.out.println("Обработка '.doc' файла");
    }
}
