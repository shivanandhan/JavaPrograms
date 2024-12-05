package JavaPrograms.Arrays;
import java.io.*;
public class CopyFile {
    public static void main(String[] args)
    {
        File file = new File("C://Users//srvva//Desktop//NewHomeData.txt");
        File outfile = new File("C://Users//srvva//Desktop//NewHomeData-copy.txt");
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
            fileInputStream = new FileInputStream(file);
            fileOutputStream = new FileOutputStream(outfile);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            System.out.println(fileInputStream.available());
        } catch (IOException e) {
            e.printStackTrace();
        }
        int i =0;
            try {
                while ((i = fileInputStream.read()) != -1) {
                    fileOutputStream.write(i);

                }
            }
            catch (IOException e) {
                       e.printStackTrace();
                    }
            finally{
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(fileOutputStream!=null)
            {
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
    }
}
