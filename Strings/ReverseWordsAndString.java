package JavaPrograms.Strings;

public class ReverseWordsAndString {

    public static void main(String[] args) {
        String OrginalStr = " Hello world java";
        String words[] = OrginalStr.split("\\s");
        String reversedStr = "";

        for(int i =0;i<words.length;i++)
        {
            String word = words[i];
            String reversedword ="";

            for(int j=word.length()-1;j>=0;j--)
            {
                reversedword += word.charAt(j);
            }
            reversedStr =reversedStr+ reversedword+ " ";
        }
        System.out.println(reversedStr);
    }
}
