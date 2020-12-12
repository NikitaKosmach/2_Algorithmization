package by.jonline.task_array_of_array;
//Check
import by.jonline.task_array_of_array.matrix_manipulation.PrintMatrix;

public class Task14 {
    /*
     * 14. Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем
     * в каждом столбце число единиц равно номеру столбца
     */
    public static void createMatrix(int m, int n) {

        int[][] matrix = new int[m][n];
        int onesNumber;
        int randomValue;
        int columPosition;
        int maxCntColumnForFill;
        boolean fillRestOnes = false; 
         
        // Determine number of full column with random values
        maxCntColumnForFill = n;
        if (n > m) {
            maxCntColumnForFill = m;
            fillRestOnes = true;
            System.out.println("Warning: m > n. Columns Part from " + (n - m) + 
                               " up to " + n + " will filled by ones.");
        }
        
        for (int j = 1; j < maxCntColumnForFill; j++) {
            onesNumber = 0;
            int i = 0;
            while((onesNumber != j) && (onesNumber != m)) {
                columPosition = i % m;
                randomValue = (int) Math.round(Math.random());
                if ((randomValue == 1) && (matrix[columPosition][j] == 0)) {
                    onesNumber++;
                    matrix[columPosition][j] = randomValue;
                }
                i++;
            }
        }
        
        // Fill rest part with ones
        if (fillRestOnes) {
            for (int j = maxCntColumnForFill; j < n; j++) {
                for (int i = 0; i < m; i++) {
                    matrix[i][j] = 1;
                }
            }
        }
        
        System.out.println("Result");
        PrintMatrix.print(matrix);
        System.out.println("\n");
    }

    /*
     * Test function
     */
    public static void main(String[] args) {

        int[] nArray = {20, 4, 1, 2, 4, 7};
        int[] mArray = {10, 2, 1, 3, 4, 8};
        
        System.out.println("Tasks. Arrays of arrays. Task 14.");
        for (int i = 0; i < nArray.length; i++) {
            System.out.println("Size of matrix (m X n): " + mArray[i] + " X " + nArray[i]);
            Task14.createMatrix(mArray[i], nArray[i]);
        }
    }
}
