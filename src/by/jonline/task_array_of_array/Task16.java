package by.jonline.task_array_of_array;

import by.jonline.task_array_of_array.matrix_manipulation.PrintMatrix;

import java.util.ArrayList;
import by.jonline.one_dimensional_array.array_manipulation.ArrayMath;

public class Task16 {
    /*
     * 6. Магическим квадратом порядка n называется квадратная матрица размера nxn,
     * составленная из чисел 1, 2, 3, ...,n^2 так, что суммы по каждому столбцу,
     * каждой строке и каждой из двух больших диагоналей равны между собой.
     * Построить такой квадрат. Пример магического квадрата порядка 3:
     * 
     *                 6  1  8 
     *                 7  5  3 
     *                 2  9  4 
     */
    public static int[][] createMagicMatrix(int n) {
        
        int[][] matrix = null;

        if ((n % 2) != 0) {
            matrix = Task16.createMagicMatrixOdd(n);
        } else if (n % 4 == 0) {
            matrix = Task16.createMagicMatrixNBy4(n);
        } else {
            matrix = Task16.createMagicMatrixNby2(n);
        }
        return matrix;
    }  

    /*
     * Function creates magic matrix based on Indian method.
     * n - dimension of square magic matrix
     */
    private static int[][] createMagicMatrixOdd(int n) {
        
        int[][] matrix = new int[n][n];
        int squareN = (int) Math.pow(n, 2);
        int currentY;
        int currentX;
        int previousY;
        int previousX;

        if (n == 1) {
            matrix[0][0] = 1;
            return matrix;
        }

        //Indian method
        previousY = 0; 
        previousX = (n - 1) / 2;
        matrix[previousY][previousX] = 1;
        
        for (int v = 2; v <= squareN; v++) {
        
            currentY = previousY - 1;
            currentX = previousX + 1; 
            
            currentX = Task16.checkBounds(currentX, n);
            currentY = Task16.checkBounds(currentY, n);

            if (matrix[currentY][currentX] != 0) {
                currentY = previousY + 1;
                currentX = previousX;
            }
            
            matrix[currentY][currentX] = v;
            previousY = currentY;
            previousX = currentX;
        }
        return matrix;
    }

    /*
     * Function creates magic matrix based on Raus-Boll method.
     * n - dimension of square magic matrix, that dividing on 4
     */
    private static int[][] createMagicMatrixNBy4(int n) {
        
        int[][] matrix = new int[n][n];
        int cnt = 1;
        int negativeCnt = (int) Math.pow(n, 2);
        int MODULE = 4;
        int VALUE_OF_DIAGONAL = MODULE - 1;
        int yModule;
        int xModule;
        
        for (int i = 0; i < n; i++) {
            yModule = i % MODULE;
            for (int j = 0; j < n; j++) {
                xModule = j % MODULE;
                if ((yModule == xModule) || (yModule + xModule == VALUE_OF_DIAGONAL)) {
                    matrix[i][j] = cnt;
                } else {
                    matrix[i][j] = negativeCnt;
                }
                cnt++;
                negativeCnt --;
            }
        }
        
        return matrix;
    }

    /*
     * Function creates magic matrix based on 4 squares method.
     * n - dimension of square magic matrix, that dividing on 2
     */
    private static int[][] createMagicMatrixNby2(int n) {
        
        int[][] matrix = new int[n][n];
        int[][] oddMatrix;
        int oddDimension = n / 2;
        int halfChangeColumn = (oddDimension - 3) / 2;
        int sumCorefficient = (int) Math.pow(oddDimension, 2);
        int x;
        int y;
        
        oddMatrix = Task16.createMagicMatrixOdd(oddDimension);
        
        // Fill in up left corner of matrix
        
        for (int i = 0; i < oddDimension; i++) {
            for (int j = 0; j < oddDimension; j++) {
                matrix[i][j] = oddMatrix[i][j];
            }
        }
        
        // Fill in up right corner of matrix
        for (int i = 0; i < oddDimension; i++) {
            for (int j = oddDimension; j < n; j++) {
                matrix[i][j] = oddMatrix[i][j - oddDimension] + (2 * sumCorefficient);
            }
        }
        
        // Fill in down right corner of matrix
        for (int i = oddDimension; i < n; i++) {
            for (int j = oddDimension; j < n; j++) {
                matrix[i][j] = oddMatrix[i - oddDimension][j - oddDimension] + sumCorefficient;
            }
        }
        
        // Fill in down left corner of matrix
        for (int i = oddDimension; i < n; i++) {
            for (int j = 0; j < oddDimension; j++) {
                matrix[i][j] = oddMatrix[i - oddDimension][j] + (3 * sumCorefficient);
            }
        }
        
        // Replacing
        x = 0;
        y = 0;
        matrix = Task16.replaceingElement(matrix, x, y, oddDimension);
        
        x = 0;
        y = oddDimension - 1;
        matrix = Task16.replaceingElement(matrix, x, y, oddDimension); 
        
        x = 1;
        for (y = 1; y < oddDimension - 1; y++) {
            matrix = Task16.replaceingElement(matrix, x, y, oddDimension);
        }
        
        for (x = oddDimension - halfChangeColumn; x < oddDimension + halfChangeColumn; x++) {
            for (y = 0; y < oddDimension; y++) {
                matrix = Task16.replaceingElement(matrix, x, y, oddDimension);
            }
        }
        
        return matrix;   
    }

    private static int checkBounds(int coordinate, int n) {
        
        if (coordinate < 0) {
            coordinate = n - 1;
        }
        if (coordinate == n) {
            coordinate = 0;
        }
        
        return coordinate;
    }

    public static boolean checkTraditionalMagicMatrix(int[][] matrix) {
          
        int supportSum = 0;
        int checkedSum;
        int squareN = (int) Math.pow(matrix.length, 2);
        int[] traditionalElementsVector = new int[squareN];
        ArrayList<Integer> elementsPosition;
  
        for (int i = 0; i < matrix[0].length; i++) {
            supportSum += matrix[0][i];
        }
  
        // Check each row
        for (int i = 0; i < matrix.length; i++) {
            checkedSum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                checkedSum += matrix[i][j];        
            }
            if (checkedSum != supportSum) {
                return false;
            }
        }
  
        // Check each column
        for (int i = 0; i < matrix[0].length; i++) {
            checkedSum = 0;
            for (int j = 0; j < matrix.length; j++) {
                checkedSum += matrix[j][i];        
            }
            if (checkedSum != supportSum) {
                return false;
            }
        }
     
        // Check main diagonal
        checkedSum = 0;
        for (int i = 0; i < matrix.length; i++) {
            checkedSum += matrix[i][i];
        }
        if (checkedSum != supportSum) {
            return false;
        }
        
        // Check additional diagonal
        checkedSum = 0;
        for (int i = 0; i < matrix.length; i++) {
            checkedSum += matrix[i][matrix.length - i - 1];
        }
        if (checkedSum != supportSum) {
            return false;
        }
      
        // Check elements in matrix
        for (int i = 0; i < squareN; i++ ) {
            traditionalElementsVector[i] = i + 1;
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                elementsPosition = ArrayMath.compare(matrix[i][j], traditionalElementsVector);
                if ((elementsPosition.isEmpty() || elementsPosition.size() > 1)) {
                    return false;
                } else {
                    traditionalElementsVector[elementsPosition.get(0)] = -1;
                }
            }
        }
        
        return true;
    }

    private static int[][] replaceingElement(int[][] matrix, int x, int y, int yShift) {
        
        int temp = matrix[y][x];
        matrix[y][x] = matrix[y + yShift][x];
        matrix[y + yShift][x] = temp;
        
        return matrix;
    }

    /*
     * Test function
     */
    public static void main(String[] args) {

        int[] nArray = { 2, 4, 8, 1, 3, 7, 5, 9, 11, 13, 12, 16, 20, 6, 10, 14, 18  };
        //int[] nArray = { 6, 10, 14, 18 };
        int[][] magicMatrix;
        boolean magicStatus;

        // Test checkMagicMatrix
        int[][] matrix1 = { {6, 1, 8},
                            {7, 5, 3},
                            {2, 9, 4} };
        magicStatus = checkTraditionalMagicMatrix(matrix1);
        System.out.println("Test of checkMagicMatrix positive: " + magicStatus);
        
        int[][] matrix2 = { {6, 1, 8},
                            {7, 5, 3},
                            {2, 9, 5} };
        magicStatus = checkTraditionalMagicMatrix(matrix2);
        System.out.println("Test of checkMagicMatrix negative: " + !magicStatus);
        

        System.out.println("Tasks. Arrays of arrays. Task 16.");
        for (int element : nArray) {
            System.out.println("Dimension of matrix: " + element);
            magicMatrix = Task16.createMagicMatrix(element);
            PrintMatrix.print(magicMatrix);
            
            magicStatus = checkTraditionalMagicMatrix(magicMatrix);
            System.out.println("Valid of magic matrix: " + magicStatus);
        }
    }
}
