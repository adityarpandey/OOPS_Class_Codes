package concepts.CustomException;

public class UserRegistration {

    public void registerUser(int age) throws InvalidAgeException {
        if (age < 18) {
            // Step 3: Throw the custom checked exception
            throw new InvalidAgeException("User must be at least 18 years old.");
        }
        System.out.println("User registered successfully!");
    }

}
