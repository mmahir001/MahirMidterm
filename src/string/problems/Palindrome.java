package string.problems;

public class Palindrome {

    public static void main(String[] args) {
        /*
          If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
          Palindrome. So write java code to check if a given String is Palindrome or not.
         */
        System.out.println("MOM: " + checkIfPalindrome("MOM"));
        System.out.println("DAD: " + checkIfPalindrome("DAD"));
    }

    public static boolean checkIfPalindrome(String st) {

        String string = st.toLowerCase();

        int length = string.length();
        int x = 0, y = length - 1;

        while (y > x) {
            char xValue = string.charAt(x++);
            char yValue = string.charAt(y--);

            if (xValue != yValue)
                return false;
        }
        return true;
    }


}
