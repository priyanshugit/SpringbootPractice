package StringPrograms;

import java.util.Arrays;

public class StringProgram {
    //Given a string str = "hfjsk6485lop", sort the string and
        public static void main(String[] args) {
            String str = "hfjsk6485lop";
            String digit = "";
            String characters = "";
            char[] chars = str.toCharArray();
            for (char c : chars) {
                if(Character.isDigit(c)){
                    digit += c;
                }
                else if(Character.isLetter(c)){
                    characters += c;
                }
            }
            char[] digits = digit.toCharArray();
            Arrays.sort(digits);
            String digitString = new String(digits);

            char[] chars1 = characters.toCharArray();
            Arrays.sort(chars1);
            String charsString = new String(chars1);
            System.out.println(charsString+digitString);
        }
}
