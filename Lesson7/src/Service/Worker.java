package Service;

import Methods.Functions;

public class Worker extends Functions {
    private String name;
    private String surname;
    private int year;
    private char gender;
    private boolean experience;




    public Worker(String name, String surname, int year, char gender, boolean experience) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.gender = gender;
        this.experience = experience;

    }

    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("Gender: " + (gender == 'm' ? "Male" : "Female"));
        System.out.println("Year: " + year);
        System.out.println("Experience: " + (experience ? "Yes" : "No"));

    }



    public char getGender() {

        return gender;
    }

    public void setGender(char gender) {

        this.gender = gender;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getSurname() {

        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getYear() {

        return year;
    }

    public void setYear(int year) {

        this.year = year;
    }


    public boolean isExperience() {

        return experience;
    }

    public void setExperience(boolean experience) {

        this.experience = experience;
    }
}
