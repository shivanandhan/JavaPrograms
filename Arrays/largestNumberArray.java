package JavaPrograms.Arrays;

public class largestNumberArray {
    public static void main(String[] args) {
        int[] arr = new int[]{10,20,40,90,30,70,80};
        int max =arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}
