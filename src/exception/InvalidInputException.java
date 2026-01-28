package exception;

import com.sun.source.doctree.SeeTree;

public class InvalidInputException extends Exception{
    String message;
    public  InvalidInputException(String message){
       super(message);
    }
}
