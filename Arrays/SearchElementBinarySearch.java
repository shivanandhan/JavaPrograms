package JavaPrograms.Arrays;

import java.util.Arrays;
public class SearchElementBinarySearch {

    public static void searchElement(int [] arr, int element)
    {
        Arrays.sort(arr);
        int result = Arrays.binarySearch(arr,element);

        boolean test = result>=0?true:false;
        System.out.println(test);
    }
    public static void main(String[] args) {

        int arr[] = { 5, 1, 1, 9, 7, 2, 6, 10 };
        int element = 5;
        searchElement(arr, element);
    }
}
