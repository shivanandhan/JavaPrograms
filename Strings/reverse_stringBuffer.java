package JavaPrograms.Strings;

public class reverse_stringBuffer {
    public static void main(String[] args) {

        String str  =  "Reverse String Using StringBuffer";
        System.out.println("Original string: "+str);
        // Declaring a StringBuffer and converting string to StringBuilder
        StringBuffer reverseString = new StringBuffer(str);
        reverseString.reverse();  // Reversing the StringBuffer
        // Converting StringBuffer to String
        String result = reverseString.toString();
        System.out.println("Reversed string: "+result);
    }
}
