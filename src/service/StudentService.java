package service;

import model.Student;
import repository.StudentRepository;

public class StudentService {

    private static StudentRepository studentRepository;

    public StudentRepository getStudentRepository() {
        return studentRepository;
    }

    public static void setStudentRepository(StudentRepository studentRepository) {
        StudentService.studentRepository = studentRepository;
    }

    public StudentService (StudentRepository studentRepository){
        StudentService.studentRepository = studentRepository;
    }
    public static void addStudent(Student student) {
        System.out.println("Add student: " + student.toString());
        studentRepository.addStudent(student);
    }
    public static void removeStudent(Student student) {
        System.out.println("Remove student: " + student.toString());
    }
}
