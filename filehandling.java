import java.io.FileWriter;
import java.io.IOException;

public class filehandling {

    public static void main(String[] args) {

        String fileName = "Java-Course.txt";

        try (FileWriter writer = new FileWriter(fileName);) {

        

            writer.write("This is Java course");

            writer.flush();
            writer.close();

            System.out.println("File Written Successfully");

        } catch (IOException e) {

            System.out.println("Error Occurred: " + e.getMessage());
        } 
            
        }
    }
