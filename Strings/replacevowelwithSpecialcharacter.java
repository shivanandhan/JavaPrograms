package JavaPrograms.Strings;

public class replacevowelwithSpecialcharacter {

    public static void main(String args[])  {

        String str = "hello";
        char[] c = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {

            if (c[i] == 'a' || c[i] == 'e' || c[i] == 'i' || c[i] == 'o'
                    || c[i] == 'u') {

                System.out.println(str.replace(c[i], '?'));
            }
        }
    }
}

