package by.jonline.one_dimensional_array.array_manipulation;

import java.util.ArrayList;

public class ArrayMath {
    public static ArrayList<Integer> findMaxPosition(ArrayList<Integer> input) {
        int maxValue = findMaxInArray(input);
        
        return ArrayMath.compare(maxValue, input);
    }
    
    public static ArrayList<Integer> findMaxPosition(int[] input) {
        int maxValue = findMaxInArray(input);
        
        return ArrayMath.compare(maxValue, input);
    }
    
    public static int findMaxInArray(ArrayList<Integer> input) {
        int result = input.get(0);
        for (int i = 1; i < input.size(); i++) {
            if (input.get(i) > result) {
                result = input.get(i);
            }
        }
        return result;        
    }
    
    public static int findMaxInArray(int[] input) {
        int result = input[0];
        for (int i = 1; i < input.length; i++) {
            if (input[i] > result) {
                result = input[i];
            }
        }
        return result;        
    }
    
    public static ArrayList<Integer> findMinPosition(ArrayList<Integer> input) {
        int maxValue = findMinInArray(input);
        
        return ArrayMath.compare(maxValue, input);
    }
    
    public static int findMinInArray(ArrayList<Integer> input) {
        int result = input.get(0);
        for (int i = 1; i < input.size(); i++) {
            if (input.get(i) < result) {
                result = input.get(i);
            }
        }
        return result;        
    }

    public static ArrayList<Integer> compare(int compareValue, 
                                              ArrayList<Integer> inputArray) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        for (int i = 0; i < inputArray.size(); i++) {
            if (inputArray.get(i) == compareValue) {
                result.add(i);
            } 
        }
        return result;
    }

    public static ArrayList<Integer> compare(int compareValue, int[] inputArray) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] == compareValue) {
            result.add(i);
            } 
        }
        return result;
    }

}
