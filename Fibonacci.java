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
    static BigInteger fib(int n)
    {

        BigInteger[] series = new BigInteger[n];
        series[0]=BigInteger.ZERO;
        series[1]=BigInteger.ONE;
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
        int termToBeFound = integers[2];
        
        System.out.println(fib(termToBeFound));
        
        
    }
}
