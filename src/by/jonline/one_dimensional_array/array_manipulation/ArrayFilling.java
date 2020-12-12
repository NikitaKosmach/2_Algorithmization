package by.jonline.one_dimensional_array.array_manipulation;

public class ArrayFilling {
    /* Class creates and fills different types of arrays. */
    /*
     * elementNumber variable is number of element in array range variable is range
     * of random element in array (from 0 up to range)
     */
    static public int[] createRandomNaturalArray(int elementNumber, int range) {
        int[] result = new int[elementNumber];
        // Fill a arrays
        for (int i = 0; i < elementNumber; i++) {
            result[i] = (int) Math.round(Math.random() * range);
        }
        return result;
    }

    /*
     * elementNumber variable is number of element in array range variable is range
     * of random element in array (from -range up to range)
     */
    static public double[] createRandomRealArray(int elementNumber, int range) {
        double[] result = new double[elementNumber];
        // Fill a arrays
        for (int i = 0; i < elementNumber; i++) {
            result[i] = (Math.random() * 2 * range) - range;
        }
        return result;
    }
    
    static public int[] createRandomRealIntArray(int elementNumber, int range) {
        int[] result = new int[elementNumber];
        // Fill a arrays
        for (int i = 0; i < elementNumber; i++) {
            result[i] = (int) (Math.random() * 2 * range) - range;
        }
        return result;
    }
}
