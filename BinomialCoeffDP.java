package com.vaibhavsahu.interviews;

/*
*Author: Vaibhav Sahu
* Problem: Binomial Coefficients Computation
* Topic: Dynamic Programming
* */

public class Main {
    public static int BinomialCoeff(int n, int k){
        int Coeff[][] = new int[n+1][k+1];
        for (int i = 0; i <= n ; i++) {
            for (int j = 0; j <= Math.min(i, k); j++) {
                if (j == 0 || i == j){
                    Coeff[i][j] = 1;
                }else
                {
                    Coeff[i][j] = Coeff[i-1][j-1]+ Coeff[i-1][j];
                }
            }
        }
        return Coeff[n][k];
    }

    public static void main(String[] args) {
	int n = 5, k =3;
        System.out.println("The computed Binomial Coefficient is : "+ BinomialCoeff(n, k));
    }
}
