package exception;

public class InputMismatchException extends Exception{
    String message;
    public InputMismatchException(String message){
        super(message);
    }
}
