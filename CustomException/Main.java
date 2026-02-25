package concepts.CustomException;

public class Main {

    public static void main(String[] args) {
        UserRegistration registration = new UserRegistration();
        try {
            registration.registerUser(15);  // Will throw InvalidAgeException
        } catch (InvalidAgeException e) {
            System.out.println("Registration failed: " + e.getMessage());
        }

        LoginSystem loginSystem = new LoginSystem();
        try {
            loginSystem.validatePassword("123");  // Will throw InvalidPasswordException
        } catch (InvalidPasswordException e) {
            System.out.println("Password error: " + e.getMessage());
        }
    }
    
}
