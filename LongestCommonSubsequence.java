package com.vaibhavsahu.interviews;

/*
* Author: Vaibhav Sahu
* Topic: Dynamic Programming
* Problem : Longest Common Subsequence
* String1 = "AGGTAB"
* String2 = "GXTXAYB"
* Expected length: 4(Sequence: GTAB)
* */

public class Main {

    public static int getLengthLCS(String s1, String s2, int m , int n){
        int [][] lengthLCS = new int[m+1][n+1];


        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if ( i == 0 || j == 0){
                    lengthLCS[i][j] = 0;
                }
                else if(s1.charAt(i-1) == s2.charAt(j-1)){
                    lengthLCS[i][j] = lengthLCS[i-1][j-1]+1;
                }else{
                    lengthLCS[i][j] = Math.max(lengthLCS[i-1][j], lengthLCS[i][j-1]);
                }

            }

        }
return lengthLCS[m][n];

    }

    public static void main(String[] args) {
	// write your code here
        String str1 = "AGGTAB";
        String str2 = "GXTXAYB";
        System.out.println(getLengthLCS(str1, str2, str1.length(), str2.length()));
    }
}
