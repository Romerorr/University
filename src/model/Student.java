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
        System.out.println ("Имя студента: "+getName());
        System.out.println ("Фамилия студента: "+getSurname());
        System.out.println ("Возраст студента: "+getAge());
        System.out.println ("Адресс студента: "+getAddress());

    }

}
