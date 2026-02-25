package concepts.CustomException;

public class LoginSystem {
    public void validatePassword(String password)  {
        if (password == null || password.length() < 6) {
            // Step 3: Throw the custom unchecked exception
            throw new InvalidPasswordException("Password must be at least 6 characters long.");
        }
        System.out.println("Password is valid.");
    }
}
