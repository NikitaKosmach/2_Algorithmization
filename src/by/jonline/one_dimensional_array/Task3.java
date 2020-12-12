package by.jonline.one_dimensional_array;

public class Task3 {
    /*
     * 3. Дан массив действительных чисел, размерность которого N. Подсчитать,
     * сколько в нем отрицательных, положительных и нулевых элементов.
     */
    public static void main(String[] args) {

        double[] a = { 1, 2, 3, 0, -1, -5, -0.5, -513.53, 831.543, 0 };

        System.out.println("One-dimensional array. Task 3.");

        // Replace all number of a array more then z
        int zerosNumber = 0;
        int positiveNumber = 0;
        int negativeNumber = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                zerosNumber++;
            }
            if (a[i] > 0) {
                positiveNumber++;
            }
            if (a[i] < 0) {
                negativeNumber++;
            }
        }
        System.out.println("Zeros number: " + zerosNumber);
        System.out.println("Positive number: " + positiveNumber);
        System.out.println("Negative number: " + negativeNumber);
    }
}
