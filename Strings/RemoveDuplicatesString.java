package JavaPrograms.Strings;

import java.util.HashSet;

public class RemoveDuplicatesString {
    public static String duplicates(String str)
    {
        String lowercaseStr= str.toLowerCase();
        char characters[] = lowercaseStr.toCharArray();
        HashSet<Character> unique = new HashSet<>();
        for(char character:characters)
        {
            if(!unique.contains(character))
            {
                unique.add(character);
            }
        }
        StringBuilder sb = new StringBuilder();
        for(char character:unique)
        {
            sb.append(character);
        }
        return sb.toString();
    }
    public static void main(String[] args)
    {
        String inputString = "hackerearth";
        String result = duplicates(inputString);
        System.out.println(result);
    }
}
