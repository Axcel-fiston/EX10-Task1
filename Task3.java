import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Task3 {
    public static void main(String[] args) throws FileNotFoundException {

        int bajt;

        try (FileInputStream fis = new FileInputStream("file.txt");
             FileOutputStream fos = new FileOutputStream("copyOfFile.txt")) {

            do {
                bajt = fis.read();
                if ((char) bajt == ' ') bajt = '-';
                if (bajt != -1) fos.write(bajt);

            } while (bajt != -1);
        } catch (IOException e) {
            System.out.print("error IO");
        }
    }
}

