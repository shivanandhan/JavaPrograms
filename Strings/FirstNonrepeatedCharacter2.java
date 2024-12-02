package JavaPrograms.Strings;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonrepeatedCharacter2 {
    public static void main(String[] args) {
        String str = "programming";
        char[] ch = str.toCharArray();
        Map<Character,Integer> map = new LinkedHashMap<>();

        for(char c:ch)
        {
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(Map.Entry<Character,Integer> entry:map.entrySet())
        {
            if(entry.getValue()==1)
            {
                System.out.println(entry.getKey());
                break;
            }
        }
    }
}
