package _04interfaces.E9_11;

/*
Implement a superclass Person. Make two classes, Student and Instructor, that inherit from Person.
A person has a name and a year of birth. A student has a major, and an instructor has a salary.
Write the class declarations, the constructors, and the methods toString for all classes.
Supply a test program that tests these classes and methods.
*/

public class Person {
    private String name;
    private int birthYear;

    public Person(){
        name = "";
        birthYear = 0;
    }

    public void setName(String fullName){
        name = fullName;
    }
    public void setBirthYear(int year){
        birthYear = year;
    }
    public String getName(){
        return name;
    }
    public int getBirthYear(){
        return birthYear;
    }

    @Override
    public String toString(){
        return getName()+" was born in "+getBirthYear();
    }
}
