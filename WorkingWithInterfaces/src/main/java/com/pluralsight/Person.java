package com.pluralsight;

public class Person implements Comparable<Person>{
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public int compareTo(Person other){
        if(this.getLastName().equalsIgnoreCase(other.getLastName())){
            if(this.getFirstName().equalsIgnoreCase(other.getFirstName())){
                return Integer.compare(this.age,other.age);
            }else {
                return this.getFirstName().compareToIgnoreCase(other.getFirstName());
            }
        }else {
            return this.lastName.compareToIgnoreCase(other.lastName);
        }
    }

    @Override
    public String toString(){
        return firstName + " " + lastName + ", age " + age;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
