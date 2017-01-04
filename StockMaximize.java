package com.vaibhavsahu.HackerRank;

//Stock Maximize


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        int numOfTestCases = scanner.nextInt();

        for (int i = 0; i < numOfTestCases; i++) {
            int numOfDays = scanner.nextInt();
            int[] prices = new int[numOfDays];
            for (int j = 0; j < numOfDays; j++) {
                prices[j] = scanner.nextInt();
            }
            System.out.println(getMaxProfit(prices));
        }
    }

    public static long getMaxProfit(int [] prices){
        long profit = 0L;
        int max_sofar = 0;

        for (int i = prices.length-1; i >= 0; i--) {
            if(prices[i] >= max_sofar){
                max_sofar = prices[i];
            }
            profit += max_sofar - prices[i];
        }

        return profit;
    }
}


