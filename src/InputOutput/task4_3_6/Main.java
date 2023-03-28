package InputOutput.task4_3_6;

import java.io.*;
import java.nio.charset.Charset;

public class Main {
public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
    StringBuilder s = new StringBuilder();
    Reader reader = new InputStreamReader(inputStream,charset);
    int c;
    while ((c = reader.read()) != -1) {
        s.append((char) c);
    }
    return s.toString();
}
}
