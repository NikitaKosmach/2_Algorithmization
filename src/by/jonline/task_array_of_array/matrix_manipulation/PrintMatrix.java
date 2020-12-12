package by.jonline.task_array_of_array.matrix_manipulation;

public class PrintMatrix {
    public static void print(int[][] input) {
    
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[i].length; j++) {
                System.out.print(input[i][j] + " ");
            }
            System.out.print('\n');
        }
    }
    
    public static void print(double[][] input, int afterDecimalPoint) {
        
        String format = "%."+ afterDecimalPoint +"f";
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[i].length; j++) {
                System.out.print(String.format(format, input[i][j])  + " ");
            }
            System.out.print('\n');
        }
    }
    
}
