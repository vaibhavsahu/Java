package com.vaibhavsahu.interviews;

/*
* Author: Vaibhav Sahu
* Topic: Dynamic Programming(Top Down Approach)
* Problem: Max Cut Rod Problem
*
* */

public class Main {


    public static int CutRod_Aux(int[] p, int n, int [] r){
        int cost = 0;
        if (r[n] >= 0){
            return r[n];
        }
        if (n == 0)
             cost = 0;
        else{
            cost = Integer.MIN_VALUE;
            for (int i = 1; i <= n; i++) {
                cost = Integer.max(cost, p[i]+CutRod_Aux(p, n-i, r));
            }
            r[n] = cost;

        }
        return cost;

    }
    public static int CutRod(int[] prices, int n){
        int[] revs = new int[n+1];
        //int profit = 0;

        for (int i = 0; i <= n; i++) {
            revs[i] = -1;
        }
        return CutRod_Aux(prices, n, revs);
    }
    public static void main(String[] args) {
	// write your code here
        int[] prices = {3, 5, 8, 9, 10, 17, 17, 20};

        System.out.println(CutRod(prices, prices.length));
    }
}
