package Functional_Interface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
    Consumer<Integer> consumer = t -> System.out.println(t*t);
    consumer.accept(10);
    consumer.accept(20);

    // here for each method accepting consumer
        List<Integer> list = Arrays.asList(1, 2, 3, 4,5);
        list.forEach(consumer);
        list.forEach(n-> System.out.println(n*n*n));


    }
}
