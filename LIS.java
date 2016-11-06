/*
https://www.hackerrank.com/challenges/longest-increasing-subsequent
Author: Vaibhav Sahu
*/
package com.vaibhav.interviews;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    private static void LIS(int[] arr, int n){
        int[] table = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            table[i]=1;
        }
        int maxLength = 1;
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if(arr[i] > arr[j] && table[i]<table[j]+1){
                    table[i] = table[j]+1;
                    if(maxLength < table[i]){
                        maxLength = table[i];
                    }
                }

            }
        }

        System.out.println(maxLength);
    }
    public static void main(String[] args) throws IOException{
	// write your code here
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String read;
        StringTokenizer st;
        //StringBuilder sb = new StringBuilder();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        while ((read = bufferedReader.readLine()) != null && read.length() > 0){
            st = new StringTokenizer(read);
            while (st.hasMoreTokens()){
                arrayList.add(Integer.parseInt(st.nextToken()));
            }
        }

        int[] arr = arrayList.stream().mapToInt(i -> i).toArray();

        LIS(arr, arr.length);
    }
}
