package by.jonline.one_dimensional_array.array_manipulation;

import java.util.ArrayList;

public class ArrayMathTestDrive {
    public static void main(String[] args) {
        ArrayList<Integer> inputA = new ArrayList<Integer>();
        inputA.add(1);
        inputA.add(2);
        inputA.add(3);
        inputA.add(6);
        boolean result;

        // Check findMaxInArray
        result = ArrayMath.findMaxInArray(inputA) == 6;
        System.out.println("ArrayMathTestDrive::findMaxInArray test status: " + result);

        // Check findMaxPosition
        ArrayList<Integer> maxValuePosition = ArrayMath.findMaxPosition(inputA);
        result = maxValuePosition.get(0) == 3;
        System.out.println("ArrayMathTestDrive::findMaxPosition test status: " + result);
        
        // Check findMinInArray
        result = ArrayMath.findMinInArray(inputA) == 1;
        System.out.println("ArrayMathTestDrive::findMaxInArray test status: " + result);

        // Check findMinPosition
        ArrayList<Integer> minValuePosition = ArrayMath.findMinPosition(inputA);
        result = minValuePosition.get(0) == 0;
        System.out.println("ArrayMathTestDrive::findMaxPosition test status: " + result);
    }
}
