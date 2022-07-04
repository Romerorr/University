package model;

import type.People;

public class Teacher extends People {

    public Teacher(String name, String surname, int age, Address address) {
        super(name, surname, age, address);
    }

    @Override
    public String toString() {
        return getName() + " " + getSurname();
    }

    private float pay;
    private float st = 300;
    private int hour;
    private float prize = 5000;


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

    public void setPrize(float prize) {
        this.prize = 3.3f;
    }

    public void salary(int hour) {
        pay = (st * hour) * 22 + prize;
        System.out.println("Salary of " + getSurname() + " st:" + st + "*hour:" + hour + "*22 work day" + "+prize:" + prize + "=" + pay);
    }


    public void teacherInfo() {
        System.out.println("Name of teacher: " + getName());
        System.out.println("Surname of teacher: " + getSurname());
        System.out.println("Age of teacher: " + getAge());
        System.out.println("Address of teacher: " + getAddress());
    }
}