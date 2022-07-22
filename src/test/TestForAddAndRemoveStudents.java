package test;

import model.Address;
import model.Group;
import model.Student;
import model.Teacher;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

import java.util.ArrayList;

public class TestForAddAndRemoveStudents {
        Address address;
        Student student;
        Student student1;
        Teacher naumov;
        Group group;

        ArrayList<Student> students;
        @Before
        public void setUP (){
            address = new Address("SPb", "lalalandova", 15, 15);
            student = new Student("Paul", "Dzerhachou", 24, "m", address);
            student1 = new Student("Paul", "Dzerhachou", 24, "m", address);
            naumov = new Teacher("Alexey", "Naumov", 40, "M", address);
            group = new Group("PPP", 1, naumov, students, 2022, 2026);
            students.add(student1);
        }
        private int count = students.size();

            @Test
            public void addStudentTest() {
                group.addStudent(student);
                ++count;
                Assert.assertEquals (count, students.size());
            }
            @Test
            public void removeStudentTest() {
                group.removeStudent(student);
                --count;
                Assert.assertEquals(count, students.size()-1);
            }
}