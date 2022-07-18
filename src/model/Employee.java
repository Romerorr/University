package model;

import type.People;

public class Employee extends People {

    public Employee(String name, String surname, int age, String gender, Address address) {
        super(name, surname, age, gender, address);
    }

    @Override
    public String toString() {
        return getName() + " " + getSurname();
    }
}
