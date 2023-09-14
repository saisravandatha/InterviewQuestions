package com.interview.questions;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class SumOfLargestNumbersInTwoArrays {

    public static void main(String[] args) {
        int[] array1 = {2,4,5,7,8,9};
        int[] array2 = {10,11,13,15,16};
        //Collections.reverseOrder() only works on wrapped Classes that why we used boxed() to convert normal int[] to Integer[]
        // boxed() - a Stream consistent of the elements of this stream, each boxed to an Integer
        int maxValueOfArray1 = Arrays.stream(array1).boxed().sorted(Collections.reverseOrder()).findFirst().get();
        int maxValueOfArray2 = Arrays.stream(array2).boxed().sorted(Collections.reverseOrder()).findFirst().get();
        System.out.println(maxValueOfArray1 + maxValueOfArray2);
    }
}
