package Streams.task6_2_15;

import java.math.BigInteger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
       BigInteger bigInteger= IntStream.rangeClosed(1, 5).mapToObj(BigInteger::valueOf).reduce(BigInteger::multiply).get();
        System.out.println(bigInteger);
    }

public static BigInteger factorial(int value) {
    if (value < 2) {
        return BigInteger.valueOf(1);
    }
    return IntStream.rangeClosed(2, value).mapToObj(BigInteger::valueOf).reduce(BigInteger::multiply).get();
}

}
