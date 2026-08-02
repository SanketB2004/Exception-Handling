import java.io.FileReader;
import java.io.IOException;

public class reader {

    public static void main(String[] args) {

        String fileName = "Java-Course.txt";

        try (FileReader reader = new FileReader(fileName)) {

            int data;

            while ((data = reader.read()) != -1) {

                System.out.print((char) data);
            }

        } catch (IOException e) {

            System.out.println("Error Occurred: " + e.getMessage());
        }
    }
}