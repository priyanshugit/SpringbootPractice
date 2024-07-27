package GeneralPrograms;

public class DecimalToBinary {
    //Time Complexity: O(log2(n))
    public static String decimalToBinary(int num) {
        if(num == 0)
            return "0";
        StringBuilder sb = new StringBuilder();
        while (num != 0) {
            sb.insert(0,num % 2);
            num = num/2;
            System.out.println(sb.toString());
        }
        return sb.toString();
    }
    // Time complexity : O(logn)
    public static String decimalToBinaryBitwise(int num) {
        if(num == 0)
            return "0";
        StringBuilder sb = new StringBuilder();
        while(num >0){
            int lastbit = num&1;
            num = num>>1;
            sb.insert(0,lastbit);
            System.out.println(num);
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println(decimalToBinary(8));
        System.out.println(decimalToBinaryBitwise(8));
        System.out.println(Integer.toBinaryString(8));
    }
}
