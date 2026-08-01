package Exception_Handling;

import java.io.EOFException;
import java.util.Scanner;

public class Calculator {
    
 public static void main(String[] args)throws Exception {
    
    Scanner sc = new Scanner(System.in);

//     System.out.println("welcome to division claculator");
//     System.out.println("Pleasse enter your numbers");

//     int first = sc.nextInt();
//     int second = sc.nextInt();
// try {
//     int result = first / second;

//     System.out.println("Result : " + result);
// // } catch (ArithmeticException th)  {

// //     System.out.printf( "%s, enter valid values", th.getMessage());
      

// // } 
// // }catch (Throwable ch)  {
 
// //     // System.out.println( "Genral Exceptio");
      
// // throw new Exception( "Genral Exceptio");

// // }
// }catch (Throwable ch)  {
 
//      System.out.println( "Genral Exceptio");
      
// throw ch;

// }






 checkAge(sc.nextInt()); // this is method call  




 
}
static void checkAge(int age) {

    if (age < 18) {
        throw new RuntimeException("Age is less than 18");
    }

    System.out.println("You are eligible");
}


}
