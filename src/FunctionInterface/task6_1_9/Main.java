package FunctionInterface.task6_1_9;

import java.util.function.UnaryOperator;

public class Main {
public UnaryOperator<Integer> sqrt() {
    return i -> i * i;
}

}
