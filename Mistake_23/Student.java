package Homework_23;

import java.util.Comparator;

public class Student implements Comparable<Student> {
    private String name;

    public String getName() {
        return name;
    }

    public String getTwoname() {
        return twoname;
    }

    public int getAge() {
        return age;
    }

    public double getGrade() {
        return grade;
    }

    private String twoname;
    private int age;
    private double grade;

    public Student(String name, String twoname, int age, double grade, Comparator comparator) {
        this.name = name;
        this.twoname = twoname;
        this.age = age;
        this.grade = grade;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Student)) return false;
        Student stud = (Student) obj;
        return name.equals(stud.name) && twoname.equals(stud.twoname) && age == stud.age && grade == stud.grade;
    }

    @Override
    public int compareTo(Student o) {
        return twoname.compareTo(o.twoname);
    }
}
