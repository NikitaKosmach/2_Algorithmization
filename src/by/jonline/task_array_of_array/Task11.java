package by.jonline.task_array_of_array;

import java.util.ArrayList;

import by.jonline.task_array_of_array.matrix_manipulation.PrintMatrix;

public class Task11 {
    /*
     * 11. Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран
     * саму матрицу и номера строк, в которых число 5 встречается три и более раз.
     */
    
    private static final int ROW_NUMBER = 10; 
    private static final int COLUMN_NUMBER = 20;
    private static final int MAX_RANDOM_VALUE = 15; 
    private static final int REPEATING_VALUE = 5;
    private static final int REPEATS_NUMBER_THRESHOLD = 3;
     
    public static void createMatrix() {
        
        int[][] matrix = new int[Task11.ROW_NUMBER][Task11.COLUMN_NUMBER];
        int repeatsNumber;
        ArrayList<Integer> requiredRowPosition = new ArrayList<Integer>();
        
        for (int i = 0; i < matrix.length; i++) {
            repeatsNumber = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * (Task11.MAX_RANDOM_VALUE + 1));
                if (matrix[i][j] == Task11.REPEATING_VALUE) {
                    repeatsNumber++;
                } 
            }
            if (repeatsNumber >= Task11.REPEATS_NUMBER_THRESHOLD) {
                requiredRowPosition.add(i);
            }
        }
        
        System.out.println("Created random matrix:");
        PrintMatrix.print(matrix);
        System.out.println();
        System.out.println("Numbers of rows where " + Task11.REPEATING_VALUE +
                           " value meets than " + Task11.REPEATS_NUMBER_THRESHOLD + " times:");
        System.out.println(requiredRowPosition.toString() + "\n\n");
    }

    /*
     * Test function
     */
    public static void main(String[] args) {

        System.out.println("Tasks. Arrays of arrays. Task 11.");
        int tasksNumber = 5;
        for (int i = 0; i < tasksNumber; i++) {
            System.out.println("Task number #" + i);
            
            Task11.createMatrix();
        }
    }
}
