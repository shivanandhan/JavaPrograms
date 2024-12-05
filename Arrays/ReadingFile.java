package JavaPrograms.Arrays;
import java.io.File;
import java.io.FileInputStream;

public class ReadingFile {
    public static void main(String[] args) {
      String path ="C://Users//srvva//Desktop//NewHomeData.txt";

       File file = new File(path);
       FileInputStream fis = null;

        try {
            fis = new FileInputStream(file);

            int i =0;
            while((i= fis.read())!= -1)
            {
                System.out.print((char)i);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
