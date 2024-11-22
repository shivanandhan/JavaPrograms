package JavaPrograms.Strings;
import java.util.Arrays;
public class sortStringAscending {
    public static void main(String[] args) {
        String str = "Hello World";
        char[] ch = str.toCharArray();
        for(int i =0; i<ch.length;i++)
        {
            for(int j=i+1; j<ch.length;j++)
            {
                if(Character.toLowerCase(ch[i])>Character.toLowerCase(ch[j]))
                {
                    char temp = ch[i];
                    ch[i]=ch[j];
                    ch[j]=temp;
                }
            }
        }
        System.out.println(new String(ch));
        //if we want to store in Array
        System.out.println(Arrays.toString(ch));
    }
}
