package Generics.task5_1_12;

public class Box<T> {
    private T object;

    public <T>Box<T> getBox() {
        return new Box<>();
    }
}
