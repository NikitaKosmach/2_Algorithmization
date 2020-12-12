package by.jonline.task_array_of_array;

import java.util.ArrayList;

import by.jonline.task_array_of_array.matrix_manipulation.PrintMatrix;

public class Task13 {
    /*
     * 13. Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов.
     */
    public static void sort(int[][] matrix) {
    
        int tempMax;
        boolean validSize = true;
        int columnNumber = matrix[0].length;
        int rowNumber = matrix.length;
        int temp;
    
        // Check right size matrix
        for (int i = 0; i < rowNumber; i++) {
            if (columnNumber != matrix[i].length) {
                validSize = false;
                break;
            }
        }
        if (!validSize) {
            System.out.println("Unvalid dimension of matrix");
            return;
        }
    
        // Sort increasing 
        for (int j = 0; j < columnNumber; j++) {
            for (int i = rowNumber - 1; i > 0; i--) {
                // Find max in sequence
                tempMax = matrix[i][j];
                for (int k = 0; k < i; k++) {
                    if (tempMax < matrix[k][j]) {
                        temp = matrix[k][j];
                        matrix[k][j] = tempMax;
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
        for (int j = 0; j < columnNumber; j++) {
            for (int i = 0; i < rowNumber; i++) {
                // Find max in sequence
                tempMax = matrix[i][j];
                for (int k = i; k < rowNumber; k++) {
                    if (tempMax < matrix[k][j]) {
                        temp = matrix[k][j];
                        matrix[k][j] = tempMax;
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
 
        System.out.println("Tasks. Arrays of arrays. Task 13.");
        for (int[][] element : fullMatrices) {
            System.out.println("Origin matrix: ");
            PrintMatrix.print(element);

            System.out.println("Result:");
            Task13.sort(element);
            System.out.println("\n");
        }
    }
}
