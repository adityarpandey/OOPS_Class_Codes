package concepts.BankingManagementSystem;

import java.util.Scanner;

public final class InputUtils {

    private static final Scanner SC = new Scanner(System.in);

    private InputUtils() {}

    public static String getString(String prompt) {
        System.out.print(prompt);
        return SC.nextLine().trim();
    }

    public static int getInt(String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                return Integer.parseInt(SC.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid integer.");
            }
        }
    }

    public static double getDouble(String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                return Double.parseDouble(SC.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");
            }
        }
    }
}
