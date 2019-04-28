package Homework_34;

public class Student {
    String name;
    int grade;
    int age;

    public Student(String name, int grade, int age) {
        this.name = name;
        this.grade = grade;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " " + grade + " " + age;
    }
}
