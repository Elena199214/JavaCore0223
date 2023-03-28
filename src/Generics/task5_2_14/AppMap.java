package Generics.task5_2_14;

import javafx.scene.transform.Scale;

import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AppMap {
public static Map<String, Long> getSalesMap(Reader reader) throws IOException {
    Map<String, Long> map = new HashMap<>();
    Scanner scanner = new Scanner(reader);
    String key;
    long value;
    while (scanner.hasNext()) {
        key = scanner.next();
        value = scanner.nextLong();
        map.merge(key, value, Long::sum);
    }
    return map;
}

}
