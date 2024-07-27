package StringPrograms;

public class ReplaceString {
    public static String normailizeString(String s){
        // The trim() function in Java is used to remove leading and trailing whitespace from a string.
        // It doesn’t affect the whitespace in the middle of the string.
        return s.trim().toLowerCase().replace(",","");

    }
    public static void main(String[] args) {
        System.out.println(normailizeString("     Hello, Mr puneet"));

    }
}
