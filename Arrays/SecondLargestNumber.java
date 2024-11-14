package JavaPrograms.Arrays;
public class SecondLargestNumber {
    public static void main(String[] args) {
        int[] arr = new int[]{10, 20, 40, 90, 30, 70, 80};
        int largest = arr[0];
        int secondLargest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] < largest) {
                secondLargest = arr[i];
            }
        }
        System.out.println("Second largest : " + secondLargest);
        System.out.println("largest : " + largest);
    }
}
