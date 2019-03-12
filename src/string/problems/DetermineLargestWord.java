package string.problems;

import java.util.HashMap;
import java.util.Map;

public class DetermineLargestWord {
    public static void main(String[] args) {
        /*
         Implement to Find the length and longest word in the given sentence below.
         Should return "10 biological".
         */
        String s="Human brain is a biological learning machine";
        Map<Integer, String> wordNLength = findTheLargestWord(s);
        System.out.println(wordNLength.keySet().iterator().next()+" "+wordNLength.entrySet().stream().findFirst().get().getValue());
    }

    public static Map<Integer, String> findTheLargestWord(String wordGiven){
        Map<Integer, String> map = new HashMap<Integer, String>();
        String st = "";

        String [] bigWord = wordGiven.split("\\s");

        for(int i = 0; i < bigWord.length; i++)
        {
            if(bigWord[i].length() > st.length()){
                st = bigWord[i];
            }

        }map.put(st.length(),st);

        return map;
    }
}
