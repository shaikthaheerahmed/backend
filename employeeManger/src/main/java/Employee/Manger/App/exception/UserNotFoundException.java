package Employee.Manger.App.exception;


public class UserNotFoundException extends RuntimeException {
public UserNotFoundException(String message) {
	super(message);
}
}
