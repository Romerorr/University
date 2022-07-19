package model;

import base.People;

public class Student extends People {


    public Student(String name, String surname, int age, String gender, Address address) {
        super(name, surname, age, gender, address);

    }
    @Override
    public String toString () {
        return getSurname() + " " + getName();
    }

    @Override
    public int compareTo(People people) {
        return 0;
    }
}
