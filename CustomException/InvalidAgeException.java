package concepts.CustomException;

public class InvalidAgeException extends Exception {

    public InvalidAgeException(String message) {
        super(message);  // Pass the message to the parent Exception class
    }

    public InvalidAgeException(String message, Throwable cause) {
        super(message, cause);  // Allows chaining of exceptions
    }
}
