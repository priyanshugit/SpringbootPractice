package StringPrograms;
//here’s a simple Java program that demonstrates the immutability of String objects:
public class ImmutableStringProof {
    public static void main(String[] args) {
        // Both of the string pointing to the same memory location
        String a = "Hello";
        String b = a;

        System.out.println("Before Modification");
        System.out.println(a +" "+System.identityHashCode(a));
        System.out.println(b + " "+System.identityHashCode(b));
        // when we try to modify string , it will create new object
        // earlier both a and b pointing to same memory location but after modification because of new object starts
        // pointing to another location
        a = a + "world";
        System.out.println("After Modification");
        System.out.println(a +" "+System.identityHashCode(a));
        System.out.println(b + " "+System.identityHashCode(b));

    }
}
