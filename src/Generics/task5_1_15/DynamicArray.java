package Generics.task5_1_15;

import java.util.ArrayList;
import java.util.Arrays;

public class DynamicArray<T> {
    int size = 0;
    private T[] array = (T[]) new Object[10];

    public DynamicArray() {
        array = array;
    }

    public void add(T el) {
        if (size == array.length - 1) {
            array = Arrays.copyOf(array, array.length * 2);
        }
        array[size++] = el;
    }

    public void remove(int index) {

        if (index >= size || index < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        System.arraycopy(array, index + 1, array, index, array.length - (index + 1));
        array = Arrays.copyOfRange(array, 0, array.length - 1);
        size--;
//        if ((size >= (array.length - 1) / 2)) {
//            array = Arrays.copyOf(array, array.length / 2);
//        }

    }

    public T get(int index) {
        if (index >= size || index < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return array[index];
    }
}
class Test{
    public static void main(String[] args) {

            DynamicArray<Integer> array = new DynamicArray<>();
            array.add(1);
            array.add(2);
            array.add(3);
            array.add(4);
            array.add(5);
            array.add(6);
            array.add(7);
            array.add(8);
            array.add(9);
            array.add(10);
        for (int i = 0; i < 10; i++) {
            System.out.print(array.get(i) + " ");
        }
            array.remove(7);
            array.remove(7);
            array.remove(7);
            array.add(0);
            array.add(1);
            array.add(2);
            array.add(3);
            array.add(4);

            for (int i = 0; i < 11; i++) {
                System.out.print(array.get(i) + " ");
            }
    }
}
