package LambdaTask.task2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.function.Supplier;

public class Date {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm (EEEE) - dd MMM yyyy");


        Supplier<String> supplier = () -> {
            LocalDateTime localDateTime = LocalDateTime.now();
            return localDateTime.format(formatter);
        };
        System.out.println(supplier.get());
    }
}
