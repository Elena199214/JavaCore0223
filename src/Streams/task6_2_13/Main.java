package Streams.task6_2_13;

import com.sun.org.apache.xerces.internal.impl.io.UTF8Reader;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
public static void main(String[] args) {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in, java.nio.charset.StandardCharsets.UTF_8));
    bufferedReader.lines().flatMap(line -> Stream.of(line.toLowerCase().split("[^a-zа-я0-9]+")))
            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
            .entrySet().stream().sorted(Collections
                    .reverseOrder(
                            Map.Entry.<String, Long>comparingByValue())
                    .thenComparing(Map.Entry.comparingByKey())).limit(10).forEach(e -> System.out.println(e.getKey()));
}
}
