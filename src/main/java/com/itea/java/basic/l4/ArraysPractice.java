package com.itea.java.basic.l4;

import java.util.Arrays;
import java.util.Random;

public class ArraysPractice {

    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        int[] array1 = new int[10];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = RANDOM.nextInt(100);
        }

//        int[] array2 = new int[array1.length];
        int[] array2 = Arrays.copyOf(array1, array1.length);
        for (int i = 0; i < array2.length; i++) {
            array2[i] = array1[i];
        }

        array1[1] = 0;
        array1[2] = 0;
        printArray(array1);
        printArray(array2);
    }

    private static void printArray(int[] array) {
        for (int current : array) {
            System.out.print(current + " ");
        }
        System.out.println();
    }
}
