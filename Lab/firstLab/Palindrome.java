package Lab.firstLab;

public class Palindrome {
    //main function processes the data
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            String s = args[i];
            if (isPalindrome(s)) {
                System.out.println(s + " is palindrome");
            }
            else {
                System.out.println(s + " is not palindrome");
            }
        }
    }
    //reverseString function reverse word
    public static String reverseString(String str) {
        String reverseStr = "";
        for (int i=0; i<str.length(); i++) {
            reverseStr = str.charAt(i) + reverseStr;
        }
        return reverseStr;
    }

    //isPalindrome function check if word is palindrome
    public static boolean isPalindrome(String str) {
        return str.equals(reverseString(str));
    }
}