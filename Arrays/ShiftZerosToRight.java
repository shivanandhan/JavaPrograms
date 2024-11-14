package JavaPrograms.Arrays;
import java.util.Arrays;

public class ShiftZerosToRight {

    public static int[] shiftZeros(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }
        int[] newArr = new int[arr.length];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                newArr[j] = arr[i];
                j++;
            }
        }
        return newArr;
    }

    public static void main(String[] args) {
        int[] arr = {1, 0, 3, 0, 0, 6, 0, 8, 9};
        System.out.println(Arrays.toString(shiftZeros(arr)));
    }
}
