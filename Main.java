package com.vaibhav.interview;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

//import io.javabrains.common.Person;

public class Main {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Charles", "Dickens", 60),
                new Person("Lewis", "Carroll", 42),
                new Person("Thomas", "Carlyle", 51),
                new Person("Charlotte", "Bronte", 45),
                new Person("Matthew", "Arnold", 39)
        );

        // Step 1: Sort list by last name

        people.sort((p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));

        //Alternatively, use Predicate
        Predicate<Person> predicate = p -> p.getLastName().startsWith("C");

        // Step 2: Create a method that prints all elements in the list
        people.stream().forEach(p -> System.out.println(p));

        // Step 3: Create a method that prints all people that have last name beginning with C
        people.stream().filter(p -> p.getLastName().startsWith("C")).forEach(p -> System.out.println(p));

        //using predicate
        people.stream().filter(p -> predicate.test(p)).forEach(person -> System.out.println(person));

    }

}
