package StringPrograms;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StringManipulation {

    public static void reverseSentence(String sentence){
        List<String> stringList = Arrays.asList(sentence.split(" "));
        Collections.reverse(stringList);
        System.out.println(stringList.stream().collect(Collectors.joining(" ")));
    }

    public static void reverseEachWordOfSentence(String sentence){
        List<String> stringList = Arrays.asList(sentence.split(" "));
        String rev = stringList.stream().map(word -> new StringBuilder(word).reverse().toString()).collect(Collectors.joining(" "));
        System.out.println(rev);
    }

    public static void reverseSentenceAndEachWord(String sentence){
        List<String> stringList = Arrays.asList(sentence.split(" "));
        Collections.reverse(stringList);
        String reverse = stringList.stream().map(word -> new StringBuilder(word).reverse().toString()).collect(Collectors.joining(" "));
        System.out.println(reverse);
    }

    public static void reversed(String sentence)
    {
        String[] strings = sentence.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        for(int i= strings.length-1; i>=0; i--){
            stringBuilder.append(strings[i]+" ");
        }
        System.out.println(stringBuilder.toString());
    }
    public static void main(String[] args) {
        String str = "My name is John Snow";
        reverseSentence(str);
        reverseEachWordOfSentence(str);
        reverseSentenceAndEachWord(str);
        reversed(str);

    }
}
