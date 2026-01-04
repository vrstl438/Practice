package patterns.task9;

public class DocumentAdapter implements DocumentProcessor {
    private final DocumentProcessor documentProcessor;

    private final String formatTo;

    public DocumentAdapter(DocumentProcessor documentProcessor, String formatTo){
        this.documentProcessor = documentProcessor;
        this.formatTo = formatTo;
    }

    @Override
    public void process(String format){
        String baseFormat = format.substring(format.lastIndexOf(".") + 1);

        if(!baseFormat.equals(formatTo)){
            format = format.replace("." + baseFormat, "." + formatTo);
        }

        documentProcessor.process(format);
    }

}
