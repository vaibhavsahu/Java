/*
https://www.hackerrank.com/challenges/maxsubarray
Author: Vaibhav Sahu
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void printMaxSum(ArrayList<Integer> arr){
    int max_ending_here = 0;
    int max_so_far = Integer.MIN_VALUE;
    for(int i : arr){
        max_ending_here = Math.max(i, max_ending_here+i);
        max_so_far = Math.max(max_so_far, max_ending_here);
    }
    System.out.print(max_so_far + " ");

    Collections.sort(arr);
    int sum = 0;
    if(arr.get(arr.size()-1) <= 0){
        sum = arr.get(arr.size()-1);
    }else
    {
        for(int i : arr){
            if(i > 0){
                sum+=i;
            }
        }
    }
    System.out.println(sum);
}

    public static void main(String[] args) throws IOException{
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String read;
        StringTokenizer st;

        ArrayList<ArrayList<Integer>> listoflist = new ArrayList<ArrayList<Integer>>();
        while ((read = bufferedReader.readLine()) != null && read.length() >= 1) {
                st = new StringTokenizer(read, " ");
            ArrayList<Integer> list = new ArrayList<Integer>();
                while (st.hasMoreTokens()){
                    list.add(Integer.parseInt(st.nextToken()));
                }
                listoflist.add(list);
            }

//        Iterator<ArrayList<Integer>> it = listoflist.iterator();
//        while(it.hasNext()){
//            Iterator<Integer> it1 = it.next().iterator();
//            while(it1.hasNext()){
//                System.out.println(it1.next());
//            }
//        }

        ArrayList<Integer> loop = listoflist.get(0);
        int loopcount =loop.get(0);
        for (int i = 2; i <= loopcount*2; i=i+2) {
            ArrayList<Integer> array = listoflist.get(i);
            printMaxSum(array);
        }

    }
}
