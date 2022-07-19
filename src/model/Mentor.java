package model;

import base.People;

import java.util.ArrayList;

public class Mentor extends People {
    private ArrayList <Teacher> arrayTeachers;
    public Mentor(String name, String surname, int age, String gender, Address address, ArrayList <Teacher> arrayTeachers) {
        super(name, surname, age, gender, address);
        this.arrayTeachers = arrayTeachers;
    }

    public ArrayList<Teacher> getArrayTeachers() {
        return arrayTeachers;
    }

    public void setArrayTeachers(ArrayList<Teacher> arrayTeachers) {
        this.arrayTeachers = arrayTeachers;
    }

    @Override
    public String toString () {
        return getSurname() + " " + getName();
    }

    @Override
    public int compareTo(People people) {
        if (this.getSurname().compareTo(people.getSurname()) == 0) {
            return this.getName().compareTo(people.getName());
        } else {
            return this.getSurname().compareTo(people.getSurname());
        }
    }
}
