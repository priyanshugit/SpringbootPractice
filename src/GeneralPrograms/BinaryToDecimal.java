package GeneralPrograms;

public class BinaryToDecimal {
    //T.C = 0(n)
    public static String BinaryToDecimal(String binary) {
     int decimalvalue = 0;
     for(int i=0; i<binary.length(); i++) {
         char c = binary.charAt(i);
         if(c == '1') {
             decimalvalue += Math.pow(2, binary.length() - i - 1);
         }

     }
     return String.valueOf(decimalvalue);
    }
    public static void main(String[] args) {
        System.out.println(BinaryToDecimal("1001"));

    }
}
