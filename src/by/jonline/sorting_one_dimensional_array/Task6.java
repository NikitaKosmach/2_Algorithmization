package by.jonline.sorting_one_dimensional_array;

import java.util.Arrays;

import by.jonline.one_dimensional_array.array_manipulation.ArrayFilling;

public class Task6 {
	/*
     * 6. Сортировка Шелла. Дан массив n действительных чисел. Требуется упорядочить его по возрастанию.
	 * Делается это следующим образом: сравниваются два соседних элемента ai и ai + 1 . Если ai <= ai + 1 , то продвигаются
	 * на один элемент вперед. Если ai > ai + 1 , то производится перестановка и сдвигаются на один элемент назад.
	 * Составить алгоритм этой сортировки.
     */
	
    /*
     * Function sorts array in increasing order 
     */
    public static int[] sort(int[] array) {

        int tempElement;
        int currentCnt = 1;
                
        while (currentCnt < array.length) {
        	if (array[currentCnt - 1] > array[currentCnt]) {
        		tempElement = array[currentCnt - 1];
        		array[currentCnt - 1] = array[currentCnt];
        		array[currentCnt] = tempElement;
        		if (currentCnt > 1) {
        			currentCnt--;
        		}
        	} else { 
        		currentCnt++; 
    		}
        }
        return array;
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

        System.out.println("One-dimensional array. Sorting. Task 6.");
        for (int i = 0; i < arrayMatrix.length; i++) {

            System.out.println("Not sorted array: " + Arrays.toString(arrayMatrix[i]));

            result = Task6.sort(arrayMatrix[i]);

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

