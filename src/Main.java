import java.util.ArrayList;
import java.util.List;

import model.*;
import util.Converter;

public class Main {
    public static void main(String[] args) {
        //Address of teachers
        Address teacherNaumovAddress = new Address("St. Petersburg", "Sq. Vostanija", 2, 8);
        Address teacherSinicaAddress = new Address("St. Petersburg", "Str. Ingenernaja", 19, 67);
        Address teacherRepkinAddress = new Address("St. Petersburg", "Str. Gorohovaja", 21, 21);
        Address teacherVoroninaAddress = new Address("St. Petersburg", "Str. Kazanskaja", 38, 15);

        //Address of students
        Address studentSanyaAddress = new Address("St. Petersburg", "Str. Nezavisimosti", 33, 12);
        Address studentVolodyaAddress = new Address("St. Petersburg", "Str. Babushkina", 144, 215);
        Address studentValerkaAddress = new Address("St. Petersburg", "Str. Baltijskaja", 53, 56);
        Address studentNastyaAddress = new Address("St. Petersburg", "Str. Dachnaja", 22, 112);
        Address studentSoniaAddress = new Address("St. Petersburg", "Str. Udelnaja", 75, 4);

        //Teachers
        Teacher Naumov = new Teacher("Alexey", "Naumov", 40, "M", teacherNaumovAddress);
        Teacher Sinica = new Teacher("Ekaterina", "Sinica", 32, "F", teacherSinicaAddress);
        Teacher Repkin = new Teacher("Boris", "Repkin", 66, "M", teacherRepkinAddress);
        Teacher Voronina = new Teacher("Anna", "Voronina", 55, "F", teacherVoroninaAddress);

        Naumov.salary(200);
        Sinica.salary(150);
        Repkin.salary(350);
        Voronina.salary(300);

        ArrayList <Teacher> teachers = new ArrayList<>(){{
           add(Repkin);
           add(Sinica);
           add(Voronina);
        }};

        //Mentors
        Converter <Mentor, Teacher> converter = (Teacher) -> new Mentor(Teacher.getName(), Teacher.getSurname(),
                Teacher.getAge(), Teacher.getGender(), Teacher.getAddress());

        Mentor mentorNaumov = converter.convert(Naumov);

        List <Mentor> mentors = new ArrayList<>() {{
            add(mentorNaumov);
        }};

//        List <Employee> staff = new ArrayList<Employee>();
//        Converter <Employee, Mentor > mentorEmployeeConverter = (Mentor) -> new Employee(Mentor.getName(), Mentor.getSurname(),
//                Mentor.getAge(), Mentor.getGender(), Mentor.getAddress());
//        Converter <Employee, Teacher> employeeTeacherConverter = (Teacher) -> new Employee(Teacher.getName(), Teacher.getSurname(),
//                Teacher.getAge(), Teacher.getGender(), Teacher.getAddress());




        //Students
        Student Sanya = new Student("Alexander", "Voronin", 19, "M", studentSanyaAddress);
        Student Volodya = new Student("Uladzimir", "Petrov", 19, "M", studentVolodyaAddress);
        Student Valerka = new Student("Valerij", "Ostapov", 19, "M", studentValerkaAddress);
        Student Nastya = new Student("Anastasia", "Kozlova", 18, "F", studentNastyaAddress);
        Student Sonia = new Student("Sonia", "Bigun", 18, "F", studentSoniaAddress);

        ArrayList<Student> studentsOfDKU = new ArrayList(){{
            add(Sanya);
            add(Volodya);
            add(Valerka);
            add(Nastya);
            add(Sonia);
        }};

        //Groups
        Group DKU = new Group("DKU", 1, Naumov, studentsOfDKU,2022, 2026);
        Group DKP = new Group("DKP", 3, Sinica, studentsOfDKU, 2019,2024);
        Group DKF = new Group("DKF", 4, Voronina, studentsOfDKU,2018, 2022);

        ArrayList <Group> groups = new ArrayList<>(){{
           add(DKU);
           add(DKP);
           add(DKF);
        }};

        //Terminal
        System.out.println("Retired");
        teachers.stream()
                .filter(gm -> gm.getGender().contains("M"))
                .filter(a -> a.getAge() > 60)
                .forEach(System.out::println);
        teachers.stream()
                .filter(gf -> gf.getGender().contains("F"))
                .filter(a -> a.getAge() >= 55)
                .forEach(System.out::println);
        System.out.println("Pay more then 60k");
        teachers.stream()
                .filter(p -> p.getPay() > 60000)
                .forEach(System.out::println);
        System.out.println("Graduation 2022-2024 groups");
        groups.stream()
                .filter(gg -> gg.getYearOfGraduation() >= 2022 && gg.getYearOfGraduation() <= 2024)
                .forEach(System.out::println);
    }
}