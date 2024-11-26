package JavaPrograms.Strings;

public class RemoveAllSpecialCharacters {
    public static void main(String[] args) {
        String str = "%^#si@$v(a%&";
        String replace = str.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(replace.trim());
    }
}
