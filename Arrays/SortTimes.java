package JavaPrograms.Arrays;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortTimes {

    public static void main(String[] args) {
        // Create a list of LocalTime objects
        List<LocalTime> times = new ArrayList<>();
        times.add(LocalTime.of(10, 30));  // 10:30
        times.add(LocalTime.of(5, 45));   // 05:45
        times.add(LocalTime.of(12, 15));  // 12:15
        times.add(LocalTime.of(8, 0));    // 08:00

        // Before sorting
        System.out.println("Before sorting:");
        for (LocalTime time : times) {
            System.out.println(time);
        }

        // Sort the list of times in ascending order
        Collections.sort(times);

        // After sorting
        System.out.println("\nAfter sorting:");
        for (LocalTime time : times) {
            System.out.println(time);
        }
    }
}

