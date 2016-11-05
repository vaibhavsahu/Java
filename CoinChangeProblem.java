/*
https://www.hackerrank.com/challenges/coin-change
Author: Vaibhav Sahu
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
        public static long makeChange(ArrayList<Integer> arr, int sum){
        return makeChange(arr, sum, 0, new HashMap<String, Long>());
    }

    public static long makeChange(ArrayList<Integer> arr, int sum, int index, HashMap<String, Long> memo){
        if (sum == 0)
            return 1;
        if(index >= arr.size())
            return 0;
        String key = sum + "-" + index;
        if(memo.containsKey(key)){
            return memo.get(key);
        }
        int amountWithCoin = 0;
        long ways = 0;
        while(amountWithCoin <= sum){
            int remaining = sum-amountWithCoin;
            ways+=makeChange(arr, remaining, index+1, memo);
            amountWithCoin+=arr.get(index);
        }
        memo.put(key, ways);
        return ways;


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
        ArrayList<Integer> arrayList1 = listoflist.get(0);
        ArrayList<Integer> arrayList2 = listoflist.get(1);

        int total = arrayList1.get(0);
        System.out.println(makeChange(arrayList2, total));




    }
 
}
