package by.jonline.one_dimensional_array;

import java.util.Arrays;

import by.jonline.one_dimensional_array.array_manipulation.ArrayMath;

import java.util.ArrayList;

public class Task9 {
    /*
     * 9. В массиве целых чисел с количеством элементов n найти наиболее часто
     * встречающееся число. Если таких чисел несколько, то определить наименьшее из
     * них
     */
    public static void main(String[] args) {
        int[] a = { 6, 4, 39, 53, 4, 21, 75, 14, 78, 87, 5, 5, 8, 8 };
        ArrayList<Integer> repetitionNumber = new ArrayList<Integer>();
        ArrayList<Integer> uniqueNumber = new ArrayList<Integer>();

        System.out.println("One-dimensional array. Task 9.");
        System.out.println("Origin array: " + Arrays.toString(a));

        // Find number of repetition
        for (int element : a) {
            if (!uniqueNumber.contains(element)) {
                uniqueNumber.add(element);
                repetitionNumber.add(1);
            } else {
                int index = uniqueNumber.indexOf(element);
                int tempRepetitionNumber = repetitionNumber.get(index);
                tempRepetitionNumber++;
                repetitionNumber.set(index, tempRepetitionNumber);
            }
        }
        System.out.println("unique :       " + uniqueNumber.toString());
        System.out.println("repetition :   " + repetitionNumber.toString());

        // Find most repetition element
        ArrayList<Integer> frequentlyValuePosition = ArrayMath.findMaxPosition(repetitionNumber);
        ArrayList<Integer> frequentlyValue = new ArrayList<Integer>(frequentlyValuePosition.size());
        for (int element : frequentlyValuePosition) {
            frequentlyValue.add(uniqueNumber.get(element));
        }

        // Find minimum in frequently values
        int result = ArrayMath.findMinInArray(frequentlyValue);
        System.out.println("Result :   " + result);
    }
}
