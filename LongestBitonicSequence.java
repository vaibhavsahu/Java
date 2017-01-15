package com.vaibhavsahu.interviews;

/*
* Author: Vaibhav Sahu
* Problem: Longest Bitonic Sequence
* Topic: Dynamic Programming
* */

public class Main {
    public static int LongestBitonicSequence(int[] arr, int n){
        int[] LIS = new int[n];

        for (int i = 0; i < n; i++) {
            LIS[i] = 1;
        }

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if(arr[i] > arr[j] && LIS[i] < LIS[j] +1){
                    LIS[i] = LIS[j] + 1;
                }
            }
        }

        int [] LDS = new int[n];
        for (int i = 0; i < n; i++) {
            LDS[i] = 1;
        }

        for (int i = n-2; i >= 0; i--) {
            for (int j = n-1; j > i; j--) {
                if(arr[i] > arr[j] && LDS[i] < LDS[j] +1){
                    LDS[i] = LDS[j] + 1;
                }
            }
        }

        int max = LIS[0] + LDS[0] - 1;
        for (int i = 1; i < n; i++)
            if (LIS[i] + LDS[i] - 1 > max)
                max = LIS[i] + LDS[i] - 1;

        return max;

    }

    public static void main(String[] args) {
	int [] arr = {0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15};

        System.out.println("The longest Bitonic Sequence is : " + LongestBitonicSequence(arr, arr.length));
    }
}
