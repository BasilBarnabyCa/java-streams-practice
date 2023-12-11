package com.example.streamspractice;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTester {
    public static void main(String[] args) {
        List<Person> people = getPeople();

        // Get all females
        System.out.println("Females");
        System.out.println("==============");
        List<Person> females = people.stream()
                .filter(person -> person.getGender().equals(Gender.FEMALE))
                .toList();
        females.forEach(System.out::println);
        System.out.println("--------------------------------------------------");

        // Get all males
        System.out.println("Males");
        System.out.println("==============");
        List<Person> males = people.stream()
                .filter(person -> person.getGender().equals(Gender.MALE))
                .toList();
        males.forEach(System.out::println);
        System.out.println("--------------------------------------------------");

        //Get all adults
        System.out.println("Adults");
        System.out.println("==============");
        List<Person> adults = people.stream()
                .filter(person -> person.getAge() >= 18)
                .toList();
        adults.forEach(System.out::println);
        System.out.println("--------------------------------------------------");

        // Get all children
        System.out.println("Minors");
        System.out.println("==============");
        List<Person> minors = people.stream()
                .filter(person -> person.getAge() < 18)
                .toList();
        minors.forEach(System.out::println);
        System.out.println("--------------------------------------------------");

        // Sort by age
        System.out.println("Sorted by Age");
        System.out.println("==============");
        List<Person> sorted = people.stream()
                .sorted(Comparator.comparing(Person::getAge).reversed().)
                .toList();
        sorted.forEach(System.out::println);
        System.out.println("--------------------------------------------------");


    }

    public static List<Person> getPeople() {
        return List.of(
                new Person("Basil Barnaby", 39, Gender.MALE, new Occupation("Software Engineer", 150000.00f, Sector.PRIVATE_SECTOR), List.of(new Hobby("Programming", 10, Tier.FAVOURITE), new Hobby("Gaming", 20, Tier.FAVOURITE), new Hobby("Reading", 30, Tier.NORMAL))),
                new Person("Alina Smith", 20, Gender.FEMALE, new Occupation("Barista", 30000.00f, Sector.PRIVATE_SECTOR), List.of(new Hobby("Reading", 10, Tier.FAVOURITE), new Hobby("Gaming", 20, Tier.NORMAL), new Hobby("Cooking", 5, Tier.FAVOURITE))),
                new Person("Helen White", 57, Gender.FEMALE, new Occupation("Teacher", 60000.00f, Sector.PUBLIC_SECTOR), List.of(new Hobby("Reading", 40, Tier.FAVOURITE), new Hobby("Singing", 20, Tier.NORMAL), new Hobby("Shopping", 5, Tier.NORMAL))),
                new Person("Alex Boz", 14, Gender.MALE, List.of(new Hobby("Basketball", 4, Tier.FAVOURITE), new Hobby("Drawing", 5, Tier.FAVOURITE), new Hobby("Baseball", 2, Tier.NORMAL))),
                new Person("Jamie Goa", 45, Gender.MALE, new Occupation("Firefighter", 135000.00f, Sector.PUBLIC_SECTOR), List.of(new Hobby("Racing", 10, Tier.FAVOURITE), new Hobby("Reading", 20, Tier.NORMAL))),
                new Person("Anna Cook", 7, Gender.FEMALE, List.of(new Hobby("Drawing", 5, Tier.FAVOURITE), new Hobby("Reading", 2, Tier.NORMAL))),
                new Person("Zelda Brown", 120, Gender.FEMALE, new Occupation("Retired", 0.00f, Sector.PRIVATE_SECTOR), List.of(new Hobby("Reading", 100, Tier.FAVOURITE), new Hobby("Gardening", 20, Tier.FAVOURITE), new Hobby("Knitting", 30, Tier.NORMAL)))
        );
    }
}
