package by.jonline.sorting_one_dimensional_array;

import java.util.Arrays;

public class Task1 {
    /*
     * 1. Заданы два одномерных массива с различным количеством элементов и
     * натуральное число k. Объединить их в один массив, включив второй массив между
     * k-м и (k+1) - м элементами первого, при этом не используя дополнительный
     * массив.
     */
     
    public static double[] arrayProcessing(int k, int aArrayLength, int bArrayLength) {
     
        // Create first array
        int firstArrayLength = aArrayLength + bArrayLength;
        double firstArray[] = new double[firstArrayLength];
        double secondArray[] = new double[bArrayLength];
        int MAX_RANDOM = 10;
        
        k++;
        
        if (k > aArrayLength) {
            System.out.println("k is not valid. k shold be less, than aArrayLength.");
            k--;
            System.out.println("k : " + "; aArrayLength: " + aArrayLength);
            return firstArray;
        }
        
        // Fill first array
        for (int i = 0; i < aArrayLength; i++) {
            firstArray[i] = Math.round((Math.random() * MAX_RANDOM * 1000)) / 1000.0;
        }
        for (int i = aArrayLength; i < firstArray.length; i++) {
            firstArray[i] = Double.NaN;
        }
           
        // Fill second array   
        for (int i = 0; i < secondArray.length; i++) {
            secondArray[i] = Math.round((Math.random() * MAX_RANDOM * 1000)) / 1000.0;
        }   
           
        System.out.println("First array: " + Arrays.toString(firstArray));
        System.out.println("Second array: " + Arrays.toString(secondArray));
        
        // Shift first vector
        for (int i = k; i < aArrayLength; i++) {
            firstArray[i + bArrayLength] = firstArray[i]; 
        } 
        
        // Insert second array
        for (int i = k; i < k + bArrayLength; i++) {
            firstArray[i] = secondArray[i - k];
        }
         
        return firstArray;
           
    }
     
    /*
     * Test function
     */
    public static void main(String[] args) {

        int[] k = { 5, 5, 4 };
        int[] aArrayLength = { 15, 5, 5 };
        int[] bArrayLength = { 10, 2, 3 };
        double[] result;
        
        System.out.println("One-dimensional array. Sorting. Task 1.");
        for (int i = 0; i < k.length; i++) {
            System.out.println("k: " + k[i]);
            System.out.println("A array length: " + aArrayLength[i]);
            System.out.println("B array length: " + bArrayLength[i]);
            
            result = Task1.arrayProcessing(k[i], aArrayLength[i], bArrayLength[i]);
            System.out.println("Result: \n" + Arrays.toString(result));
        }
        
        System.out.println();
    }

}
