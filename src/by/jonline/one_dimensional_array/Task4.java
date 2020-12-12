package by.jonline.one_dimensional_array;

import java.util.*;
import by.jonline.one_dimensional_array.array_manipulation.ArrayFilling;

public class Task4 {
    /*
     * 4. Даны действительные числа а1 ,а2 ,..., аn. Поменять местами наибольший и
     * наименьший элементы
     */
    public static void main(String[] args) {

        int elementNumber = 10;
        int range = 100;
        double[] a = ArrayFilling.createRandomRealArray(elementNumber, range);

        // double[] a = {-1, 2, -1, 2, 0, 1};

        // double[] a = new double[5];

        System.out.println("One-dimensional array. Task 4.");
        System.out.println("Origin array:   " + Arrays.toString(a));

        // Find max and min value of array
        double maxValue = a[0];
        double minValue = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > maxValue) {
                maxValue = a[i];
            }
            if (a[i] < minValue) {
                minValue = a[i];
            }
        }

        // Find and change position of max and min value
        ArrayList<Integer> maxPosition = new ArrayList<Integer>();
        ArrayList<Integer> minPosition = new ArrayList<Integer>();
        for (int i = 0; i < a.length; i++) {
            if (a[i] == maxValue) {
                maxPosition.add(i);
                a[i] = minValue;
            } else if (a[i] == minValue) {
                minPosition.add(i);
                a[i] = maxValue;
            }
        }

        if (maxValue == minValue) {
            minPosition = maxPosition;
        }

        System.out.println("max value:" + maxValue + "; max position: " + maxPosition.toString());
        System.out.println("min value:" + minValue + "; min position: " + minPosition.toString());
        System.out.println("Replaced array: " + Arrays.toString(a));
    }
}
