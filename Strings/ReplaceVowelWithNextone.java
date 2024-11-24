package JavaPrograms.Strings;
public class ReplaceVowelWithNextone {
    static String replace(String str) {
        String T = "aeiouAEIOU";
        String rep = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int index = T.indexOf(ch);
            if (index != -1) {
                ch = T.charAt(index + 1);
            }
            rep += ch;
        }
        System.out.println(rep);
        return rep;
    }
    public static void main(String[] args) {
        String str = "siva";
        String newstr = replace(str);
    }
}
