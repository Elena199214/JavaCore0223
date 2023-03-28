package Streams;

import static java.lang.Math.sqrt;

public class Test {
    public static void main(String[] args) {
        System.out.println(parseAndSqrt("64"));
    }

    public static long parseAndSqrt(String number) {
//        Long l = Long.parseLong(number);
//        return Math.round(sqrt(l));
        return Math.round(Math.sqrt(Long.parseLong(number)));
    }
}
