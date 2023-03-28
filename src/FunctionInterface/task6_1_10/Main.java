package FunctionInterface.task6_1_10;

import java.util.function.UnaryOperator;

public class Main {

    public static NumberGenerator<? super Number> getGenerator() {
        return i -> i.intValue() > 0;
    }
}
