package by.jonline.one_dimensional_array;

import java.util.Arrays;
import by.jonline.one_dimensional_array.array_manipulation.ArrayFilling;

public class Task5 {
    /*
     * 5. Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для
     * которых аi > i.
     */
    public static void main(String[] args) {
        int elementNumber = 10;
        int range = 100;
        int[] a = ArrayFilling.createRandomNaturalArray(elementNumber, range);

        System.out.println("One-dimensional array. Task 5.");
        System.out.println("Origin array:   " + Arrays.toString(a));

        System.out.println("Result");
        for (int i = 0; i < a.length; i++) {
            if (a[i] > i) {
                System.out.print(a[i] + " ");
            }
        }
    }
}
