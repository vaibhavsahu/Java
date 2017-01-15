package com.vaibhavsahu.interviews;

/*
* Author: Vaibhav Sahu
* Problem: Minimum Cost Path in a 2D matrix
* Topic: Dynamic Programming
*
* */

public class Main {
    public static int minCostPath(int [][] arr){
        int [][] cost = new int[arr.length][arr.length];

        cost[0][0] = arr[0][0];

        for (int i = 1; i < arr.length; i++) {
            cost[0][i] = arr[0][i] + cost[0][i-1];
        }

        for (int j = 1; j < arr.length; j++) {
            cost[j][0] = arr[j][0] + cost[j-1][0];
        }

        for (int i = 1; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                cost[i][j] = arr[i][j] + Math.min(cost[i-1][j], cost[i][j-1]);
            }
        }
        return cost[arr.length-1][arr.length-1];
    }

    public static void main(String[] args) {
        int[][] arr = { { 1, 7, 9, 2 }, { 8, 6, 3, 2 }, { 1, 6, 7, 8 },
                { 2, 9, 8, 2 } };

        System.out.println("The minimum cost for the path is : " + minCostPath(arr));
    }
}
