package JavaPrograms.Strings;
import java.io.*;

public class reverseWithoutChangingPositions {
    public static void reverse(char str[]){
        int r = str.length - 1, l = 0;

        while(l<r){
            //checking special characters
            if(!Character.isAlphabetic(str[l]))
                l++;
            else if(!Character.isAlphabetic(str[r]))
                r--;
//ignoring special characters
      else{
          char temp = str[l];
          str[l] = str[r];
          str[r] = temp;
          l++;
          r--;
            }
        }
    }
    public static void main(String[] args) {
        String str = "a!!!b.c.d,e'f,ghi";
        char[] ch = str.toCharArray();
        reverse(ch);
        String rev = new String(ch);
        System.out.println("Output string: " + rev);
    }
}
