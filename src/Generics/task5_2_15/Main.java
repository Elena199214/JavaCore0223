package Generics.task5_2_15;

import java.util.*;

public class Main {
public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    Deque<Integer> deque = new ArrayDeque<>();
    int count = 1;
    while (scanner.hasNext()) {
        if (count % 2 == 0) {
            deque.addFirst(scanner.nextInt());
            count++;
        } else {
            scanner.next();
            count++;
        }
    }
        System.out.println(Arrays.toString(deque.toArray()).replaceAll("[\\[\\],]", ""));
    }
    }


