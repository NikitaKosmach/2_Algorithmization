package by.jonline.task_array_of_array;

import by.jonline.task_array_of_array.matrix_manipulation.PrintMatrix;

public class Task6 {
    /*
     * 6. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
     * 
     *      [ 1    1    1   ...    1    1    1 ] 
     *      [ 0    1    1   ...    1    1    0 ]
     *      [ 0    0    1   ...    1    0    0 ]
     *      [ :    :    :    :     :    :    : ]
     *      [ 0    1    1   ...    1    1    0 ]
     *      [ 1    1    1   ...    1    1    1 ]
     */
    public static void printMatrix(int size) {
        
        // Check on valid matrix size
        if (Task4.checkValidEvenSize(size)) {
            return;
        }

        int[][] matrix = new int[size][size];
        int stopStep;
        int halfSize = size / 2;

        // Fill first half
        for (int i = 0; i < halfSize; i++) {
            stopStep = size - i;
            for (int j = i; j < stopStep; j++) {
                matrix[i][j] = 1;
            }
        }
        
        // Fill second half
        for (int i = halfSize; i < size; i++) {
            for (int j = size - i - 1; j <= i; j++) {
                matrix[i][j] = 1;
            }
        }
        
        PrintMatrix.print(matrix);        
        System.out.println("\n");
    }
     
    /*
     * Test function
     */ 
    public static void main(String[] args) {
                        
        int[] nArray = {1, 2, 4, 20, -1, 5, 8};
                        
        System.out.println("Tasks. Arrays of arrays. Task 6.");
        for (int element : nArray) {
            System.out.println("Size of matrix: " + element);
            Task6.printMatrix(element);            
        }
    }
}
