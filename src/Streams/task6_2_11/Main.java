package Streams.task6_2_11;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static IntStream pseudoRandomStream(int seed) {
        return IntStream.iterate((seed), (x -> x * x / 10 % 1000));
    }
}
