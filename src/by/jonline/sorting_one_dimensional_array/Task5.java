package by.jonline.sorting_one_dimensional_array;

import java.util.Arrays;

import by.jonline.one_dimensional_array.array_manipulation.ArrayFilling;

public class Task5 {
    /*
     * 5. Сортировка вставками. Дана последовательность чисел a[1],a[2],...,a[n] . Требуется
     * переставить числа в порядке возрастания. Делается это следующим образом.
     * Пусть a[1],a[2],...,a[i] - упорядоченная последовательность, т. е. a[1]<=a[2]<=...<=a[i].
     * Берется следующее число a[i+1] и вставляется в последовательность так, чтобы
     * новая последовательность была тоже возрастающей. Процесс производится до тех
     * пор, пока все элементы от i + 1 до n не будут перебраны. Примечание. Место
     * помещения очередного элемента в отсортированную часть производить с помощью
     * двоичного поиска. Двоичный поиск оформить в виде отдельной функции.
     */

    /*
     * Function sorts array in increasing order 
     */
    public static int[] sort(int[] array) {

        int[] result = new int[1];
        int position;

        result[0] = array[0];
        for (int i = 1; i < array.length; i++) {
            position = Task5.binarySearch(result, array[i]);
            result = Task5.insert(result, array[i], position);
        }
        
        return result;

    }

    
    private static int binarySearch(int[] array, int value) {
        
        int position;
        int firstPosition = 0;
        int lastPosition = array.length - 1;
        boolean stopSearch = false;
        
        do {
            position = (firstPosition + lastPosition) / 2;
            
            if (array[position] < value) {
                firstPosition = position;
            } else if (array[position] > value) {
                lastPosition = position;
            } else {
                stopSearch = true;
            }
            
        } while (!stopSearch && (firstPosition + 1 != lastPosition) && 
                (position != 0) && (position != array.length - 1));
    
        // Check border positions        
        if (position == 1) {
            if (array[position] > value) {
                position = 0;
            }
        }
        if (position == (array.length - 2)) {
            if (array[position] < value) {
                position = array.length - 1;
            }
        }
        
        return position;
    }

    private static int[] insert(int[] array, int value, int position) {
        
        int[] newArray = new int[array.length + 1];        
        boolean stopWhile;
        
        if (array[position] >= value) {
            // Check position on repeated elements
            if (position != 0) {
                do {
                    if (array[position] == array[position - 1]) {
                        position--;
                        stopWhile = false;
                    } else {
                        stopWhile = true;
                    }
                } while (!stopWhile && (position != 0));
            }
            
            for (int i = position; i < array.length; i++) {
                newArray[i + 1] = array[i];
            }
            for (int i = 0; i < position; i++) {
                newArray[i] = array[i];
            }
            
            newArray[position] = value;
        } else {
         // Check position on repeated elements
            if (position != (array.length - 1)) {
                do {
                    if (array[position] == array[position + 1]) {
                        position++;
                        stopWhile = false;
                    } else {
                        stopWhile = true;
                    }
                } while (!stopWhile && (position != array.length - 1));
            }
            for (int i = position + 1; i < array.length; i++) {
                newArray[i + 1] = array[i];
            }
            for (int i = 0; i <= position; i++) {
                newArray[i] = array[i];
            }
            
            newArray[position + 1] = value;
        }
                    
        return newArray;
    }

    /*
     * Test function
     */
    public static void main(String[] args) {

        int[][] arrayMatrix = new int[4][0];

        int[] result;
        boolean validResult;
        
        arrayMatrix[0] = new int[] {11, -3, 2, -9, 10, 8, -3, -8};
        arrayMatrix[1] = new int[] {-4, -4, -1, -1, 3};
        arrayMatrix[2] = ArrayFilling.createRandomRealIntArray(8, 16);
        arrayMatrix[3] = ArrayFilling.createRandomRealIntArray(100, 50);

        System.out.println("One-dimensional array. Sorting. Task 5.");
        for (int i = 0; i < arrayMatrix.length; i++) {

            System.out.println("Not sorted array: " + Arrays.toString(arrayMatrix[i]));

            result = Task5.sort(arrayMatrix[i]);

            // Check result
            validResult = true;
            for (int j = result.length - 1; j > 0; j--) {
                if (result[j] < result[j - 1]) {
                    validResult = false;
                    break;
                }
            }

            System.out.println("Result array: \n" + Arrays.toString(result));
            System.out.println("Valid result: " + validResult + "\n");
        }

        System.out.println();
    }
}
