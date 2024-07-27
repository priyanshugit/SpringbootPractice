package StringPrograms;
public class ToggleString {
    public static void toogleString(String input) {
       StringBuilder toggleString = new StringBuilder();
       for(char c : input.toCharArray()) {
           if(Character.isUpperCase(c)) {
               toggleString.append(Character.toLowerCase(c));
           } else if (Character.isLowerCase(c)) {
               toggleString.append(Character.toUpperCase(c));
           }
           else
               toggleString.append(c);
       }
       System.out.println(toggleString.toString());
    }
    public static void main(String[] args) {
        toogleString("Hello World");
    }
}
