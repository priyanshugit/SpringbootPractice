package StringPrograms;

import java.util.HashMap;

public class FrequencyCount {
    //O(n)
    public static void frequencyOfCharacters(String str) {
        char[] chars = str.toCharArray();
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
//        int count = 0;
//        for(char c : chars) {
//            if(map.containsKey(c)){
                    // to get value
//                count = map.get(c);
//                map.put(c, count + 1);
//            }
//            else {
//                map.put(c, 1);
//            }
//        }
        for (char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        map.entrySet().stream().forEach(i-> System.out.println(i.getKey() + " " + i.getValue()));
    }
    public static void main(String[] args) {
        String s = "anshuman";
        frequencyOfCharacters(s);

    }
}
