package Exception_Handling;

import java.util.Scanner;

public class ExceptionStac {

    public static void main(String[] args) {
        a();
    }

    private static void a() {
        b();
    }

    private static void b() {
        c();
    }

    private static void c() {
        d();
    }

    private static void d() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Division Calculator");
        System.out.println("Please enter your numbers");

        int first = sc.nextInt();
        int second = sc.nextInt();

        try {

            int result = first / second;

            System.out.println("Result : " + result);

        } catch (ArithmeticException e) {

            System.out.println("Exception Message: " + e.getMessage());

            // पूर्ण Exception Stack Trace
            e.printStackTrace();
        }

        sc.close();
    }
}