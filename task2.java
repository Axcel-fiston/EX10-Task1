import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class task2 {
     public interface close_file
     {
         int close();
     }
    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream fis = new FileInputStream("test123.txt");
        int bajt;

        try{
            do{
                bajt=fis.read();
                if(bajt!=-1)System.out.print((char)bajt);
            }
            while (bajt !=1);

        }catch (IOException e){
            System.out.print("File not found");
        }finally {
            try {
                if(fis!=null)fis.close();
            }catch (IOException e){
                System.out.print("Error closing file");
            }
        }
    }
    }
}
