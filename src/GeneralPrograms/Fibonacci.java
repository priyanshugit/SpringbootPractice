package GeneralPrograms;

public class Fibonacci {
    //T.C o(n)
    public static int nthFibonacci(int n) {
        if (n ==1 | n==2) {
            return n-1;
        }
        else
          return nthFibonacci(n-1) + nthFibonacci(n-2);
    }
    //T.C O(n)
    public static int iterativeFibonacci(int n) {
        if (n ==1 | n==2) {
            return n-1;
        }
        else {
            int a =0, b = 1;
            for (int i = 2; i < n; i++) {
                int c = a+b;
                a = b;
                b = c;
            }
            return b;
        }
    }
    public static void main(String[] args) {
        System.out.println(nthFibonacci(3));
        System.out.println(iterativeFibonacci(5));
    }
}
