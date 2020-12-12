package by.jonline.one_dimensional_array;

import java.util.Arrays;

public class Task8 {
    /*
     * 8. Дана последовательность целых чисел (a1,a2,...,an).  
     * Образовать новую последовательность, выбросив из исходной те члены, 
     * которые равны  min(a1, a2, ... an)
     */
    public static void main(String[] args) {
        double[] a = { 6, 4, 39, 53, 4, 21, 75, 14, 78, 87 };

        System.out.println("One-dimensional array. Task 8.");
        System.out.println("Origin array: " + Arrays.toString(a));

        // Find minimum value
        double minValue = Double.POSITIVE_INFINITY;
        int minNumber = 0;
        for (double element : a) {
            if (element < minValue) {
                minValue = element;
                minNumber = 0;
            }
            if (element == minValue) {
                minNumber++;
            }
        }
        
        // Create new array without min value
        int numberElementWithoutMin = a.length - minNumber;
        double[] result = new double[numberElementWithoutMin];
        int resultCnt = 0;
        for (double element : a) {
            if (minValue != element) {
                result[resultCnt] = element;
                resultCnt++;
            }
        }

        System.out.println("Result:       " + Arrays.toString(result));
    }
}
