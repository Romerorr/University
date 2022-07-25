package model;

import java.util.ArrayList;

public class Group {
    private String name;
    private int course;
    private Teacher teacher;
    private ArrayList<Student> arStudent;
    private int yearOfAdmission;
    private int yearOfGraduation;

    public Group(String name, int course, Teacher teacher, ArrayList<Student> arStudent, int yearOfAdmission, int yearOfGraduation) {
        this.name = name;
        this.course = course;
        this.teacher = teacher;
        this.arStudent = arStudent;
        this.yearOfAdmission = yearOfAdmission;
        this.yearOfGraduation = yearOfGraduation;
    }

    public String toString() {
        return name + " " + "course: " + course + " Year of Admission: " + yearOfAdmission;
    }

    public String getName() {
        return name;
    }

    public void setName() {
        this.name = name;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse() {
        this.course = course;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher() {
        this.teacher = teacher;
    }

    public ArrayList getStudent() {
        return arStudent;
    }

    public void setStudent(ArrayList <Student> arStudent) {
        this.arStudent = arStudent;
    }

    public int getYearOfAdmission() {
        return yearOfAdmission;
    }

    public void setYearOfAdmission(int yearOfAdmission) {
        this.yearOfAdmission = yearOfAdmission;
    }

    public int getYearOfGraduation() {
        return yearOfGraduation;
    }

    public void setYearOfGraduation(int yearOfGraduation) {
        this.yearOfGraduation = yearOfGraduation;
    }
}