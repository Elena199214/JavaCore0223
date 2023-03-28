package Streams.task6_2_14;

import java.util.*;
import java.util.function.Consumer;

public class MailService<T> implements Consumer<Sendable<T>> {

    HashMap<String, List<T>> map = new HashMap<String, List<T>>() {

        @Override
        public List<T> get(Object key) {
            return (super.get(key) == null) ? Collections.EMPTY_LIST : (List<T>) super.get(key);
        }
    };


    public HashMap<String, List<T>> getMailBox() {

        return map;
    }

    @Override
    public Consumer andThen(Consumer after) {
        return Consumer.super.andThen(after);
    }

    @Override
    public void accept(Sendable<T> sendable) {
        map.computeIfAbsent(sendable.getTo(), k -> new ArrayList<>()).add(sendable.getContent());
    }
}
