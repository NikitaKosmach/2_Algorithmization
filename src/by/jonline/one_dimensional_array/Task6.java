package by.jonline.one_dimensional_array;

import java.util.Arrays;
//import by.jonline.one_dimensional_array.array_manipulation.*;

public class Task6 {
    /*
     * 6. Задана последовательность N вещественных чисел. Вычислить сумму чисел,
     * порядковые номера которых являются простыми числами.
     */
    public static void main(String[] args) {
        // int elementNumber = 10;
        // int range = 100;
        // int[] a = ArrayFilling.createRandomNaturalArray(elementNumber, range);
        int[] a = { 6, 4, 39, 53, 4, 21, 75, 14, 78, 87 };

        System.out.println("One-dimensional array. Task 6.");
        System.out.println("Origin array:   " + Arrays.toString(a));

        int[] indexA = new int[a.length];
        char[] isPrimality = new char[a.length];
        int result = 0;
        for (int i = 0; i < a.length; i++) {
            if (Task6.isPrimality(i)) {
                result += a[i];
                isPrimality[i] = '1';
            } else {
                isPrimality[i] = '0';
            }
            indexA[i] = i;
        }
        System.out.println("Index array:    " + Arrays.toString(indexA));
        System.out.println("Index array:    " + Arrays.toString(isPrimality));

        System.out.println("Result: " + result); // result: 127
    }

    public static boolean isPrimality(long n) {
        if (n < 2) {
            return false;
        }
        if ((n == 2) || (n == 3)) {
            return true;
        }
        if ((n % 2 == 0) || (n % 3 == 0)) {
            return false;
        }
        long sqrtN = (long) Math.sqrt(n) + 1;
        for (long i = 6L; i <= sqrtN; i += 6) {
            if ((n % (i - 1) == 0) || (n % (i + 1) == 0)) {
                return false;
            }
        }
        return true;
    }
}
