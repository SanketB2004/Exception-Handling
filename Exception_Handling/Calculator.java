package Exception_Handling;

import java.util.Scanner;

public class Calculator {
    
 public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    System.out.println("welcome to division claculator");
    System.out.println("Pleasse enter your numbers");

    int first = sc.nextInt();
    int second = sc.nextInt();
try {
    int result = first / second;

    System.out.println("Result : " + result);
} catch (ArithmeticException exception)  {

    System.out.printf( "%s, enter valid values", exception.getMessage());
}



 }   
}
