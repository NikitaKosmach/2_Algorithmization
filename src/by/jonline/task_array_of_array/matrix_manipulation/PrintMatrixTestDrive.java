package by.jonline.task_array_of_array.matrix_manipulation;

public class PrintMatrixTestDrive {
    public static void main (String[] args) {
        int[][] matrix1 = {{20, 2, 30, 4, 4}, 
                           { 1, 2,  3, 4, 5}, 
                           { 1, 2,  3, 4, 5}, 
                           { 1, 2,  3, 4, 5}, 
                           { 1, 2,  3, 4, 5}};
        PrintMatrix.print(matrix1);
        System.out.println('\n');
        
        double[][] matrix2 = {{20.01, 2.0, 30.0, 4.0, 4.0}, 
                              { 1.02, 2.0, 3.54, 4.2, 5.8}, 
                              { 1.87, 2.0, 3.87, 4.4, 5.0}, 
                              { 1, 2,  3, 4, 5},   
                              { 1, 2,  3, 4, 5}};
                              
        PrintMatrix.print(matrix2, 2);
        System.out.println('\n');
    }
}
