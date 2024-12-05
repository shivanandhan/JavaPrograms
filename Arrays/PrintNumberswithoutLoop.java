package JavaPrograms.Arrays;

import java.io.InputStream;
import java.util.stream.IntStream;

public class PrintNumberswithoutLoop {
    public static void main(String[] args) {
// using recursive function without loops to print the nums
        //printnums(1);

        //using streams
        IntStream.range(1,101).forEach(e -> System.out.println(e));
    }
//    public static void printnums(int num) {
//        if(num<=100)
//        {
//            System.out.println(num);
//            num++;
//            printnums(num);
//        }
//    }
}
