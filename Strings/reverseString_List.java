package JavaPrograms.Strings;

import java.util.ArrayList;
import java.util.Collections;

public class reverseString_List {
        public static void main(String[] args) {
            String strA = "Reverse String using ArrayList";
            System.out.println("Original string: "+strA);
            char str[] = strA.toCharArray();
            int n = str.length; // length of characterArray
            // Declaring ArrayList of Characters
            ArrayList<Character> list = new ArrayList<>();
            for(int i=0;i<n;i++){ // Iterating through characterArray and adding character into list
                list.add(str[i]);
            }
            Collections.reverse(list); // Reversing list
            int size = list.size(); // size of ArrayList
            System.out.print("Reversed string: ");
            for(int i=0;i<size;i++){
                // Printing characters from ArrayList in reversed manner
                System.out.print(list.get(i));
            }
        }
    }


