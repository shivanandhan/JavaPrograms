package JavaPrograms.Strings;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class StringCompressionHashMap {

    public static void duplicates(String str)
    {
        char ch[] = str.toCharArray();

        HashMap<Character,Integer> count = new LinkedHashMap<>();
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

        StringBuilder sb = new StringBuilder();
        for(Map.Entry<Character,Integer> entry: count.entrySet())
        {
            sb.append(entry.getKey());
            sb.append(entry.getValue());
        }
        System.out.println(sb.toString());

    }
    public static void main(String[] args)
    {
        duplicates("aaabbcc");
    }
}

