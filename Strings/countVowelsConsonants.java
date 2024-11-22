package JavaPrograms.Strings;

import java.util.ArrayList;
import java.util.Arrays;

public class countVowelsConsonants {
    public static void main(String[] args) {

        String str = "Hello world";
        ArrayList<Character> arr = new ArrayList<Character>
                (Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
        int consonants = 0;
        int vowels = 0;

        for (int i = 0; i < str.length(); i++) {
            if (arr.contains(str.charAt(i))) {
                vowels++;
            } else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z' || str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                consonants++;
            }
        }
        System.out.println("vowels : " + vowels + " consonants " + consonants);
    }
}
