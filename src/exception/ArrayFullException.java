package exception;

import com.sun.source.doctree.SeeTree;

public class ArrayFullException extends Exception{
    String message;
    public ArrayFullException(String message){
        super(message);
    }
}
