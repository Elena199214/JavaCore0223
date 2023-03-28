package OOP.task2_5_6;

import java.util.Arrays;

public class AsciiCharSequence implements CharSequence {
    private byte[] bytes;
    @Override
    public int length() {
        return bytes.length;
    }
    public AsciiCharSequence(byte[] bytes) {
        this.bytes = bytes;
    }
    @Override
    public char charAt(int index) {
        return (char) bytes[index];
    }
    @Override
    public CharSequence subSequence(int start, int end) {
        return new AsciiCharSequence(Arrays.copyOfRange(bytes, start, end));
    }
    @Override
    public String toString() {
        return new String(bytes);
    }
}
