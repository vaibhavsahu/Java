/*
https://www.hackerrank.com/challenges/insertionsort1
Author: Vaibhav Sahu


*/


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    

    public static void insertIntoSorted(int[] ar) {
        // Fill up this function  
        for(int i = 1; i < ar.length; i++){
            int j = i;
            while(j > 0 && ar[j-1] > ar[j]){
                int temp = ar[j-1];
                ar[j-1] = ar[j];
                ar[j]=temp;
                j = j-1;
            }
            printArray(ar);
        }
    }
    
    
/* Tail starts here */
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
         for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
         }
         insertIntoSorted(ar);
    }
    
    
    private static void printArray(int[] ar) {
      for(int n: ar){
         System.out.print(n+" ");
      }
        System.out.println("");
   }
    
    
}
