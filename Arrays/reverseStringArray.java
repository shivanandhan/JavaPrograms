package JavaPrograms.Arrays;

import java.util.Arrays;

public class reverseStringArray {
    public static void main(String[] args) {

        String[] arr = {"hello", "world"};
        StringBuilder builder = new StringBuilder();
        for(int i=arr.length-1;i>=0;i--){
            builder.append(arr[i]).append(" ");
        }
        String[] reversed = builder.toString().split(" ");
        System.out.println(Arrays.toString(reversed));
    }
}
