package model;

import type.People;

public class Student extends People {


    public Student(String name, String surname, int age, Address address) {
        super(name, surname, age, address);

    }
    @Override
    public String toString () {
        return getName()+" "+getSurname();
    }

    public void studentInfo () {
        System.out.println ("Name of student: "+getName());
        System.out.println ("Surname of student: "+getSurname());
        System.out.println ("Age of student: "+getAge());
        System.out.println ("Address of student: "+getAddress());

    }

}
