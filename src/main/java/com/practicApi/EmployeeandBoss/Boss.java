package com.practicApi.EmployeeandBoss;

public class Boss {
    private String name;
    private int yearOfExperience;
    private int age;
    private int salary;
    private int rating;

    public Boss() {
    }

    public Boss(String name, int yearOfExperience, int age, int salary, int rating) {
        this.name = name;
        this.yearOfExperience = yearOfExperience;
        this.age = age;
        this.salary = salary;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfExperience() {
        return yearOfExperience;
    }

    public void setYearOfExperience(int yearOfExperience) {
        this.yearOfExperience = yearOfExperience;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
