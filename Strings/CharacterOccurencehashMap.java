package JavaPrograms.Strings;
import java.util.HashMap;

public class CharacterOccurencehashMap {

        public static void duplicates(String str)
        {
            char ch[] = str.toCharArray();
            HashMap<Character,Integer> count = new HashMap<>();
            for(char c : ch)
            {
                if(count.containsKey(c))
                {
                    count.put(c, count.get(c)+1);
                }
                else {
                    count.put(c,1);
                }
            }
            System.out.println(ch + " : " + count);
        }
        public static void main(String[] args)
        {
            duplicates("Hello World");
        }
    }


