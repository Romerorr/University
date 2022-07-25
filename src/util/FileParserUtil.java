package util;

import model.Address;
import model.Group;
import model.Student;
import model.Teacher;

import java.io.*;
import java.util.ArrayList;

public class FileParserUtil {
    public static ArrayList<Student> parserStudent () throws IOException {
        ArrayList<Student> students = new ArrayList<>();
        FileReader fileReader = null;
        String name = "";
        try {
            fileReader = new FileReader("Student.txt");
            int a;
            while ((a = fileReader.read()) != -1) {
                name += (char) a;
            }
            String[] massStr = name.split("\r\n");
            for (String str : massStr) {
                String[] massName = str.split(" ");
                Student student = new Student(massName[0], massName[1], Integer.parseInt(massName[2]),
                        massName[3], new Address(massName[4], massName[5], Integer.parseInt(massName[6]),
                        Integer.parseInt(massName[7])));
                students.add(student);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (fileReader != null) {
                fileReader.close();
            }
        }
        return students;
    }
    public static ArrayList<Teacher> parserTeacher() throws IOException {
        ArrayList<Teacher> teachers = new ArrayList<>();
        FileReader fileReader = null;
        String name = "";
        try {
            fileReader = new FileReader("Teacher.txt");
            int a;
            while ((a = fileReader.read()) != -1) {
                name += (char) a;
            }
            String[] massStr = name.split("\r\n");
            for (String str : massStr) {
                String[] massName = str.split(" ");
                Teacher teacher = new Teacher(massName[0], massName[1], Integer.parseInt(massName[2]),
                        (massName[3]), new Address(massName[4], massName[5], Integer.parseInt(massName[6]),
                        Integer.parseInt(massName[7])));
                teachers.add(teacher);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (fileReader != null) {
                fileReader.close();
            }
        }
        return teachers;
    }
    public static ArrayList <Group> parserGroup() throws IOException {
        ArrayList<Group> groups = new ArrayList<>();
        ArrayList<Teacher> teachers = new ArrayList<>(parserTeacher());
        FileReader fileReader = null;
        try {
            fileReader = new FileReader("Group.txt");
            int a;
            String name = "";
            while ((a = fileReader.read()) != -1) {
                name += (char) a;
            }
            String[] massStr = name.split("\r\n");
            for (String str : massStr) {
                String[] massName = str.split(" ");
                Group group = new Group(massName[0], Integer.parseInt(massName[1]), teachers.get(0),
                        parserStudent(), Integer.parseInt(massName[2]), Integer.parseInt(massName[3]));
                groups.add(group);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (fileReader != null) {
                fileReader.close();
            }
        }
        return groups;
    }
}

