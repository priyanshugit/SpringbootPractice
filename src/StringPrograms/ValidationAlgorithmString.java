package StringPrograms;

public class ValidationAlgorithmString {
    public static boolean isUpperCase(String s) {
       return s.chars().allMatch(Character::isUpperCase);
    }
    public static boolean isLowerCase(String s){
        return s.chars().allMatch(Character::isLowerCase);
    }
    public static boolean isPasswordComplex(String s){
        return s.chars().anyMatch(Character::isDigit) &&
                s.chars().anyMatch(Character::isLowerCase) &&
                s.chars().anyMatch(Character::isUpperCase) &&
                s.chars().anyMatch(p -> !Character.isLetterOrDigit(p)) &&
                s.length() >8;


    }
    public static void main(String[] args) {
        System.out.println(isUpperCase("Hello"));
        System.out.println(isUpperCase("HELLO"));
        System.out.println(isLowerCase("hello"));
        System.out.println(isLowerCase("HELLO"));
        System.out.println(isPasswordComplex("H$124"));
        System.out.println(isPasswordComplex("Hello$124"));
    }
}
