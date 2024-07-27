package Stream_Api;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Stream_main {
    public static void main(String[] args) {
        //create a list and Filter all even numbers from list
       List<Integer> list=  List.of(2, 4, 3, 6, 8, 43, 34, 23, 89);
       list.stream().filter(a-> a%2==0).forEach(System.out::println);
       List<Integer> l = list.stream().filter(b-> b%2==0).collect(Collectors.toList());
        System.out.println(l);

        // map
        List<String> list1 = List.of("Suhash", "narang", "teja", "rana");
        list1.stream().map(n->n.toUpperCase()).forEach(System.out::println);
        list1.stream().map(m-> m+":"+m.length()).forEach(System.out::println);

        //sorted
        list1.stream().sorted().forEach(System.out::println);

        //Min
       Integer min = list.stream().min((x,y)-> x.compareTo(y)).get();
        System.out.println(min);

        //Max
        Integer max = list.stream().max((x,y)-> x.compareTo(y)).get();
        System.out.println(max);

        //reduce
        Integer sum = list.stream().reduce(0, (x, y) -> x + y);
        System.out.println(sum);

    }
}
