package repository;

import model.Student;

import java.util.ArrayList;

public class StudentRepository {


    private ArrayList <Student> students = new ArrayList<>();

    public void addStudent(Student student){
        students.add(student);
    }
    public void removeStudent(Student student){
        students.remove(student);
    }
    public int size (){
        int count;
        count = students.size();
        return count;
    }
    public ArrayList <Student> getStudents (){
        return students;
    }
    public void setStudents (ArrayList<Student> students) {
        this.students = students;
    }
}
