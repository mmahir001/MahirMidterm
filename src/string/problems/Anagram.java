package string.problems;

import java.util.Arrays;
/**
 * Created by mrahman on 04/22/17.
 */
public class Anagram {

    public static boolean aGram (String string1, String string2) {
        if (string1.length() != string2.length())
            return false;

        char[] first = string1.toCharArray();
        Arrays.sort(first);
        char[] second = string2.toCharArray();
        Arrays.sort(second);

        for (int i = 0; i < first.length; i++)

            if (first[i] != second[i])
                return false;

        return true;
    }

    public static void main(String[] args) {

        System.out.println(aGram("CAT", "ACT"));
        System.out.println(aGram("ARMY", "MARY"));
    }
}
