package string.problems;

import java.util.HashMap;
import java.util.Map;
/**
 * Created by mrahman on 04/22/17.
 */
public class DuplicateWord {

    public static void main(String[] args) {
        /*
         * Write a java program to find the duplicate words and their number of occurrences in the string.
         * Also Find the average length of the words.
         */

        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";
        System.out.println(dWords(st));
        }

        public static String dWords(String st){
            String result = "";

            Map<String, Integer > map = new HashMap<String,Integer>();
            String[] array = st.split(" ");

            for (String i: array) {
                if (map.get(i) != null){
                    map.put(i,map.get(i)+1);
                }else {
                    map.put(i,1);
                }
            }

            for (Map.Entry entry: map.entrySet()) {
                result += "The word '" +entry.getKey() +"' occurs "+entry.getValue()+" times\n ";
            }
            return result;
        }

}

