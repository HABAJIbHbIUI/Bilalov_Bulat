package Homework_23;


import java.util.ArrayList;
import java.util.Comparator;

public class SortedStudentGroup {
    ArrayList<Student> students;
    Comparator comparator;

    public SortedStudentGroup(Comparator comparator) {
        this.students = new ArrayList<>();
        this.comparator = comparator;
    }

    public void add(Student student) {
        int i = 0;
        if (comparator == null) {
            while (i < students.size() && students.get(i).compareTo(student) < 0) i++;
        } else {
            while (i < students.size() && comparator.compare(students.get(i), student) < 0) i++;
        }
        students.add(i, student);
    }

    public void setDefaultComparator() {

        comparator = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return (o1.getTwoname().compareTo(o2.getTwoname()));
            }
        };

        comparator = (Comparator<Student>) (o1, o2) -> (o1.getAge() - o2.getAge());

    }

    public class CompareByName implements Comparator<Student> {

        @Override
        public int compare(Student o1, Student o2) {
            return (o1.getName().compareTo(o2.getName()));
        }
    }

    public class CompareByAge implements Comparator<Student> {

        @Override
        public int compare(Student o1, Student o2) {
            return (o1.getAge() - o2.getAge());
        }
    }

    public class CompareByGrade implements Comparator<Student> {

        @Override
        public int compare(Student o1, Student o2) {
            return (int) (o1.getGrade() - o2.getGrade());
        }
    }

}