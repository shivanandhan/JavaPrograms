package JavaPrograms;

public class removeDuplicatesLambda {
    public static void main(String[] args) {
        String str = "programming";
        //Approach 1
//        StringBuilder sb = new StringBuilder();
//        str.chars().distinct().forEach(c -> sb.append((char)c));
//        System.out.println(sb);
        StringBuilder sb1 = new StringBuilder();
        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            int index = str.indexOf(ch,i+1);
            //It returns -1 if the given characters(s) are not found
            if(index==-1)
            {
                sb1.append(ch);
            }
        }
        System.out.println(sb1.toString());
    }
}
