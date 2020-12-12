package by.jonline.sorting_one_dimensional_array;

import java.util.Arrays;

import by.jonline.one_dimensional_array.array_manipulation.ArrayFilling;

public class Task4 {
    /*
     * 4. Сортировка обменами. Дана последовательность чисел  a[1],a[2],...,a[n].
     * Требуется переставить числа в порядке возрастания. Для этого сравниваются
     * два соседних числа a[i] и a[i+1]. Если a[i] > a[i+1] , то делается перестановка. Так
     * продолжается до тех пор, пока все элементы не станут расположены в порядке
     * возрастания. Составить алгоритм сортировки, подсчитывая при этом количества
     * перестановок.
     */

    /*
     * Function sorts array in increasing order 
     * OUTPUT:
     * int[0] - massive of sorted data
     * int[1] - number of changes
     */
    public static int[][] sort(int[] array) {

        boolean allElementInTrue;
        int[][] result = new int[2][1];
        int changeNumber = 0;
        int temp;
        
        do {
            allElementInTrue = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    changeNumber++;
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    allElementInTrue = false;
                }
            }
        } while (!allElementInTrue);

        result[0] = array;
        result[1][0] = changeNumber;
        return result;

    }

    /*
     * Test function
     */
    public static void main(String[] args) {

        int[][] arrayMatrix = new int[4][0];

        int[][] result;
        boolean validResult;

        arrayMatrix[0] = ArrayFilling.createRandomRealIntArray(5, 5);
        arrayMatrix[1] = ArrayFilling.createRandomRealIntArray(5, 10);
        arrayMatrix[2] = ArrayFilling.createRandomRealIntArray(8, 16);
        arrayMatrix[3] = ArrayFilling.createRandomRealIntArray(100, 50);

        System.out.println("One-dimensional array. Sorting. Task 4.");
        for (int i = 0; i < arrayMatrix.length; i++) {

            System.out.println("Not sorted array: " + Arrays.toString(arrayMatrix[i]));

            result = Task4.sort(arrayMatrix[i]);

            // Check result
            validResult = true;
            for (int j = result[0].length - 1; j > 0; j--) {
                if (result[0][j] < result[0][j - 1]) {
                    validResult = false;
                    break;
                }
            }

            System.out.println("Result array: \n" + Arrays.toString(result[0]));
            System.out.println("Number of changes: " + result[1][0]);
            System.out.println("Valid result: " + validResult + "\n");
        }

        System.out.println();
    }
}
