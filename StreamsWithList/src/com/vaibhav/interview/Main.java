package com.vaibhav.interview;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        List<Integer> list = new ArrayList<Integer>(){{
                add(10);
                add(30);
                add(50);
                add(60);
        }};

        System.out.println(list.stream().filter(x -> x > 30).count());


    }
}
