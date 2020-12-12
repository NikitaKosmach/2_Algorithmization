package by.jonline.one_dimensional_array;

import by.jonline.one_dimensional_array.array_manipulation.ArrayFilling;

public class Task1 {
    /*
     * 1. В массив A [N] занесены натуральные числа. Найти сумму тех элементов,
     * которые кратны данному К
     */
    public static void main(String[] args) {
        int n = 64;
        int k = 5;
        int aRange = 10000;
        int[] a = ArrayFilling.createRandomNaturalArray(n, aRange);

        int sumOfmultiplesK = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] % k == 0) {
                sumOfmultiplesK += a[i];
                // System.out.println(a[i]);
            }
        }
        System.out.println("One-dimensional array. Task 1. Sum :" + sumOfmultiplesK);
    }

}
