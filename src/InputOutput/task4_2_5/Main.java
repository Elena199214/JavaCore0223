package InputOutput.task4_2_5;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) throws IOException {
        Main main = new Main();
        byte[] original = {1, -2, -3, 4, 5};
        InputStream inputStream = new ByteArrayInputStream(original);

        System.out.println(main.sumOfStream(inputStream));
    }

public int sumOfStream(InputStream inputStream) throws IOException {
    int buff;
    int result = 0;
    while ((buff = inputStream.read()) != -1) {
        result += (byte) buff;
    }
    return result;
}
}
