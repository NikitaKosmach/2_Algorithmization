package by.jonline.task_array_of_array;

public class Task4 {
    /*
     * 4. Сформировать квадратную матрицу порядка n по заданному 
     * образцу(n - четное):
     * 
     *      [ 1    2    3   ...  n ] 
     *      [ n   n-1  n-2  ...  1 ]
     *      [ 1    2    3   ...  n ]
     *      [ n   n-1  n-2  ...  1 ]
     *      [ :    :    :    :   : ]
     *      [ n   n-1  n-2  ...  1 ]
     */
    public static void printMatrix(int size) {
        
        // Check on valid matrix size
        if (Task4.checkValidEvenSize(size)) {
            return;
        }
        
        for (int i = 1; i <= size; i++) {
            if (i % 2 == 0) {
                for (int j = size; j > 0; j--) {
                    System.out.print(j + " ");
                }
            } else {
                for (int j = 1; j <= size; j++) {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
        
        System.out.println("\n");
    }
     
     public static boolean checkValidEvenSize(int size) {
     
        boolean result;
        
        result = (size < 1) || (size % 2 != 0);
        if (result) {
            System.out.println("Unvalid square matrix size. n must be even. n = " + size);
        }
        
        return result;
     }
     
    /*
     * Test function
     */ 
    public static void main(String[] args) {
                        
        int[] nArray = {1, 2, 4, 20, -1, 5};
                        
        System.out.println("Tasks. Arrays of arrays. Task 4.");
        for (int element : nArray) {
            System.out.println("Size of matrix: " + element);
            Task4.printMatrix(element);            
        }
    }
}
