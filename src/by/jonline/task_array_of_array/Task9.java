package by.jonline.task_array_of_array;

import java.util.ArrayList;
import java.util.Arrays;

import by.jonline.task_array_of_array.matrix_manipulation.PrintMatrix;
import by.jonline.one_dimensional_array.array_manipulation.ArrayMath;

public class Task9 {
    /*
     * 9. Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом
     * столбце. Определить, какой столбец содержит максимальную сумму.
     */
    public static void evaluateColumns(int[][] matrix) {

        int[] sumVector = new int[matrix[0].length];
        ArrayList<Integer> maxPosition;
        int maxValue;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sumVector[j] += matrix[i][j];
            }            
        }
        System.out.println("Sum of element in columns:\n" + Arrays.toString(sumVector));
        
        maxValue = ArrayMath.findMaxInArray(sumVector);
        maxPosition = ArrayMath.compare(maxValue, sumVector);
        System.out.println("Max sum of columns: " + maxValue);
        System.out.println("Position of max sum of columns: " + maxPosition.toString());
        
        System.out.println("\n");
    }

    /*
     * Test function
     */
    public static void main(String[] args) {

        ArrayList<int[][]> fullMatrices = new ArrayList<int[][]>();
        int[][] matrix1 = { { 20, 2, 30, 4, 4 }, 
                            { 1, 2, 3, 4, 5 }, 
                            { 1, 2, 3, 4, 5 }, 
                            { 1, 2, 3, 4, 5 },
                            { 1, 2, 3, 4, 5 } };

        int[][] matrix2 = { { 1, 2, 3, 4, 4 }, 
                            { 1, 80, 3, 4, 5 }, 
                            { 1, 2, 90, 4, 5 }, 
                            { 1, 2, 3, 80, 5 },
                            { 1, 2, 3, 4, 8 } };

        int[][] matrix3 = { { 2, 6, 30, 1, 42 }, 
                            { 1, 2, 3, 4, 100 }, 
                            { 1, 48, 3, 4, 5 }, 
                            { 45, 2, 3, 4, 5 },
                            { 1, 2, 3, 4, 5 } };

        int[][] matrix4 = { { 2, 6, 30, 1 }, 
                            { 1, 2, 3, 4 }, 
                            { 1, 48, 3, 4 }, 
                            { 45, 2, 3, 4 }, 
                            { 1, 2, 3, 4 } };

        int[][] matrix5 = { { 2, 6, 30, 1 }, 
                            { 1, 2, 3, 4 }, 
                            { 1, 48, 3, 4 }, 
                            { 45, 2, 3, 4 } };
        int[][] matrix6 = { {  2,  6, 30, 1, 50 }, 
                            {  1,  2,  3, 4,  2 }, 
                            {  1, 48,  3, 4,  2 }, 
                            { 45,  2,  3, 4,  4 } };

        fullMatrices.add(matrix1);
        fullMatrices.add(matrix2);
        fullMatrices.add(matrix3);
        fullMatrices.add(matrix4);
        fullMatrices.add(matrix5);
        fullMatrices.add(matrix6);

        System.out.println("Tasks. Arrays of arrays. Task 9.");
        for (int[][] element : fullMatrices) {
            System.out.println("Origin matrix: ");
            PrintMatrix.print(element);

            System.out.println("Result:");
            Task9.evaluateColumns(element);
        }
    }
}
