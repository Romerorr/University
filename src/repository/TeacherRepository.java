package repository;

import model.Teacher;

import java.util.ArrayList;

public class TeacherRepository {
    private ArrayList <Teacher> teachers = new ArrayList<>();

    public void addTeachers (Teacher teacher){
        teachers.add(teacher);
    }
    public void removeTeachers (Teacher teacher){
        teachers.add(teacher);
    }
    public ArrayList<Teacher> getTeachers() {
        return teachers;
    }
}
