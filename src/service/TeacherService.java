package service;

import model.Teacher;
import repository.TeacherRepository;

public class TeacherService {
    private TeacherRepository teacherRepository;

    public TeacherService (TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }
    public void addTeacher (Teacher teacher) {
        System.out.println("Add teacher: " + teacher.toString());
        teacherRepository.addTeachers(teacher);
    }
    public void removeTeacher (Teacher teacher) {
        System.out.println("Remove teacher: " + teacher.toString());
        teacherRepository.removeTeachers(teacher);
    }
    public static double salary (Teacher teacher) {
        double pay;
        double st = teacher.getSt();
        double hour = 8;
        double prize = 5000;
        if (st == 0){
            st = (double) teacher.getAge() / 2 * 10;
        }
        pay = (st * hour) * 22 + prize;
        System.out.println(teacher.getSurname() + " salary = " + pay);
        return pay;
    }

}
