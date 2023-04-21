package exceptions;

public class UserNotFoundInDataException extends RuntimeException{
    public UserNotFoundInDataException(String message){
        super(message);
    }
}