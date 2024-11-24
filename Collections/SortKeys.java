package JavaPrograms.Collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
public class SortKeys {

    static Map<String,Integer> map = new HashMap<>();
    public static void main(String[] args)
    {
        map.put("siva",10);
        map.put("raju",20);
        map.put("kumar",30);
        map.put("abhishek",40);
        sortbykey();
    }

    public static void sortbykey()
    {
        ArrayList<String> sortedkeys = new ArrayList<>(map.keySet());
        Collections.sort(sortedkeys);
        for(String key:sortedkeys){
            //System.out.println(key+" "+map.get(key));
            System.out.println("The key is: " + key + " , value = " + map.get(key));
        }
    }
}
