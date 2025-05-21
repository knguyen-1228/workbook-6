package com.pluralsight;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        //create list people
        List<Person> people = new ArrayList<Person>();
        //adding to list of people
        people.add(new Person("Kevin","Nguyen",25));
        people.add(new Person("Alice","Johnson", 34));
        people.add(new Person("Bob","Smith",28));
        people.add(new Person("Carol","Williams",42));
        people.add(new Person("David","Brown",19));
        people.add(new Person("Eve","Jones", 50));
        people.add(new Person("Frank","Miller",14));
        people.add(new Person("Grace","Davis",65));
        people.add(new Person("Hank","Wilson",79));
        people.add(new Person("Jack","Taylor",40));
        //asking user for first or last name to search
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a first or last name to search: ");
        String searchName = scanner.nextLine();
        //search by first or last name
        List<Person> matchingName = people.stream()
                .filter(person -> person.getFirstName().equalsIgnoreCase(searchName) || person.getLastName().equalsIgnoreCase(searchName))
                .toList();

        if(matchingName.isEmpty()){
            System.out.println("Nobody was found under the name: " + searchName);
        }else {
            System.out.println("People under the name: " + searchName);
            matchingName.forEach(person -> System.out.println(matchingName));
        }
        //average age
        double totalAge = people.stream()
                .mapToInt(person -> person.getAge())
                .sum();
        System.out.println("Average age: " + (totalAge / people.size()));
        //oldest
        int oldestAge = people.stream()
                .mapToInt(person -> person.getAge())
                .max()
                .orElse(-1);
        if(oldestAge == -1){
            System.out.println("No ages found");
        }else {
            System.out.println("Oldest age: " + oldestAge);
        }
        //youngest
        int youngestAge = people.stream()
                .mapToInt(person -> person.getAge())
                .min()
                .orElse(-1);
        if(youngestAge == -1){
            System.out.println("No ages found");
        }else {
            System.out.println("Youngest age: " + youngestAge);
        }

    }
}
