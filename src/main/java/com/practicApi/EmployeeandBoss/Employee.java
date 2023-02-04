package com.practicApi.EmployeeandBoss;

public class Employee {
    private int rating;
    private int yearOfExperince;

    private int age;

    public Employee() {
    }

    public Employee(int rating, int yearOfExperince, int age) {
        this.rating = rating;
        this.yearOfExperince = yearOfExperince;
        this.age = age;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getYearOfExperince() {
        return yearOfExperince;
    }

    public void setYearOfExperince(int yearOfExperince) {
        this.yearOfExperince = yearOfExperince;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
