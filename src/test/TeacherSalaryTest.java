package test;

import model.Address;
import model.Teacher;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import service.TeacherService;


public class TeacherSalaryTest {
    Teacher teacher;
    Address address;

    @Before
    public void setUp() {
        address = new Address("SPb", "lalalandova", 15, 15);
        teacher = new Teacher("Alexey", "Naumov", 40, "M", address);
    }
    @Test
    public void salaryNotEquals5kIfStEquals0() {
        teacher.setSt(0);
        Assert.assertNotEquals((double) 5000, TeacherService.salary(teacher));
    }
}