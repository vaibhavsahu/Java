package com.vaibhav.interview;

import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        NavigableMap<Integer,String> navMap = new TreeMap<Integer, String>();

        navMap.put(1, "test");
        navMap.put(2, "testing");
        navMap.put(4, "NoTesting");
        navMap.put(5, "test");
        navMap.put(6, "testing");
        navMap.put(7, "NoTesting");
        navMap.put(8, "test");
        navMap.put(9, "testing");


        SortedMap<Integer, String> navigableMap1 = navMap.headMap(2);
        SortedMap<Integer, String> navigableMap2 = navMap.tailMap(2);

        SortedMap<Integer, String> navigableMap3 = navMap.subMap(2, 7);

        System.out.println(navigableMap1);
        System.out.println(navigableMap2);
        System.out.println(navigableMap3);




    }
}
