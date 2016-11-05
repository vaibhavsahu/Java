/*
https://www.hackerrank.com/challenges/fibonacci-modified
Author: Vaibhav Sahu

*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    static BigInteger fib(int n, BigInteger first_term, BigInteger Second_term)
    {

        BigInteger[] series = new BigInteger[n];
        series[0]=first_term;
        series[1]=Second_term;
        int i = 0;
        for (i = 2; i < n; i++)
        {
            series[i] = series[i-2].add(series[i-1].multiply(series[i-1]));
        }

        return series[n-1];
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
    int[] integers = new int[3];
    for(int i = 0; i < 3; i++)
    {
        integers[i] = sc.nextInt();
    }
        BigInteger first_term = BigInteger.valueOf(integers[0]);
        BigInteger second_term = BigInteger.valueOf(integers[1]);
        int termToBeFound = integers[2];
        
        System.out.println(fib(termToBeFound, first_term, second_term));
        
        
    }
}
