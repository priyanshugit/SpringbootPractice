package StringPrograms;

import java.util.StringTokenizer;

public class MinMaxWord {

        public static void main(String[] args) {
            String sentence = "Write a program in Java to find minimum and maximum word in a sentence";
            findMinMaxWords(sentence);
        }

        public static void findMinMaxWords(String sentence) {
            StringTokenizer st = new StringTokenizer(sentence, " ");
            while (st.hasMoreTokens()) {
                String token = st.nextToken();
                System.out.println(token);
            }
            String minWord = null;
            String maxWord = null;


            while (st.hasMoreTokens()) {
                String word = st.nextToken();
                if (minWord == null || word.length() < minWord.length()) {
                    minWord = word;
                }
                if (maxWord == null || word.length() > maxWord.length()) {
                    maxWord = word;
                }
            }

            System.out.println("Minimum word: " + minWord);
            System.out.println("Maximum word: " + maxWord);
        }
    }


