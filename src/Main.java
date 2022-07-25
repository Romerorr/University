import java.io.IOException;
import java.util.ArrayList;

import repository.GroupRepository;
import repository.TeacherRepository;
import service.GroupService;
import service.TeacherService;

import model.*;
import util.Converter;
import util.FileParserUtil;

public class Main {
    public static void main(String[] args) throws IOException {
        GroupRepository groupRepository = new GroupRepository();
        GroupService groupService = new GroupService(groupRepository);
        TeacherRepository teacherRepository = new TeacherRepository();
        TeacherService teacherService = new TeacherService(teacherRepository);
        ArrayList <Teacher> teachers = FileParserUtil.parserTeacher();
        Address teacherNaumovAddress = new Address("St. Petersburg", "Sq. Vostanija", 2, 8);
        Teacher naumov = new Teacher("Alexey", "Naumov", 40, "M", teacherNaumovAddress);
        Converter <Mentor, Teacher> converter = x -> new Mentor(x.getName(), x.getSurname(), x.getAge(),
                x.getGender(), x.getAddress(), teachers);
        System.out.println("Students");
        ArrayList <Student> students = FileParserUtil.parserStudent();
        students.forEach(System.out::println);
        System.out.println();
        System.out.println("Teachers");

        teachers.stream().sorted(Teacher::compareTo)
                .forEach(System.out::println);
        System.out.println();
        Mentor mentorNaumov = converter.convert(naumov);
        System.out.println(mentorNaumov);
        System.out.println();
        System.out.println("Salary");
        naumov.setSt(250); // change salary
        TeacherService.salary(naumov);
        TeacherService.salary(teachers.get(0));
        TeacherService.salary(teachers.get(1));
        TeacherService.salary(teachers.get(2));
        System.out.println();
        System.out.println("Groups");
        ArrayList <Group> groups = FileParserUtil.parserGroup();//test version
        groups.get(0).setStudent(students);
        groupService.addGroups(groups);

    }
}