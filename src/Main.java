import model.Address;
import model.Group;
import model.Student;
import model.Teacher;

public class Main {
    public static void main(String[] args) {
        Address teacherAddress = new Address ("St. Petersburg", "Sq. Vostanija", 2,8);
        Address studentAddress = new Address ("St. Petersburg", "Str. Nezavisimosti", 33,12);
        Address studentAddress_1 = new Address ("St. Petersburg", "Str. 3-ya Liniya, 1-oj Polovini", 75,4);
        Teacher Naumov = new Teacher("Alexey", "Naumov", 40, teacherAddress);
        Student Sanya = new Student ("Alexander", "Voronin", 19, studentAddress);
        Student Volodya = new Student ("Uladzimir", "Petrov", 19, studentAddress);
        Student Valerka = new Student ("Valerij", "Ostapov", 19, studentAddress);
        Student Nastya = new Student ("Anastasia", "Kozlova", 18, studentAddress);
        Student Sonia = new Student ("Sonia", "Bigun",18, studentAddress_1);

        Student[] students = new Student[] {Sanya, Volodya, Valerka};

        Group DKU = new Group ("DKU", 1, Naumov, students);
        DKU.add(Sonia);
        Sonia.studentInfo();
        DKU.add(Nastya);
        DKU.delete(Sanya);
        DKU.groupInfo();
    }
}
