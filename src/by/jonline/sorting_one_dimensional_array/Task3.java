package by.jonline.sorting_one_dimensional_array;

import java.util.Arrays;

public class Task3 {
    /*
     * 3. Сортировка выбором. Дана последовательность чисел a[1] <= a[2] <= .. a[n]
     * .Требуется переставить элементы так, чтобы они были расположены по убыванию.
     * Для этого в массиве, начиная с первого, выбирается наибольший элемент и
     * ставится на первое место, а первый - на место наибольшего. Затем, начиная со
     * второго, эта процедура повторяется. Написать алгоритм сортировки выбором.
     */

    public static int[] sort(int[] array) {

        int tempMax;
        int temp;

        // Create first array
        for (int j = 0; j < array.length; j++) {
            // Find max in sequence
            tempMax = array[j];
            for (int k = j; k < array.length; k++) {
                if (tempMax < array[k]) {
                    temp = array[k];
                    array[k] = tempMax;
                    tempMax = temp;
                }
            }
            array[j] = tempMax;
        }

        return array;

    }

    /*
     * Test function
     */
    public static void main(String[] args) {

        int[][] arrayMatrix = new int[9][0];

        int[] result;
        boolean validResult;

        arrayMatrix[0] = Task2.createArray(-5, 5);
        arrayMatrix[1] = Task2.createArray(0, 5);
        arrayMatrix[2] = Task2.createArray(0, 5);
        arrayMatrix[3] = Task2.createArray(-4, 3);
        arrayMatrix[4] = Task2.createArray(-5, -1);
        arrayMatrix[5] = Task2.createArray(2, 10);
        arrayMatrix[6] = Task2.createArray(-5, 5);
        arrayMatrix[7] = Task2.createArray(-5, 5);
        arrayMatrix[8] = Task2.createArray(-5, -2);

        System.out.println("One-dimensional array. Sorting. Task 3.");
        for (int i = 0; i < arrayMatrix.length; i++) {

            System.out.println("Not sorted array: " + Arrays.toString(arrayMatrix[i]));

            result = Task3.sort(arrayMatrix[i]);

            // Check result
            validResult = true;
            for (int j = result.length - 1; j > 0; j--) {
                if (result[j] > result[j - 1]) {
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
