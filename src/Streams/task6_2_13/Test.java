package Streams.task6_2_13;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in, StandardCharsets.UTF_8));
       // bufferedReader.lines().map(e -> { e.toLowerCase().replaceAll("[\\p{Punct}]+", " ").split(" ");
        bufferedReader.lines().flatMap(line -> Stream.of(line.split("(?U)[^\\p{L}\\p{Digit}]+")).map(e ->e.toLowerCase()))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().sorted(Collections
                        .reverseOrder(
                                Map.Entry.<String, Long>comparingByValue())
                        .thenComparing(Map.Entry.comparingByKey())).limit(10)

                .forEach(e-> System.out.println(e.getKey()));

    }
}
