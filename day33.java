// Save as day33.java

class InvalidAgeException extends Exception {
    // Constructor to display custom message
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class day33 {
    // Method to check eligibility for voting
    static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age " + age + " is not valid for voting! Must be 18 or older.");
        } else {
            System.out.println("Age " + age + " is valid. You are eligible to vote!");
        }
    }

    public static void main(String[] args) {
        int[] testAges = {15, 18, 21}; // sample test cases

        for (int age : testAges) {
            try {
                System.out.println("\nChecking age: " + age);
                checkAge(age);
            } catch (InvalidAgeException e) {
                System.out.println("Exception caught: " + e.getMessage());
            } finally {
                System.out.println("Check completed for age: " + age);
            }
        }

        System.out.println("\n Program executed successfully by Bhumika Intelligent!");
    }
}
