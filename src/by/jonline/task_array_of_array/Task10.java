package by.jonline.task_array_of_array;

import java.util.ArrayList;

import by.jonline.task_array_of_array.matrix_manipulation.PrintMatrix;

public class Task10 {
    /*
     * 10. Найти положительные элементы главной диагонали квадратной матрицы.
     */
    public static void findPositiveInDiagonal(int[][] matrix) {

        ArrayList<Integer> diagonalVector = new ArrayList<Integer>();

        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][i] > 0) {
                diagonalVector.add(matrix[i][i]);
            }
        }
        System.out.println("Positive elements of matrix diagonal:\n" + 
                            diagonalVector.toString() + "\n\n");
    }

    /*
     * Test function
     */
    public static void main(String[] args) {

        ArrayList<int[][]> fullMatrices = new ArrayList<int[][]>();
        int[][] matrix1 = { { 20, 2, 30, 4, 4 }, 
                            {  1,-2,  3, 4, 5 }, 
                            {  1, 2, -3, 4, 5 }, 
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
 
        System.out.println("Tasks. Arrays of arrays. Task 10.");
        for (int[][] element : fullMatrices) {
            System.out.println("Origin matrix: ");
            PrintMatrix.print(element);

            System.out.println("Result:");
            Task10.findPositiveInDiagonal(element);
        }
    }
}
