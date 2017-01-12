package com.vaibhavsahu.interviews;

/*
*Author: Vaibhav Sahu
* Topic: Dynamic Programming
* Problem: Edit Distance
* */


public class Main {

    public static int minEditDistance(String s1, String s2){
        //public static int minDistance(String s1, String s2) {
            int l1 = s1.length();
            int l2 = s2.length();

            // len1+1, len2+1, because finally return dp[len1][len2]
            int[][] length = new int[l1 + 1][l2 + 1];

            for (int i = 0; i <= l1; i++) {
                length[i][0] = i;
            }

            for (int j = 0; j <= l2; j++) {
                length[0][j] = j;
            }

            //iterate though, and check last char
            for (int i = 0; i < l1; i++) {
                char c1 = s1.charAt(i);
                for (int j = 0; j < l2; j++) {
                    char c2 = s2.charAt(j);

                    //if last two chars equal
                    if (c1 == c2) {
                        //update dp value for +1 length
                        length[i + 1][j + 1] = length[i][j];
                    } else {
                        int replace = length[i][j] + 1;
                        int insert = length[i][j + 1] + 1;
                        int delete = length[i + 1][j] + 1;

                        int min = replace > insert ? insert : replace;
                        min = delete > min ? min : delete;
                        length[i + 1][j + 1] = min;
                    }
                }
            }

            return length[l1][l2];
    }

    public static void main(String[] args) {
	// write your code here
        String s1 = "sunday";
        String s2 = "saturday";

        System.out.println(minEditDistance(s1, s2));

    }
}
