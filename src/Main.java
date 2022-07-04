import model.Address;
import model.Group;
import model.Student;
import model.Teacher;

public class Main {
    public static void main(String[] args) {
        Address teacherAddress = new Address ("Санкт-Петербург", "Пл. Восстания", 2,8);
        Address studentAddress = new Address ("Санкт-Петербург", "ул. Независимости", 33,12);
        Teacher Naumov = new Teacher("Алексей", "Наумов", 40, teacherAddress);
        Student Sanya = new Student ("Александр", "Воронин", 19, studentAddress);
        Student Volodya = new Student ("Владимир", "Петров", 19, studentAddress);
        Student Valerka = new Student ("Валерий", "Остапов", 19, studentAddress);
        Student Nastya = new Student ("Анастасия", "Козлова", 18, studentAddress);


        Student[] students = new Student[] {Sanya, Volodya, Valerka};

        Group DKU = new Group ("DKU", 1, Naumov, students);
        DKU.add(Nastya);

        DKU.groupInfo();
    }
}
