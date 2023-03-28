package BaseJava;

import java.util.Arrays;

/**
 * Напишите программу, которая принимает на вход количество мониторов купленных компанией и количество программистов в ней,
 * а возвращает количество мониторов, которые никому не достанутся.
 * 1) Сигнатура метода содержит только примитивные типы размерностью в 32 бита
 * 2) Название метода должно быть drawisMonitorsCounter
 * 3) Метод должен быть виден из любого пакета
 * 4) Сигнатура метода должна быть: drawisMonitorsCounter(int monitors, int programmers)
 */

public class Task1_2 {
    public static void main(String[] args) {
        Task1_2 task = new Task1_2();

//         printArray(new int[]{1, 2, 3, 4, 5, 5, 6, 7, 7});
//         printArray(new int[]{});
         System.out.print(Arrays.toString(getSubArrayBetween(new int[]{1, 2, 3, 4, 5, 5, 6, 7, 7}, 4, 6)));
         System.out.print(Arrays.toString(getSubArrayBetween(new int[]{1, 2, 3, 4, 5, 5, 6, 7, 7}, 0, 3)));
//        System.out.println(Arrays.toString(getArrayMiddle(new int[]{1, 2, 3, 4})));
//        System.out.println(Arrays.toString(getArrayMiddle(new int[]{1, 2, 3, 4,5})));
//        System.out.println(Arrays.toString(getArrayMiddle(new int[]{1, 2})));
//        System.out.println(Arrays.toString(getArrayMiddle(new int[]{0})));


        int[] numbers = {13,-25,-13,91,99};
        int[] numbers2 = {1, 1, 1, 1, 1, 1, 1};
        int[] numbers3 = null;
        int[] numbers4 = new int[0];
        int[] numbers5 = {};
        int[] numbers6 = {1, 5, 2, 17};
        int[] numbers7 = {14, 16, 4};
        int[] numbers8 = null;

//        System.out.println(Arrays.toString(mergeAndSort(numbers)));
//        System.out.println(Arrays.toString(mergeAndSort(numbers2, n)));
//            System.out.println(Arrays.toString(mergeAndSort2(numbers4, numbers5)));
//            System.out.println(Arrays.toString(mergeAndSort2(numbers5, numbers6)));
//            System.out.println(Arrays.toString(mergeAndSort2(numbers6, numbers7)));
//            System.out.println(Arrays.toString(mergeAndSort2(numbers7, numbers2)));
//
//        printOddNumbers(numbers);
//        printOddNumbers(numbers2);
//        printOddNumbers(numbers4);
//        printOddNumbers(numbers7);
         //getArrayMiddle(numbers3);
//        getArrayMiddle(numbers4);
//        getArrayMiddle(numbers5);
//        getArrayMiddle(numbers6);
//        getArrayMiddle(numbers7);
//        System.out.println(Arrays.toString(mergeAndSort((new int[]{}), new int[]{})));
//        System.out.println(numbers7.length/2);
     //   System.out.println(BigDecimal.valueOf(0.1).add(BigDecimal.valueOf(0.9)));
    }


    public static int drawisMonitorsCounter(int monitors, int programmers) {
        return monitors % programmers;
    }

//public static BigInteger factorial(int value) {
//
//    BigInteger fact = BigInteger.valueOf(1);
//    for (int i = 1; i <= value; i++) {
//
//        fact = fact.multiply(BigInteger.valueOf(i));
//    }
//    return fact;
//}

    public int determineGroup(int age) {

        if ((age >= 7) && (age <= 13)) {
            return 1;
        } else if ((age >= 14) && (age <= 17)) {
            return 2;
        } else if ((age >= 18) && (age <= 65)) {
            return 3;
        } else {
            return -1;
        }
    }

public static void printArray(int[] numbers) {
    System.out.print("[");
    for (int i = 0; i < numbers.length; i++) {
        System.out.print(numbers[i]);
        if (i == numbers.length - 1) {
            break;
        } else {
            System.out.print(", ");
        }
    }
    System.out.print("]");
}
    //            if (numbers.length == 0) {
//                System.out.println("[]");
//                return;
//            }
    public static int[] getSubArrayBetween(int[] numbers, int start, int end) {

        int count = 0;
        for (int num : numbers) {
            if ((num >= start) && (num <= end)) {
                count++;
            }
        }
        int[] arrayNum = new int[count];
        count = 0;
        for (int num : numbers) {
            if ((num >= start) && (num <= end) && (count < arrayNum.length)) {
                arrayNum[count++] = num;
               // count++;
            }
        }
        return arrayNum;
    }


public static int[] getArrayMiddle(int[] numbers) {
    if (numbers.length == 0) {
        return new int[0];
    }
    if (numbers.length % 2 == 0) {
        return new int[]{numbers[numbers.length / 2 - 1], numbers[numbers.length / 2]};
    }
    return new int[]{numbers[numbers.length / 2]};
}

//

    //    if (numbers.length == 0 || numbers == null) {
//        return new int[0];
//    }
//    if (numbers.length % 2 == 0) {
//        return new int[]{numbers.length / 2, numbers.length / 2 + 1};
//    } else {
//        return new int[]{numbers.length / 2 + 1};
//    }
//
//}
//
//        int size = (numbers.length % 2 == 0) ? 2 : 1;
//        if (size == 1) {
//            index = numbers.length / 2;
//        }
//        if (size == 2) {
//            index = numbers.length / 2 - 1;
//        }
//        int[] arrayNum = new int[size];
//        if (size == 1) {
//            arrayNum[0] = numbers[index];
//            return arrayNum;
//        }
//
//        if (size == 2) {
//            arrayNum[0] = numbers[index];
//            arrayNum[1] = numbers[index + 1];
//        }
//
//        return arrayNum;
//    }
    public static int[] inverseArray(int[] numbers) {
        int index = 0;
        int[] reverse = new int[numbers.length];
        for (int i = numbers.length - 1; i >= 0; i--) {
            reverse[index] = numbers[i];
            index++;
        }
        return reverse;
    }

//        public static int[] mergeAndSort ( int[] firstArray, int[] secondArray){
//            int[] array = new int[firstArray.length + secondArray.length];
//            for (int i = 0; i < firstArray.length; i++) {
//                array[i] = firstArray[i];
//            }
//            for (int i = 0; i < secondArray.length; i++) {
//                array[i + firstArray.length] = secondArray[i];
//            }
//            if (array.length == 0 || array.length == 1) {
//                return array;
//            }
//            int index = 0;
//            int temp = 0;
//            for (int i = 0; i < array.length; i++) {
//                int min = array[i];
//                for (int j = i; j < array.length; j++) {
//                    if (array[j] < min) {
//                        min = array[j];
//                        index = j;
//                    }
//                }
//                temp = array[i];
//                array[i] = min;
//                array[index] = temp;
//            }
//            return array;
//        }

    public static int[] mergeAndSort2(int[] firstArray, int[] secondArray) {
        int[] array = new int[firstArray.length + secondArray.length];
        System.arraycopy(firstArray, 0, array, 0, firstArray.length);
        System.arraycopy(secondArray, 0, array, 0 + firstArray.length, secondArray.length);

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }

    public static int[] mergeAndSort(int[] firstArray, int[] secondArray) {
        int[] array = new int[firstArray.length + secondArray.length];
        System.arraycopy(firstArray, 0, array, 0, firstArray.length);
        System.arraycopy(secondArray, 0, array, 0 + firstArray.length, secondArray.length);
        Arrays.sort(array);
        return array;
    }

//    public static void printArray(int[] numbers) {
//        System.out.println(Arrays.toString(numbers));
//    }

//    public static int[] getArrayMiddle(int[] numbers) {
//        if (numbers.length == 0) {
//            return new int[0];
//        }
//        return Arrays.copyOfRange(numbers, (numbers.length) % 2 == 0 ? (numbers.length / 2 - 1) : (numbers.length / 2), numbers.length / 2 + 1);
//    }

public static void printOddNumbers(int[] arr) {
    if (arr.length == 0) {
        System.out.println("");
        return;
    } else {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                str.append(arr[i] + ",");
            }
        }
        if (str.length() == 0) {
            System.out.print("");
            return;
        }
        int index = str.lastIndexOf(",");
        str = str.deleteCharAt(index);
        System.out.println(str);
    }
}
}










