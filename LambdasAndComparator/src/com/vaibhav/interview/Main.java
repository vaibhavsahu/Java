package com.vaibhav.interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Person> personList = new ArrayList<Person>(){{
            add(new Person("vaibhav", "sahu", 20, Gender.MALE));
            add(new Person("himanshu", "agrawal", 21, Gender.MALE));
            add(new Person("jeetu", "gupta", 25, Gender.MALE));
            add(new Person("vineet", "dubey", 27, Gender.MALE));
        }};


        Collections.sort(personList, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getGivenName().compareTo(o2.getGivenName());
            }
        });

        for (Person p : personList) {
            System.out.println(p.getGivenName() + ", "+ p.getSurName());
        }

        Collections.sort(personList, (Person p1, Person p2)-> p1.getSurName().compareTo(p2.getSurName()));

        for (Person p : personList) {
            System.out.println(p.getGivenName() + ", "+ p.getSurName());
        }
    }
}
