package by.jonline.task_array_of_array;

import java.util.ArrayList;

import by.jonline.task_array_of_array.matrix_manipulation.PrintMatrix;

public class Task3 {
    /*
     * 3. Дана матрица. Вывести k-ю строку и p-й столбец матрицы
     */
    public static void printColumn(int[][] matrix, int requiredColumn) {
        
        int columnNumber = matrix.length;
        int rowNumber = matrix[0].length;
        
        if (rowNumber >= requiredColumn) {
            System.out.println("Requested column " + requiredColumn + " :");
            for (int i = 0; i < columnNumber; i++) {
                System.out.println(matrix[i][requiredColumn - 1] + " ");
            }
            System.out.println("");
        } else {
            System.out.println("Matrix does not have requested column " + requiredColumn + ".\n");
        }
    }
     
    public static void printRow(int[][] matrix, int requiredRow) {
        
        int columnNumber = matrix.length;
        int rowNumber = matrix[0].length;
        
        if (columnNumber >= requiredRow) {
            System.out.println("Required row " + requiredRow + ":");
            for (int i = 0; i < rowNumber; i++) {
                System.out.print(matrix[requiredRow - 1][i] + " ");
            }
            System.out.println("\n");
        } else {
            System.out.println("Matrix does not have requested row " + requiredRow + ".\n");
        }
    }
     
    /*
     * Test function
     */ 
    public static void main(String[] args) {
        
        int requiredColumn = 5; // p
        int requiredRow = 5;    // k
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
                           
        int[][] matrix5 = {{ 2,   6, 30,  1}, 
                           { 1,   2,  3,  4}, 
                           { 1,  48,  3,  4}, 
                           {45,   2,  3,  4}};
                        
        fullMatrices.add(matrix1);
        fullMatrices.add(matrix2);
        fullMatrices.add(matrix3);
        fullMatrices.add(matrix4);
        fullMatrices.add(matrix5);
                        
        System.out.println("Tasks. Arrays of arrays. Task 3.");
        for (int[][] element : fullMatrices) {
            System.out.println("Origin matrix: ");
            PrintMatrix.print(element);
            
            System.out.println("Result:");
            Task3.printColumn(element, requiredColumn);
            Task3.printRow(element, requiredRow);
        }
    }
}
