package JavaPrograms.Arrays;

import java.util.HashSet;
import java.util.Set;
public class RemoveDuplicatesSet {

    public static void main(String[] args) {
        //java program to remove duplicates using set
        int[] arr ={1,3,4,3,2,4,3,1,5,5};
        Set<Integer> set = new HashSet<>();
        for(int num: arr)
        {
            set.add(num);
        }
        System.out.println(set);
    }
}
