package JavaPrograms.Arrays;
import java.util.Arrays;
public class RemoveDuplicates {

    public static int removeduplicates(int arr[])
    {
        if (arr.length == 0 || arr.length == 1) {
            return arr.length;
        }
        // Sorting the input array
        Arrays.sort(arr);
        // creating another array for only storing
        // the unique elements
        int[] temp = new int[arr.length];
        int j = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                temp[j++] = arr[i];
            }
        }
        // Adding last element to the array
        temp[j++] = arr[arr.length-1];

        // Changing the original array
        for (int i = 0; i < j; i++) {
            arr[i] = temp[i];
        }
        return j;
    }
    public static void main(String[] args)
    {
        int arr[] = { 1, 1, 2, 2, 2, 4, 2 };
        int n = arr.length;
        n= removeduplicates(arr);
        // Printing The array elements
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}