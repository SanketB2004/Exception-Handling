package Exception_Handling;

// Custom Exception Class
class InvalidAgeException extends Exception {

    public InvalidAgeException(String message) {
        super(message);
    }
}

public class customeException {

    static void checkAge(int age) throws InvalidAgeException {

        if (age < 18) {

            throw new InvalidAgeException(
                "Age is less than 18"
            );
        }

        System.out.println("You are eligible");
    }

    public static void main(String[] args) {

        try {

            checkAge(15);

        } catch (InvalidAgeException e) {

            System.out.println(
                "Exception Occurred: " + e.getMessage()
            );
        }
    }''
}