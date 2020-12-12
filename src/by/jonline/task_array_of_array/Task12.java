package by.jonline.task_array_of_array;

import java.util.ArrayList;

import by.jonline.task_array_of_array.matrix_manipulation.PrintMatrix;

public class Task12 {
    /*
     * 12. Отсортировать строки матрицы по возрастанию и убыванию значений элементов.
     */
    public static void sort(int[][] matrix) {
    
        int tempMax;
        int temp;
    
        // Sort increasing 
        for (int i = 0; i < matrix.length; i++) {
            for (int j = matrix[i].length - 1; j > 0; j--) {
                // Find max in sequence
                tempMax = matrix[i][j];
                for (int k = 0; k < j; k++) {
                    if (tempMax < matrix[i][k]) {
                        temp = matrix[i][k];
                        matrix[i][k] = tempMax;
                        tempMax = temp;
                    }
                }
                matrix[i][j] = tempMax;
            }
        }
        System.out.println("Sort increasing:");
        PrintMatrix.print(matrix);
        
        System.out.println();
        
        // Sort decreasing 
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                // Find max in sequence
                tempMax = matrix[i][j];
                for (int k = j; k < matrix[i].length; k++) {
                    if (tempMax < matrix[i][k]) {
                        temp = matrix[i][k];
                        matrix[i][k] = tempMax;
                        tempMax = temp;
                    }
                }
                matrix[i][j] = tempMax;
            }
        }
        System.out.println("Sort decreasing:");
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
 
        System.out.println("Tasks. Arrays of arrays. Task 12.");
        for (int[][] element : fullMatrices) {
            System.out.println("Origin matrix: ");
            PrintMatrix.print(element);

            System.out.println("Result:");
            Task12.sort(element);
            System.out.println("\n");
        }
    }
}
