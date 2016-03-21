package com.company;

public class User {
    private int age;
    private final Gender gender;

    public User(Gender gender, int age) {
        this.gender = gender;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", gender=" + gender +
                '}';
    }
}
