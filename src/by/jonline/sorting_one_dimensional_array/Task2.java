package by.jonline.sorting_one_dimensional_array;

import java.util.Arrays;

public class Task2 {
    /*
     * 2. Даны две последовательности a[1]<=a[2]<=...<=a[n] и
     * b[1]<=b[2]<=...<=b[m] Образовать из них новую последовательность чисел так,
     * чтобы она тоже была неубывающей. Примечание. Дополнительный массив не
     * использовать.
     */

    public static int[] arrayProcessing(int[] aArray, int[] bArray) {

        // Create first array
        int[] mainArray;
        int[] additionalArray;
        int addedValue;
        
        if (aArray.length > bArray.length) {
            mainArray = aArray;
            additionalArray = bArray;
        } else {
            mainArray = bArray;
            additionalArray = aArray;
        }
        
        for (int i = 0; i < additionalArray.length; i++) {
            mainArray[i] = mainArray[i] + additionalArray[i];
        }
        
        addedValue = additionalArray[additionalArray.length - 1];
        for (int i = additionalArray.length; i < mainArray.length; i++) {
            mainArray[i] = mainArray[i] + addedValue;
        }
        
        return mainArray;
        
    }

    public static int[] createArray(int minRange, int maxRange) {
        
        maxRange++;
        
        int range = Math.abs(maxRange - minRange);
        int[] result = new int[range];
        int count = minRange;
        
        for (int i = 0; i < result.length; i++) {
            result[i] = count++;
        }
        
        return result;
    }

    /*
     * Test function
     */
    public static void main(String[] args) {

        int[][] aArrayMatrix = new int[9][0];
        int[][] bArrayMatrix = new int[9][0];
        
        int[] result;
        boolean validResult;
        
        aArrayMatrix[0] = Task2.createArray(-5, 5); 
        bArrayMatrix[0] = Task2.createArray(0, 6); 
        
        aArrayMatrix[1] = Task2.createArray(0, 5);  
        bArrayMatrix[1] = Task2.createArray(-5, 5);
        
        aArrayMatrix[2] = Task2.createArray(0, 5);  
        bArrayMatrix[2] = Task2.createArray(0, 5);
        
        aArrayMatrix[3] = Task2.createArray(-4, 3);  
        bArrayMatrix[3] = Task2.createArray(-5, 5);
        
        aArrayMatrix[4] = Task2.createArray(-5, -1);  
        bArrayMatrix[4] = Task2.createArray(-5, -1);
        
        aArrayMatrix[5] = Task2.createArray(2, 10);  
        bArrayMatrix[5] = Task2.createArray(-2, 2);
        
        aArrayMatrix[6] = Task2.createArray(-5, 5); 
        bArrayMatrix[6] = Task2.createArray(0, 10); 
        
        aArrayMatrix[7] = Task2.createArray(-5, 5); 
        bArrayMatrix[7] = Task2.createArray(0, 6); 
        
        aArrayMatrix[8] = Task2.createArray(-5, -2); 
        bArrayMatrix[8] = Task2.createArray(1, 4);
        
        System.out.println("One-dimensional array. Sorting. Task 2.");
        for (int i = 0; i < aArrayMatrix.length; i++) {
            
            System.out.println("A array: " + Arrays.toString(aArrayMatrix[i]));
            System.out.println("B array: " + Arrays.toString(bArrayMatrix[i]));

            result = Task2.arrayProcessing(aArrayMatrix[i], bArrayMatrix[i]);
            
            // Check result
            validResult = true;
            for (int j = result.length - 1; j > 0; j--) {
                if (result[j] < result[j - 1]) {
                    validResult = false;
                    break;
                }
            }
            
            System.out.println("Result array: \n" + Arrays.toString(result));
            System.out.println("Valid result: " + validResult + "\n");
        }

        System.out.println();
    }

}
