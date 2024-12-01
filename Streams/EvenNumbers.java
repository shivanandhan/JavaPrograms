package JavaPrograms.Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumbers {
        public static void main(String[] args) {

            List<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
            List result = numbers.stream().filter(e-> (e%2)==0).map(e -> e*2)
                    .collect(Collectors.toUnmodifiableList());
            System.out.println(result);

        }
}
