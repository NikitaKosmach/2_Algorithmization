package by.jonline.one_dimensional_array;

import java.util.Arrays;
//import by.jonline.one_dimensional_array.array_manipulation.*;

public class Task7 {
    /*
     * 7. Даны действительные числа a1, a2, a3, ... a(2*n). Найти:
     *          max(a1+a(2*n), a2 + a(2*n-1), ..., a(n) + a(n+1))
    */
    public static void main(String[] args) {
        //int elementNumber = 10;
        //int range = 100;
        //int[] a = ArrayFilling.createRandomRealArray(elementNumber, range);
        double[] a = {6, 4, 39, 53, 4, 21, 75, 14, 78, 87};
        
        System.out.println("One-dimensional array. Task 7.");
        System.out.println("Origin array:   " + Arrays.toString(a));
        
        int stepsNumber = a.length / 2;
        int endedStep = a.length - 1;
        double result = Double.NEGATIVE_INFINITY;
        for (int i = 0; i < stepsNumber; i++) {
            double tempSum = a[i] + a[endedStep - i]; 
            if (tempSum > result) {
                result = tempSum;
            }
        }
        System.out.println("Result: " + result);
    }
}
