package LeetCode;

import java.util.*;

public class LetterFinderApp {
    public static void main(String[] args) {

        String target = "Azerbaycan";
        System.out.println((countLetter(target)));
    }


    public static Map<Character,Integer> countLetter (String name ){

        LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();



        for (int i = 0; i < name.length() ; i++) {

            int count = 1;
            if (map.containsKey(name.charAt(i))) {

                count = map.get(name.charAt(i));

                 map.put(name.charAt(i),count+1);
                continue;
            }
                map.put(name.charAt(i),1);
        }
        return map;


    }

}
