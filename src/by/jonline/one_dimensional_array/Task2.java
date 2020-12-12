package by.jonline.one_dimensional_array;

import by.jonline.one_dimensional_array.array_manipulation.ArrayFilling;
import java.util.Arrays;

public class Task2 {
    /*
     * 2. Дана последовательность действительных чисел а1 ,а2 ,..., аn. Заменить все
     * ее члены, большие данного Z, этим числом. Подсчитать количество замен.
     */
    public static void main(String[] args) {
        int n = 64;
        int z = 10;
        int aRange = 20;
        int[] a = ArrayFilling.createRandomNaturalArray(n, aRange);

        System.out.println("One-dimensional array. Task 2.");
        System.out.println("Origin array:   " + Arrays.toString(a));

        // Replace all number of a array more then z
        int replaceNumber = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] > z) {
                a[i] = z;
                replaceNumber++;
                // System.out.println(a[i]);
            }
        }
        System.out.println("Replaced array: " + Arrays.toString(a));
        System.out.println("Number of replaced elements: " + replaceNumber);
    }
}
