package Generics.task5_2_13;

import java.util.HashSet;

public class AppSet {

    public static void main(String[] args) {
        java.util.Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);


        java.util.Set<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(4);
        set2.add(5);

        System.out.println(symmetricDifference(set,set2));

    }

public static <T> java.util.Set<T> symmetricDifference(java.util.Set<? extends T> set1, java.util.Set<? extends T> set2) {
    java.util.Set<T> setNew1 = new HashSet<>(set1);
    java.util.Set<T> setNew2 = new HashSet<>(set2);

    setNew2.removeAll(set1);
    setNew1.removeAll(set2);
    setNew2.addAll(setNew1);

    return setNew2;
}

}