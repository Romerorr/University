package test;

import model.Address;
import model.Student;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;
import repository.StudentRepository;
import service.StudentService;

public class TestForAddAndRemoveStudents {
        Address address;
        Student student;
        Student student1;
        StudentRepository studentRepository;
        StudentService studentService;
        private int count;
        @Before
        public void setUP (){
            studentRepository = new StudentRepository();
            studentService = new StudentService(studentRepository);
            student = new Student("Paul", "Dzerhachou", 24, "m", address);
            student1 = new Student("Paul", "Dzerhachou", 24, "m", address);
            studentRepository.addStudent(student1);
            count = studentRepository.size();
        }
            @Test
            public void addStudentTest() {
                StudentService.addStudent(student);
                ++count;
                Assert.assertEquals (count, studentRepository.size());
            }
            @Test
            public void removeStudentTest() {
                StudentService.removeStudent(student);
                --count;
                Assert.assertEquals(count, studentRepository.size()-1);
            }
}