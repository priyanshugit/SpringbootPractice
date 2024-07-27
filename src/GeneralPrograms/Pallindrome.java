package GeneralPrograms;

public class Pallindrome {
    public static void checkPallindrome(String input) {
        int length = input.length();
        int size = (length / 2) + 1;
        int truecounter = 0;
        for (int i = 0; i < size; i++) {
            if (input.charAt(i) == input.charAt(length - 1)) {
                length--;
                truecounter++;
            }
        }
        if (truecounter == size) {
            System.out.println("Pallindrome");
        } else
            System.out.println("Not Pallindrome");
    }
    public static void main(String[] args) {
        checkPallindrome("NAMAN");

    }
}
