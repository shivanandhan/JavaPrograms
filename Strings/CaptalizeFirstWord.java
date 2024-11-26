package JavaPrograms.Strings;

public class CaptalizeFirstWord {

    public static String capitalizeFirstWord(String str) {
        String[] words = str.split("\\s");
        StringBuilder result = new StringBuilder();
        for(String word: words)
        {
            result.append(Character.toUpperCase(word.charAt(0))).
                    append(word.substring(1).toLowerCase()).append(" ");
        }
        return result.toString();
    }
    public static void main(String[] args) {
        String str = "welcome to geeks for geeks";
        String newstr = capitalizeFirstWord(str);
        System.out.println("Final String: " + newstr);
    }
}
