package Streams.task6_2_14;

import java.util.List;
import java.util.Map;

public interface Sendable <T> {
        String getFrom();
        String getTo();
        T getContent();
}
