package com.itea.java.basic.l4;

import java.util.Random;

public class ArraysMinMax {

    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        int[] array = randomArray();
        printArray(array);
        System.out.println(min(array));
        System.out.println(max(array));
    }

    private static int min(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int value : array) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }

    private static int max(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int value : array) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

    private static int[] randomArray() {
        int[] array = new int[RANDOM.nextInt(90) + 10];
        for (int i = 0; i < array.length; i++) {
            array[i] = RANDOM.nextInt(100);
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
