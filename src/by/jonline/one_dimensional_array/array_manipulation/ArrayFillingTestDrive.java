package by.jonline.one_dimensional_array.array_manipulation;

public class ArrayFillingTestDrive {
    public static void main(String[] args) {    
        int elementNumber = 10;
        int range = 10;
        
        // Check createRandomNaturalArray
        int[] a = ArrayFilling.createRandomNaturalArray(elementNumber, range);
        
        boolean result = true;
        for (int i = 0; i < elementNumber; i++) {
            if ((a[i] > range) || (a[i] < 0)) {
                result = false;
                break;
            }
        }
        
        System.out.println("ArrayFillingTestDrive::createRandomNaturalArray test status: " + result);
        
        // Check createRandomRealArray
        double[] b = ArrayFilling.createRandomRealArray(elementNumber, range);
        
        result = true;
        for (int i = 0; i < elementNumber; i++) {
            if ((b[i] > range) || (b[i] < -range)) {
                result = false;
                break;
            }
        }
                
        System.out.println("ArrayFillingTestDrive::createRandomRealArray test status: " + result);
    }
}
