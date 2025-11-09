package exceptioanAndJenerics.Exception;

public class InvalidEmail extends RuntimeException{
    public InvalidEmail (String massage){
        super(massage);
    }
}
