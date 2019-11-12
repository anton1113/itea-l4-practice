package com.itea.java.basic.l4;

import java.util.Arrays;

public class ArraysSort {

    public static void main(String[] args) {
       int[] array = {3, 4, 1, 2, 5};
       array = sort(array);
       printArray(array);

       int[] array2 = {5, 4, 2, 1, 3};
        Arrays.sort(array2);
        System.out.println(Arrays.toString(array2));
    }

    public static int[] sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] < array[j]) {
                    int tmp = array[j];
                    array[j] = array[i];
                    array[i] = tmp;
                }
            }
        }
        return array;
    }

    private static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
