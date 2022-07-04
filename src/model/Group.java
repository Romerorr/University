package model;

public class Group {
    private String name;
    private int course;
    private Teacher teacher;
    private Student [] arStudent;

    public Group (String name, int course, Teacher teacher, Student arStudent[]) {
        this.name = name;
        this.course = course;
        this.teacher = teacher;
        this.arStudent = arStudent;
    }
    public void add (Student student) {
        Student[] students = new Student[arStudent.length + 1];
        for (int i = 0; i < students.length; i++) {

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
//        System.out.println ("Name of group: "+name);
//        System.out.println ("Course: "+course);
//        System.out.println ("Teacher of group: "+teacher.toString());
        for (int i = 0; i<arStudent.length;i++){
            System.out.println("Students of group: "+arStudent[i].getName()+" "+arStudent[i].getSurname());
        }
    }
}