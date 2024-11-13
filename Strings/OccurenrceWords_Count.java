package JavaPrograms.Strings;

import java.util.HashMap;
import java.util.Set;

public class OccurenrceWords_Count {

    public static void duplicateWords(String str) {
        String words[] = str.split(" ");
        HashMap<String, Integer> wordcount = new HashMap<String, Integer>();
        //checking each word
        for (String word : words) {
            //Check whether this word is present in the word count
            if (wordcount.containsKey(word)) {
                wordcount.put(word.toLowerCase(), wordcount.get(word.toLowerCase()) + 1);
            } else {
                wordcount.put(word.toLowerCase(), 1);
            }
            //Extracting keys from wordcount
            Set<String> wordsInString = wordcount.keySet();
            //iterating though each and every word
            for (String wordSet : wordsInString) {
                if (wordcount.get(wordSet) > 1) {
                    System.out.println(wordSet + ": " + wordcount.get(wordSet));
                }
            }
        }
    }
        public static void main(String [] args)
        {
            duplicateWords("Hello java hello");
        }
    }

