package base;

import model.Address;

public abstract class People implements Comparable <People> {
    private String name;
    private String surname;
    private int age;
    private String gender;
    private Address address;

    public People(String name, String surname, int age, String gender, Address address) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
        this.address = address;
    }

    public String toString(){
        return getSurname()+" "+getName();
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Address getAddress() {
        return address;
    }
    public void setAddress(Address address) {
        this.address = address;
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
