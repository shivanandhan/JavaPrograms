package JavaPrograms.Strings;

public class Removewhitespace {
    public static void main(String[] args) {

        String str = "Hello world";
        StringBuffer sb = new StringBuffer();

        for(int i =0;i<str.length();i++)
        {
            if(str.charAt(i)!=' ')
            {
            sb.append(str.charAt(i));
            }
        }
        System.out.println(sb);
    }
}
