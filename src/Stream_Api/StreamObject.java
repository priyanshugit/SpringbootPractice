package Stream_Api;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamObject {
    public static void main(String[] args) {

        // blank stream
        Stream<Object> emptyStream = Stream.empty();
        emptyStream.forEach(e->System.out.println(e));
        // Array, object, collection
        String names[] = {"Durga", "rabi", "anu", "hazel" };
        Stream<String> s = Stream.of(names).map(n->n.toUpperCase());
        s.forEach(System.out::println);

        // Builder stream
        Stream<Object> streambuilder = Stream.builder().build();
        streambuilder.forEach(e->System.out.println(e));

        //Arrays of stream
        Arrays.stream(new int[]{1, 2, 3, 4, 5}).forEach(System.out::println);



    }
}
