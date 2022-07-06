package model;


public class Group {
    private String name;
    private int course;
    private Teacher teacher;
    private Student[] arStudent;

    public Group(String name, int course, Teacher teacher, Student arStudent[]) {
        this.name = name;
        this.course = course;
        this.teacher = teacher;
        this.arStudent = arStudent;
    }

    public void add(Student student) {
        Student[] students = new Student[arStudent.length + 1];
        for (int i = 0; i < arStudent.length; i++) {
            students[i] = arStudent[i];
        }
        students[students.length - 1] = student;
        arStudent = students;
    }
    public void delete(Student student) {
        for (int i = 0; i < arStudent.length; i++) {
            while (arStudent[i]!=(student)){
                i++;
            }
            if (arStudent[i].equals(student)) {
                arStudent[i] = null;
            }
            if (arStudent[i] == null && arStudent[i] != arStudent[arStudent.length - 1]) {
                arStudent[i] = arStudent[arStudent.length - 1];
            }
            Student[] students = new Student[arStudent.length-1];
            for (i = 0; i < students.length; i++) {
                if (arStudent[i] != null) {
                    students[i] = arStudent[i];
                }
            }
            arStudent = students;
        }
    }
    public String getName() {
        return name;
    }
    public void setName() {
        this.name = name;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse() {
        this.course = course;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher() {
        this.teacher = teacher;
    }

    public Student[] getStudent() {
        return arStudent;
    }

    public void setStudent() {
        this.arStudent = arStudent;
    }

    public void groupInfo() {
        System.out.println ("Name of group: "+name);
        System.out.println ("Course: "+course);
        System.out.println ("Teacher of group: "+teacher.toString());
        for (int i = 0; i<arStudent.length;i++){
            System.out.println("Student of group: "+arStudent[i].getName()+" "+arStudent[i].getSurname());
        }
    }
}