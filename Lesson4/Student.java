package model;

public class Student {

    private String firstName;
    private String lastName;
    private char gender;
    private int year = 1995;
    private double mark;

    public boolean isArmenian() {

        return isArmenian;
    }

    public void setArmenian(boolean armenian) {

        isArmenian = armenian;
    }

    private boolean isArmenian;


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

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year >= 1950) {
            this.year = year;
        }

    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }


    public int sum(int a, int b) {
        return a + b;
    }

    public void printInfo() {
        System.out.println("Name is:" + " " + firstName + " " + "Surname is:" + " " + lastName + " " + "Year is:" + " " + year + " " + "Gender is:" + " " + gender + " " + "Mark is:" + " " + mark + " " + "Is Armenian:" + " " + isArmenian + " ");
    }

}