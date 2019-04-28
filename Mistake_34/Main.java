package Homework_34;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, InvocationTargetException {

        Student max = new Student("max", 5, 12);
        Class aClass= max.getClass();
        List<Student> list = getMany(aClass,100, "John", 5, 18);
        for (Student item: list) {
            System.out.println(item);
        }
    }

    public static <T> List<T> getMany(Class<T> aClass, int count, Object... params) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        List list = new ArrayList();
        Constructor[] constructors = aClass.getConstructors();
        for (int i = 0; i < count; i++) {
            list.add(constructors[0].newInstance(params));
        }
        return list;
    }

}
