import java.util.Scanner;

    public class challenge87 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to calculator");

        System.out.println("Enter first number0");
        int first = input.nextInt();
        System.out.println("Enter second number0");
        int second = input.nextInt();

        try {
            int result = first / second;
            System.out.println(result);
        } catch (ArithmeticException exception) {
            if (exception.getMessage().equals("/ by zero")) {

                System.out.println("Divide by zero occured");

            } else {
                throw exception;
            }
        }

    }
}
