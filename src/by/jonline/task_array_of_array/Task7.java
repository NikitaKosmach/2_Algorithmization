package by.jonline.task_array_of_array;

import by.jonline.task_array_of_array.matrix_manipulation.PrintMatrix;

public class Task7 {
    /*
     *  7. Сформировать квадратную матрицу порядка N по правилу:
     *               ( I^2 - J^2 )
     *  A[I, J] = sin(-----------)
     *               (     N     )
     *  и подсчитать количество положительных элементов в ней.
     */
    public static void printMatrix(int size) {
        
        // Check on valid matrix size
        if (size < 1) {
            System.out.println("Unvalid square matrix size. n = " + size);
            return;
        }

        double[][] matrix = new double[size][size];
        int positiveNumber = 0;
        
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = Math.sin((Math.pow(i, 2) - Math.pow(j, 2) / 2));
                if (matrix[i][j] > 0) { 
                    positiveNumber++;
                }
            }
        }
        
        PrintMatrix.print(matrix, 3);        
        System.out.println("Positive element in matrix: " + positiveNumber);
        System.out.println("\n");
    }
     
    /*
     * Test function
     */ 
    public static void main(String[] args) {
                        
        int[] nArray = {1, 2, 4, 20, -1, 5, 8};
                        
        System.out.println("Tasks. Arrays of arrays. Task 7.");
        for (int element : nArray) {
            System.out.println("Size of matrix: " + element);
            Task7.printMatrix(element);            
        }
    }
}
