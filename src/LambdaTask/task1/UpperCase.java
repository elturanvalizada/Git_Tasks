package LambdaTask.task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class UpperCase {
    public static void main(String[] args) {

        List<String> words = Arrays.asList("Elturan", "Nadir", "Elnur", "Elgun");

        Consumer<String> consumer = s -> System.out.println(s.toUpperCase());
        words.forEach(consumer);


    }

}
