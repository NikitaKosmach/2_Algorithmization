package by.jonline.one_dimensional_array;

import java.util.Arrays;

public class Task10 {
    /*
     * 10. Дан целочисленный массив с количеством элементов n. Сжать массив,
     * выбросив из него каждый второй элемент (освободившиеся элементы заполнить
     * нулями). Примечание. Дополнительный массив не использовать
     */
    public static void compress(int[] result) {
              
        System.out.println("Origin array: " + Arrays.toString(result));

        // Shift elements
        int halfLength = (int) Math.ceil(result.length / 2.0);
        for (int i = 1; i < halfLength; i++) {
            result[i] = result[i + i];
        }

        for (int i = halfLength; i < result.length; i++) {
            result[i] = 0;
        }

        System.out.println("Result:       " + Arrays.toString(result));
    }
    
    public static void main(String[] args) {
        
        int[][] input = {{1, 2, 3, 4, 5, 6, 7, 0, 0},
                         {1, 2, 3, 4, 5, 6, 7, 0, 8},
                         {1, 2, 3, 4, 5, 6, 7, 0},
                         {1, 2, 3, 4, 5, 6, 7, 9},
                         {1, 2},
                         {1, 2, 3} };
        
        System.out.println("One-dimensional array. Task 10.");
        for (int[] element : input) {
            Task10.compress(element);
        }  
    }
}
