package by.jonline.task_array_of_array;

import java.util.ArrayList;
import by.jonline.task_array_of_array.matrix_manipulation.PrintMatrix;

public class Task1 {
    /*
     * 1. Дана матрица. Вывести на экран все нечетные столбцы, у которых первый
     * элемент больше последнего
     */
    public static void printMatrixColums(int[][] matrix) {
        
        int rawNumber = matrix.length;
        int columnNumber = matrix[0].length;
        boolean validMatrix = true;
        ArrayList<Integer> validColum = new ArrayList<Integer>(); 
        
        // Check on valid matrix
        for (int i = 0; i < rawNumber; i++) {
            if (matrix[i].length != columnNumber) {
                validMatrix = false;
                break;
            }   
        }
        if (!validMatrix) {
            System.out.println("Matrix not valid. Check size of matrix. Result not will be printed.");
            return;
        }
        
        System.out.println("Result:");
        for (int i = 0; i < columnNumber; i += 2) {
            if (matrix[0][i] > matrix[rawNumber - 1][i]) {
                validColum.add(i);
            }
        }
        
        // Print result
        if (!validColum.isEmpty()) {
            for (int i = 0; i < columnNumber; i++) {
                for (int element : validColum) {
                    System.out.print(matrix[i][element] + " ");
                }
                System.out.println();
            } 
        } else {
            System.out.println("There are not any required columns in matrix.\n");
        }
    }
     
    /*
     * Test function
     */ 
    public static void main(String[] args) {
    
        ArrayList<int[][]> fullMatrices = new ArrayList<int[][]>(); 
        int[][] matrix1 = {{20, 2, 30, 4, 4}, 
                           {1,  2, 3,  4, 5}, 
                           {1,  2, 3,  4, 5}, 
                           {1,  2, 3,  4, 5}, 
                           {1,  2, 3,  4, 5}};
                        
        int[][] matrix2 = {{1,  2, 3,  4, 4}, 
                           {1,  2, 3,  4, 5}, 
                           {1,  2, 3,  4, 5}, 
                           {1,  2, 3,  4, 5}, 
                           {1,  2, 3,  4, 5}};
    
        int[][] matrix3 = {{2,  6, 30,  1}, 
                           {1,  2,  3,  4}, 
                           {1,  48, 3,  4}, 
                           {45,  2, 3,  4}, 
                           {1,   2, 3,  4}};
                           
        int[][] matrix4 = {{2,  6, 30,  1, 5}, 
                           {1,  2,  3,  4}, 
                           {1,  48, 3,  4}, 
                           {45,  2, 3,  4}, 
                           {1,   2, 3,  4}};
                        
        fullMatrices.add(matrix1);
        fullMatrices.add(matrix2);
        fullMatrices.add(matrix3);
        fullMatrices.add(matrix4);
                        
        System.out.println("Tasks. Arrays of arrays. Task 1.");
        for (int[][] element : fullMatrices) {
            System.out.println("Origin matrix: ");
            PrintMatrix.print(element);
            
            Task1.printMatrixColums(element);
        }
    }
}
