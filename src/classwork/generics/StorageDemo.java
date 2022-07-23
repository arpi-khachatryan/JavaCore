package classwork.generics;

import classwork.students.model.Student;

public class StorageDemo {
    public static void main(String[] args) {
        Storage<Integer> intStorage = new Storage<>();
        intStorage.add(12);
        intStorage.print();

        Storage<String> strStorage = new Storage<>();
        strStorage.add("generic");
        strStorage.print();
        String byIndex1 = strStorage.getByIndex(0);
        System.out.println(byIndex1);

        Storage<Student> studentStorage = new Storage<>();
        studentStorage.add(new Student());
        Student byIndex = studentStorage.getByIndex(0);
    }
}
