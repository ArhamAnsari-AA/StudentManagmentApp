package exception;

public class StudentNotFoundException extends Exception{

    String message;
    public StudentNotFoundException(String message){
        super(message);
    }
}
