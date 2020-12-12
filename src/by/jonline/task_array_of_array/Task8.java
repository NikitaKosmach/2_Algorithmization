package by.jonline.task_array_of_array;

import java.util.Scanner;

import by.jonline.task_array_of_array.matrix_manipulation.PrintMatrix;

public class Task8 {
    /*
     * 8. В числовой матрице поменять местами два любых столбца, т. е. все
     * элементы одного столбца поставить на соответствующие им позиции другого, а
     * его элементы второго переместить в первый. Номера столбцов вводит
     * пользователь с клавиатуры.
     */
    public static boolean evaluateMatrix(int[][] matrix, int firstChangeColumn, int secondChangeColumn) {

        // Check replacing and replaced values
        if (firstChangeColumn == secondChangeColumn) {
            System.out.println("Replacing and replaced columns must be different values.");
            return false;
        }

        int tempValue;

        System.out.println("Input matrix: ");
        PrintMatrix.print(matrix);

        // Change columns
        for (int i = 0; i < matrix.length; i++) {
            tempValue = matrix[i][firstChangeColumn];
            matrix[i][firstChangeColumn] = matrix[i][secondChangeColumn];
            matrix[i][secondChangeColumn] = tempValue;
        }

        System.out.println("Output matrix: ");
        PrintMatrix.print(matrix);
        System.out.println("\n");
        
        return true;
    }

    /*
     * Test function
     */
    @SuppressWarnings("unused")
    public static void main(String[] args) {

        int testsNumber = 2;
        int[] firstChangeColumn = {1, 2};
        int[] secondChangeColumn  = {2, 3};
        int[][] matrix1 = {{20, 2, 30, 4, 4}, 
                           { 1, 2,  3, 4, 5}, 
                           { 1, 2,  3, 4, 5}, 
                           { 1, 2,  3, 4, 5}, 
                           { 1, 2,  3, 4, 5}};
             
        System.out.println("Tasks. Arrays of arrays. Task 8.");
        for (int i = 0; i < testsNumber; i++) {
            System.out.println("First column  " + firstChangeColumn[i]);
            System.out.println("Second column  " + secondChangeColumn[i]);
            Task8.evaluateMatrix(matrix1, firstChangeColumn[i], secondChangeColumn[i]);
        }
        
        // Run with input of console
        int[][] matrix2 = {{1,   2,  3,  4, 5}, 
                           {1,   2,  3,  4, 5}, 
                           {1,   2,  3,  4, 5}, 
                           {1,   2,  3,  4, 5}, 
                           {1,   2,  3,  4, 5}};
        int firstColumn;
        int secondColumn;
        int columnsNumber = matrix2[0].length;
        
        boolean seccesfulRun = false;
        while (!seccesfulRun) {
            firstColumn = getIntFromConsole(columnsNumber, "first");
            secondColumn = getIntFromConsole(columnsNumber, "second");
            seccesfulRun = Task8.evaluateMatrix(matrix2, firstColumn, secondColumn);
        }
    }
    
    public static int getIntFromConsole(int columnsNumber, String nameChangeColumn) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int inputValue = 0;
        boolean validResult = false;
        
        do {
            System.out.println("Input " + nameChangeColumn + " column number: ");
            if (sc.hasNextInt()) {
                inputValue = sc.nextInt();
                if (inputValue > 0) {
                    if (inputValue + 1 <= columnsNumber) {
                        validResult = true;
                    } else {
                        System.out.println("Column number greater than max number of columns " + 
                            "of matrix. Input value must be less or equal than " + columnsNumber);
                    }
                } else {
                    System.out.println("Invalid input data. Use only integer value more than 0.");
                }
            } else {
                System.out.println("Invalid input data. Use only integer value more than 0.");
                sc.next();
            }
        } while (!validResult);
        
        return inputValue;
    }
    
}
