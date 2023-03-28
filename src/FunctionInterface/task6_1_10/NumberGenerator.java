package FunctionInterface.task6_1_10;
@FunctionalInterface
public interface NumberGenerator <T extends Number> {
    boolean cond(T arg);
}
