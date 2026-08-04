import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class challenge88 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the number use wished");

        String fileName = sc.next();

        try (FileReader reader = new FileReader(fileName)){
            int read;while ((read = reader.read())!=-1) {
                System.out.print((char)read);
            }
        } catch (IOException e) {
            System.out.printf("Exception Occcured : %s",e.getMessage());
                }
}
}