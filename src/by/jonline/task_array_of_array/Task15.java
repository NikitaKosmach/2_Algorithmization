package by.jonline.task_array_of_array;

import java.util.ArrayList;

import by.jonline.task_array_of_array.matrix_manipulation.PrintMatrix;
import by.jonline.one_dimensional_array.array_manipulation.ArrayMath;

public class Task15 {
    /*
     * 15. Найдите наибольший элемент матрицы и заменить все нечетные элементы на
     * него.
     */
    public static void findAndReplace(int[][] matrix) {
        
        int[] maxRowVector = new int[matrix.length];
        int maxMatrixValue;
        
        // Find max in matrix
        for (int i = 0; i < matrix.length; i++) {
            maxRowVector[i] = ArrayMath.findMaxInArray(matrix[i]);
        }
        maxMatrixValue = ArrayMath.findMaxInArray(maxRowVector);
        
        // Replace odd elements of matrix on max 
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] % 2.0 != 0) {
                    matrix[i][j] = maxMatrixValue;
                }
            }
        }       
        PrintMatrix.print(matrix);
    }
    
    /*
     * Test function
     */
    public static void main(String[] args) {

        ArrayList<int[][]> fullMatrices = new ArrayList<int[][]>();
        int[][] matrix1 = { { 20, 2, 30, 4, 4 }, 
                            {  1,-2,  3, 4, 5 }, 
                            { 20, 2, -3, 4, 5 }, 
                            {  1, 2,  3, 4, 5 },
                            {  1, 2,  3, 4,-5 } };

        int[][] matrix2 = { { 1,  2,  3,  4, 4 }, 
                            { 1,-80,  3,  4, 5 }, 
                            { 1,  2, 90,  4, 5 }, 
                            { 1,  2,  3,-80, 5 },
                            { 1,  2,  3,  4,-8 } };

        int[][] matrix3 = { { -2,   6, 30, 1,  42 }, 
                            {  1,   2,  3, 4, 100 }, 
                            {  1,  48, -3, 4,   5 }, 
                            { 45,   2,  3, 4,   5 },
                            {  1,   2,  3, 4,  -5 } };

        fullMatrices.add(matrix1);
        fullMatrices.add(matrix2);
        fullMatrices.add(matrix3);
 
        System.out.println("Tasks. Arrays of arrays. Task 13.");
        for (int[][] element : fullMatrices) {
            System.out.println("Origin matrix: ");
            PrintMatrix.print(element);

            System.out.println("Result:");
            Task15.findAndReplace(element);
            System.out.println("\n");
        }
    }
}
