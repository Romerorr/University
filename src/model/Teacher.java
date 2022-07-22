package model;

import base.People;

public class Teacher extends People {

    public Teacher(String name, String surname, int age, String gender, Address address) {
        super(name, surname, age, gender, address);
    }

    @Override
    public String toString() {
        return getSurname() + " " + getName();
    }

    private int pay;
    private int st;
    private int hour = 8;
    private int prize = 5000;
    public float getPay() {
        return pay;
    }

    public void setPay() {
        this.pay = pay;
    }

    public float getSt() {
        return st;
    }

    public void setSt() {
        this.st = st;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public float getPrize() {
        return prize;
    }

    public void setPrize(int prize) {
        this.prize = prize;
    }

    public float salary(int st) {
        pay = (st * hour) * 22 + prize;
        System.out.println(getSurname() + " salary = " + pay);
        return pay;
    }
    public void teacherInfo() {
        System.out.println("Name of teacher: " + getName());
        System.out.println("Surname of teacher: " + getSurname());
        System.out.println("Age of teacher: " + getAge());
        System.out.println("Address of teacher: " + getAddress());
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