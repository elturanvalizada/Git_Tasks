package LambdaTask.task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class WordLength {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Elturan", "Nadir", "Elnur", "Elgun");


        Function<String, Integer> function = word -> word.length();

        List<Integer> wordsLengths = new ArrayList<>();

        for (String word : words) {
            wordsLengths.add(function.apply(word));
        }

        System.out.println(words);
        System.out.println("--------------");
        System.out.println(wordsLengths);


    }

//    public static void findWordLengths(List<String> wordLength) {
//        for (String words : wordLength) {
//            System.out.println(words.length());
//        }
//    }
}
