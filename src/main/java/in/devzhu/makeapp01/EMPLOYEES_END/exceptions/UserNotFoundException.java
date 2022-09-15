package in.devzhu.makeapp01.EMPLOYEES_END.exceptions;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(String message) {
        super(message);
    }
}
