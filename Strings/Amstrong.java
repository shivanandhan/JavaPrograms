package JavaPrograms.Strings;

public class Amstrong {

    public static void main(String[] args) {

        int num = 371, rem;
        double result = 0;
        int act_num = num;

        while (act_num != 0) {
            rem = act_num % 10;
            result = result + Math.pow(rem, 3);
            act_num = act_num / 10;
        }
        if (result == num) {
            System.out.println("Amstrong");
        } else {
            System.out.println("Not Amstrong");
        }
    }
}
