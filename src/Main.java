import java.util.ArrayList;
import java.util.List;
import util.AgeComparator;

import base.People;
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
        Teacher naumov = new Teacher("Alexey", "Naumov", 40, "M", teacherNaumovAddress);
        Teacher sinica = new Teacher("Ekaterina", "Sinica", 32, "F", teacherSinicaAddress);
        Teacher repkin = new Teacher("Boris", "Repkin", 66, "M", teacherRepkinAddress);
        Teacher voronina = new Teacher("Anna", "Voronina", 55, "F", teacherVoroninaAddress);

        naumov.salary(200);
        sinica.salary(150);
        repkin.salary(350);
        voronina.salary(300);

        ArrayList <Teacher> teachers = new ArrayList<>(){{
           add(repkin);
           add(sinica);
           add(voronina);
        }};

        //Mentors
        Converter <Mentor, Teacher> converter = (Teacher) -> new Mentor(Teacher.getName(), Teacher.getSurname(),
                Teacher.getAge(), Teacher.getGender(), Teacher.getAddress(), teachers);

        Mentor mentorNaumov = converter.convert(naumov);

        List <Mentor> mentors = new ArrayList<>() {{
            add(mentorNaumov);
        }};

        //Staff
        ArrayList <People> staff = new ArrayList<>(){{
            addAll(teachers);
            addAll(mentors);
        }};

        //Students
        Student sanya = new Student("Alexander", "Voronin", 19, "M", studentSanyaAddress);
        Student volodya = new Student("Uladzimir", "Petrov", 19, "M", studentVolodyaAddress);
        Student valerka = new Student("Valerij", "Ostapov", 19, "M", studentValerkaAddress);
        Student nastya = new Student("Anastasia", "Kozlova", 18, "F", studentNastyaAddress);
        Student sonia = new Student("Sonia", "Bigun", 18, "F", studentSoniaAddress);

        ArrayList<Student> studentsOfDKU = new ArrayList(){{
            add(sanya);
            add(volodya);
            add(valerka);
            add(nastya);
            add(sonia);
        }};

        //Groups
        Group DKU = new Group("DKU", 1, naumov, studentsOfDKU,2022, 2026);
        Group DKP = new Group("DKP", 3, sinica, studentsOfDKU, 2019,2024);
        Group DKF = new Group("DKF", 4, voronina, studentsOfDKU,2018, 2022);

        ArrayList <Group> groups = new ArrayList<>(){{
           add(DKU);
           add(DKP);
           add(DKF);
        }};

        //Terminal
        System.out.println("\n"+"Staff of project");
        AgeComparator AgeComparator = new AgeComparator();
        staff.stream()
                .sorted(People::compareTo)
//                .sorted(AgeComparator)
                .forEach(System.out::println);
        System.out.println("\n"+"Retired");
        teachers.stream()
                .filter(gm -> gm.getGender().contains("M"))
                .filter(a -> a.getAge() > 60)
                .forEach(System.out::println);
        teachers.stream()
                .filter(gf -> gf.getGender().contains("F"))
                .filter(a -> a.getAge() >= 55)
                .forEach(System.out::println);
        System.out.println("\n"+"Pay more then 60k");
        teachers.stream()
                .filter(p -> p.getPay() > 60000)
                .forEach(System.out::println);
        System.out.println("\n"+"Graduation 2022-2024 groups");
        groups.stream()
                .filter(gg -> gg.getYearOfGraduation() >= 2022 && gg.getYearOfGraduation() <= 2024)
                .forEach(System.out::println);
    }
}