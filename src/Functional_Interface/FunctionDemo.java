package Functional_Interface;

import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {

        //Function which takes in a number and return twice of it
       // apply()
        Function<Integer, Integer> f = x -> x * 2;
        System.out.println(f.apply(4));

        //Now treble the output of function
        // andThen()
        f = f.andThen(x -> x * 3);
        System.out.println(f.apply(5));

        // compose()
        // It returns a composed function wherein the parameterized function will be
        // executed first and then the first one.
        // If evaluation of either function throws an error,
        // it is relayed to the caller of the composed function.

        f = f.compose(x -> x * 2);
        System.out.println(f.apply(6));

        //identity()
        //This method returns a function that returns its only argument.

        Function<Integer, Integer> f1 = Function.identity();
        System.out.println(f1.apply(4));
    }
}
