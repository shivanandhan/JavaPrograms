package JavaPrograms.Arrays;

import java.util.Arrays;

public class ShiftZerosToLeft {

    public static int[] shiftToLeft(int arr[])
    {
        int lastIndex = arr.length-1;

        for(int i=arr.length-1;i>=0;i--)
        {
            if(arr[i]!=0)
            {
                arr[lastIndex]=arr[i];
                lastIndex--;
            }
        }

        for(int i =0; i<=lastIndex;i++)
        {
            arr[i]=0;
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[] ={ 10,0,20,0,30,40};
        System.out.println(Arrays.toString(shiftToLeft(arr)));
    }
}
