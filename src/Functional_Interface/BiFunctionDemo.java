package Functional_Interface;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class BiFunctionDemo {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> multiply = (a, b) -> a * b;
        System.out.println(multiply.apply(70, 10));

        //create an instance of Map
        Map<Integer, String> map = new HashMap<>();
//adding values to the Map
        map.put(1, "Olivia");
        map.put(2, "Noah");
        map.put(3, "John");
        map.put(4, "Alex");
        map.put(5, "Emma");
        map.put(6, "Amelia");
        map.put(7, "Noah");
//Collections.frequency to get number of occurrences
        BiFunction<Integer, String, String> f = (key, value) -> "[Key="+key+", "+value+"("+ Collections.frequency(map.values(), value)+")]";
//itrating over the Map
        map.forEach((k,v)-> System.out.println(f.apply(k, v)));
    }
}
