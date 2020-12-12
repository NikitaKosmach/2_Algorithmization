package by.jonline.task_array_of_array;

import java.util.ArrayList;

import by.jonline.task_array_of_array.matrix_manipulation.PrintMatrix;

public class Task2 {
    /*
     * 2. Дана квадратная матрица. 
     * Вывести на экран элементы, стоящие на диагонали.
     */
    public static void printMatrixDiagonal(int[][] matrix) {
        
        int squareMatrixSize = matrix.length;
        boolean validMatrix = true;
        
        // Check on valid matrix
        for (int i = 0; i < squareMatrixSize; i++) {
            if (matrix[i].length != squareMatrixSize) {
                validMatrix = false;
                break;
            }   
        }
        if (!validMatrix) {
            System.out.println("Matrix not valid. Check size of square matrix. Result not will be printed.");
            return;
        }
        
        System.out.println("Result.Diagonal:");
        for (int i = 0; i < squareMatrixSize; i++) {
            System.out.print(matrix[i][i] + " ");
        }
        System.out.println("\n");
    }
     
    /*
     * Test function
     */ 
    public static void main(String[] args) {
    
        ArrayList<int[][]> fullMatrices = new ArrayList<int[][]>(); 
        int[][] matrix1 = {{20, 2, 30, 4, 4}, 
                           { 1, 2,  3, 4, 5}, 
                           { 1, 2,  3, 4, 5}, 
                           { 1, 2,  3, 4, 5}, 
                           { 1, 2,  3, 4, 5}};
                        
        int[][] matrix2 = {{1,   2,  3,  4, 4}, 
                           {1,  80,  3,  4, 5}, 
                           {1,   2, 90,  4, 5}, 
                           {1,   2,  3, 80, 5}, 
                           {1,   2,  3,  4, 8}};
    
        int[][] matrix3 = {{ 2,   6, 30,  1,  42}, 
                           { 1,   2,  3,  4, 100}, 
                           { 1,  48,  3,  4,   5}, 
                           {45,   2,  3,  4,   5}, 
                           { 1,   2,  3,  4,   5}};
                           
        int[][] matrix4 = {{ 2,   6, 30,  1}, 
                           { 1,   2,  3,  4}, 
                           { 1,  48,  3,  4}, 
                           {45,   2,  3,  4}, 
                           { 1,   2,  3,  4}};
                        
        fullMatrices.add(matrix1);
        fullMatrices.add(matrix2);
        fullMatrices.add(matrix3);
        fullMatrices.add(matrix4);
                        
        System.out.println("Tasks. Arrays of arrays. Task 2.");
        for (int[][] element : fullMatrices) {
            System.out.println("Origin matrix: ");
            PrintMatrix.print(element);
            
            Task2.printMatrixDiagonal(element);
        }
    }
}
