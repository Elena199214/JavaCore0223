package InputOutput.task4_3_7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double result = 0.0;
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            if (scanner.hasNextDouble()) {
                result = Double.sum(result, scanner.nextDouble());
            } else {
                scanner.next();
            }
        }
        System.out.println(String.format("%.6f", result));
    }
}
