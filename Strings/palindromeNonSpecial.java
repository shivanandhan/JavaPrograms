package JavaPrograms.Strings;

public class palindromeNonSpecial {
        public static void main(String[] args) {
            String input = "mad*&amgh";
            if (isPalindrome(input)) {
                System.out.println("The string is a palindrome.");
            } else {
                System.out.println("The string is not a palindrome.");
            }
        }

        public static boolean isPalindrome(String str) {
            str = str.toLowerCase();

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (Character.isLetterOrDigit(ch)) {
                    sb.append(ch);
                }
            }

            String cleanedStr = sb.toString();
            int l = 0, r = cleanedStr.length() - 1;

            while (l < r) {
                if (cleanedStr.charAt(l) != cleanedStr.charAt(r)) {
                    return false;
                }
                l++;
                r--;
            }

            return true;
        }
    }


