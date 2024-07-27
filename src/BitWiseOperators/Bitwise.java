package BitWiseOperators;

public class Bitwise {
    public static void main(String[] args) {
        int p = 9, q =10;
        System.out.println(p|q); // 11 -Bitwise OR
        System.out.println(p&q); // 8 -Bitwise AND
        System.out.println(p^q); // 3 -Bitwise XOR
        System.out.println(~p);  // -10(2s complement of 6) -Bitwise Complement
        System.out.println(p<<1); // 18 - Left shift
        System.out.println(p<<2); // 36 -Left shift
        System.out.println(p>>1); // 4 -Right shift
        System.out.println(p>>2); // 2 -Right shift
    }
}
