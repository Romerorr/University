package test;

import model.Address;
import model.Teacher;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class TeacherSalaryTest {
    Teacher teacher;
    Address address;

    @Before
    public void setUp() {
        address = new Address("SPb", "lalalandova", 15, 15);
        teacher = new Teacher("Alexey", "Naumov", 40, "M", address);
    }
    @Test
    public void salaryNotEqualsNull() {
        Assert.assertNotEquals (5000, teacher.salary(0));
    }
}