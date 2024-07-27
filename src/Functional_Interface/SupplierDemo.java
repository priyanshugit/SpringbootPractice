package Functional_Interface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {
        Supplier<String> supplier = () -> "Hello I am Supplier Demo";
        System.out.println(supplier.get());

        List<String> list = Arrays.asList("ram", "shyam");
        List<String> emptylist = List.of();

        //Here orElseGet method accepting supplier as input, as list is empty so, it is returning from supplier
        System.out.println(emptylist.stream().findAny().orElseGet(supplier));

    }
}
