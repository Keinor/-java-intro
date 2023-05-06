package com.nastyabelova.collections;

import java.util.Arrays;

public class ArraysExample {

    public void getArrays() {
        Integer[] intArray = new Integer[]{10, 0, 5, 1};
        System.out.printf("Длина массива = %d%n", intArray.length);

        for (Integer s : intArray) {
            System.out.println(s);
        }

        intArray[0] = 55;

        Arrays.sort(intArray);
        System.out.println(Arrays.toString(intArray));
    }
}
