package OOP.task2_1_10;

import java.util.Arrays;
import java.util.Objects;

public class ComplexNumber {
public static void main(String[] args) {
    ComplexNumber complexNumber = new ComplexNumber(1.1, 2.0);
    ComplexNumber complexNumber2 = new ComplexNumber(1.1, 2.0);
    System.out.println(complexNumber.hashCode());
    System.out.println(complexNumber2.hashCode());
}

private double re;
private double im;

@Override
public boolean equals(Object o) {
    if (this == o) {
        return true;

    }
    if ((o == null || getClass() != o.getClass())) {
        return false;
    }
    ComplexNumber that = (ComplexNumber) o;
    return Double.compare(that.getRe(), getRe()) == 0 && Double.compare(that.getIm(), getIm()) == 0;
}

    @Override
//    public int hashCode() {
//        return java.util.Objects.hash(getRe(), getIm());
        public int hashCode () {
        int result = 0;
        int param1 = (int) re;
        int param2 = (int) im;
        result = result * 31 + param1 >>> 32;
        result = result * 31 + param2 >>> 32;
        return result;
        }


public ComplexNumber() {
}

public ComplexNumber(double re, double im) {
    this.re = re;
    this.im = im;
}

public double getRe() {
    return re;
}

public double getIm() {
    return im;
}

}


