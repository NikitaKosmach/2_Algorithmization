package by.jonline.task_array_of_array;

import by.jonline.task_array_of_array.matrix_manipulation.PrintMatrix;

public class Task5 {
    /*
     * 5. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
     * 
     *      [ 1    1    1   ...    1    1    1 ] 
     *      [ 2    2    2   ...    2    2    0 ]
     *      [ 3    3    3   ...    3    0    0 ]
     *      [ :    :    :    :     :    :    : ]
     *      [n-1  n-1   0   ...    0    0    0 ]
     *      [ n    0    0   ...    0    0    0 ]
     */
    public static void printMatrix(int size) {
        
        // Check on valid matrix size
        if (Task4.checkValidEvenSize(size)) {
            return;
        }

        int[][] matrix = new int[size][size];
        int stopStep;

        for (int i = 0; i < size; i++) {
            stopStep = size - i;
            for (int j = 0; j < stopStep; j++) {
                matrix[i][j] = i + 1;
            }
        }
        
        PrintMatrix.print(matrix);        
        System.out.println("\n");
    }
     
    /*
     * Test function
     */ 
    public static void main(String[] args) {
                        
        int[] nArray = {1, 2, 4, 20, -1, 5};
                        
        System.out.println("Tasks. Arrays of arrays. Task 5.");
        for (int element : nArray) {
            System.out.println("Size of matrix: " + element);
            Task5.printMatrix(element);            
        }
    }
}
