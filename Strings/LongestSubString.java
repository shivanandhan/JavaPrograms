package JavaPrograms.Strings;

import java.util.HashMap;

public class LongestSubString {
    public static int lengthOfLongestSubstring(String s) {
        // HashMap to store the characters and their most recent index
        HashMap<Character, Integer> map = new HashMap<>();
        int maxLength = 0;
        int left = 0;  // Left pointer of the sliding window

        // Iterate through the string with the right pointer
        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);

            // If the character is already in the map, move the left pointer
            if (map.containsKey(currentChar)) {
                // The new left pointer should be the maximum of the current left and the index after the last occurrence of the character
                left = Math.max(left, map.get(currentChar) + 1);
            }

            // Update the map with the current character's index
            map.put(currentChar, right);

            // Calculate the length of the current window and update maxLength if it's the longest
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        String input = "abcabcbb";
        System.out.println("Longest substring without repeating characters: " + lengthOfLongestSubstring(input));  // Output: 3
    }
}

