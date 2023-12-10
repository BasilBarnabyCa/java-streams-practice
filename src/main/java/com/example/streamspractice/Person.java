package com.example.streamspractice;

import java.util.List;

public class Person {
    private String name;

    private int age;

    private Gender gender;

    private Occupation occupation;

    private List<Hobby> hobbies;

    public  Person(String name, int age, Gender gender, List<Hobby> hobbies) {
        setName(name);
        setAge(age);
        setGender(gender);
        setHobbies(hobbies);
    }

    public Person(String name, int age, Gender gender, Occupation occupation, List<Hobby> hobbies) {
        setName(name);
        setAge(age);
        setGender(gender);
        setOccupation(occupation);
        setHobbies(hobbies);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Occupation getOccupation() {
        return occupation;
    }

    public void setOccupation(Occupation occupation) {
        this.occupation = occupation;
    }

    public List<Hobby> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<Hobby> hobbies) {
        this.hobbies = hobbies;
    }

    @Override
    public String toString() {
        return String.format("%s is %d years old and is %s", getName(), getAge(), getGender());
    }
}
