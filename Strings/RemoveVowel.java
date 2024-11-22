package JavaPrograms.Strings;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveVowel {

    public static void main(String[] args)
    {
        String str = "Hello world";
        ArrayList<Character> arr=  new ArrayList<Character>
                (Arrays.asList('a','e','i','o','u','A','E','I','O','U'));
        StringBuffer sb = new StringBuffer();
        for(int i =0; i<str.length();i++)
        {
            if(!arr.contains(str.charAt(i)))
            {
                sb.append(str.charAt(i));
            }
        }
        System.out.println(sb);
    }
}
