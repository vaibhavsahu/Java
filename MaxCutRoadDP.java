package com.vaibhavsahu.interviews;

/*
* Author: Vaibhav Sahu
* Topic: Dynamic Programming(Top Down Approach)
* Problem: Max Cut Rod Problem
*
* */

import static java.lang.Math.*;

public class Main {

//Helper Method for Cut Rod
    public static int CutRod_Aux(int[] p, int n, int [] r){
        if(r[n]>0){
            return r[n];
        }
        int q;
        if(n==0) q=0;
        else{
            q=0;
            for(int i=0;i<n;i++){
                q=Math.max(q, p[i]+CutRod_Aux(p,n-i-1,r));
            }
        }
        r[n]=q;
        return q;
    }
    //Memoized Cut Rod 
    public static int CutRod(int[] prices, int n){
        int[] revs = new int[n+1];
        //int profit = 0;

        for (int i = 0; i < n; i++) {
            revs[i] = 0;
        }
        return CutRod_Aux(prices, n, revs);
    }
    public static void main(String[] args) {
	// write your code here
        int[] prices = {3, 5, 8, 9, 10, 17, 17, 20};

        System.out.println(CutRod(prices, prices.length));
    }
}
