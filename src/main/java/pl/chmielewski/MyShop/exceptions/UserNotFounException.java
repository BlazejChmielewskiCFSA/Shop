package pl.chmielewski.MyShop.exceptions;

public class UserNotFounException extends RuntimeException{
    public UserNotFounException(String message) {
        super(message);
    }
}
