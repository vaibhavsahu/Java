package com.vaibhav.interview;

/**
 * Created by vaibh on 7/10/2018.
 */
enum Gender{
    MALE, FEMALE;
}

public class Person {
    private String givenName;
    private String surName;
    private int age;
    private Gender gender;


    Person(String firstName, String lastName, int age, Gender gender){
        this.givenName = firstName;
        this.surName =  lastName;
        this.age = age;
        this.gender = gender;
    }

    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }
}
