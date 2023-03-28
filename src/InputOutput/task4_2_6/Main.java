package InputOutput.task4_2_6;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

    }

public static void print(InputStream inputStream, OutputStream outputStream) throws IOException {
    int a;
    while ((a = inputStream.read()) != -1) {
        if (a % 2 == 0) {
            outputStream.write(a);

        }
    }
    outputStream.flush();
}
}