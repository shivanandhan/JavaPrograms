package JavaPrograms.Arrays;
public class missingNumber {
   public static int missing (int[] arr, int n)
    {
        int expsum= ((n)*(n+1))/2;
        int actualsum =0;
        for(int i =0; i<arr.length;i++)
        {
            actualsum = actualsum+arr[i];
        }
   return expsum - actualsum;
}
public static void main(String[] args) {
       int [] arr ={1,3,4,5,6};
       System.out.println(missing(arr,6));
}
}
