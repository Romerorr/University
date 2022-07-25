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
    private double pay;
    private double st;
    private double hour = 8;
    private double prize = 5000;
    public double getPay() {
        return pay;
    }

    public void setPay() {
        this.pay = pay;
    }

    public double getSt() {
        return st;
    }

    public void setSt(int st) {
        this.st = st;
    }

    public double getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public double getPrize() {
        return prize;
    }

    public void setPrize(int prize) {
        this.prize = prize;
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