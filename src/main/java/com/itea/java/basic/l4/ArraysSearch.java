package com.itea.java.basic.l4;

public class ArraysSearch {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println(getIndex(array, 5));
        System.out.println(getIndex(array, 1));
    }

    private static int getIndex(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }
}
