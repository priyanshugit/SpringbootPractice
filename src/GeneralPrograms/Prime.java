package GeneralPrograms;

public class Prime {
    public static void primenumbers(int start, int end){
        for(int n=start; n<=end; n++)
        {
            boolean isPrime = true;
            if(n<=1){
                isPrime = false;
            }
            for(int j = 2; j<=n/2; j++)
            {
                if(n%j==0)
                {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime) {
                System.out.print(n+" ");
            }
        }
        System.out.println(" ");
    }
    //T.c = O(under root n)
    public static boolean isPrime(int n)
    {
        if(n<=1)
            return false;
        for(int i=2; i<=Math.sqrt(n); i++)
            if(n%i==0)
                return false;
        return true;
    }
    //T.c = o(n)
    public static boolean isPrime2(int n)
    {
        if(n<=1)
            return false;
        for(int i=2; i<=n/2; i++)
            if(n%i==0)
                return false;
        return true;
    }

    public static void main(String[] args) {
        primenumbers(1,20);
        System.out.println(isPrime(31));
        System.out.println(isPrime2(42));

    }


}
