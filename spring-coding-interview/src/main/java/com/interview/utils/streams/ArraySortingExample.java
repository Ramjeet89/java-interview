package com.interview.utils.streams;

public class ArraySortingExample {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 2, 5, 4, 6, 5, 5, 9, 8, 7};
        System.out.println(sortArray(arr));
    }

    private static boolean sortArray(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            System.out.println(arr[i]);
        }
        return true;
    }
}
