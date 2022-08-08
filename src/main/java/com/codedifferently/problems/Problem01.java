package com.codedifferently.problems;

import java.util.HashMap;
import java.util.Map;

public class Problem01 {
    /**
     *
     * @param input the string to be searched
     * @param letter the letter that you will search for
     * @return
     */
    public Integer countDuplicateLetters(String input, String letter){
        Map<String, Integer> map = new HashMap<>();
        input = input.toLowerCase();
        String[] letters = input.split("");

        for (String l : letters){
            map.merge(l,1, Integer::sum);
        }
        Integer value = 0;
        for(Map.Entry<String, Integer> entry : map.entrySet()){
            if (map.containsKey(letter)){
                value = map.get(letter);
            }
        }
        return value;
    }
}
