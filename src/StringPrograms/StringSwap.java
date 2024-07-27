package StringPrograms;

public class StringSwap {
    public static void main(String[] args) {
        String s1 = "Hello World";
        String s2 = "Hello Uncle";
        System.out.println(s1+" "+System.identityHashCode(s1));
        System.out.println(s2+" "+System.identityHashCode(s2));

        s1 = s2;

        System.out.println(s1+" "+System.identityHashCode(s1));
        System.out.println(s2+" "+System.identityHashCode(s2));
    }
}
