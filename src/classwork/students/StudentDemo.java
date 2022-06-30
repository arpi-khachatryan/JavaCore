package classwork.students;

import classwork.students.command.Commands;
import classwork.students.model.Lesson;
import classwork.students.model.Student;
import classwork.students.storage.LessonStorage;
import classwork.students.storage.StudentStorage;

import java.util.Scanner;

public class StudentDemo implements Commands {
    private static Scanner scanner = new Scanner(System.in);
    private static StudentStorage studentStorage = new StudentStorage();
    private static LessonStorage lessonStorage = new LessonStorage();

    public static void main(String[] args) {
        boolean run = true;
        while (run) {
            Commands.printCommands();
            int command = Integer.parseInt(scanner.nextLine());
            switch (command) {
                case EXIT:
                    run = false;
                    break;
                case ADD_STUDENT:
                    addStudent();
                    break;
                case PRINT_ALL_STUDENTS:
                    studentStorage.print();
                    break;
                case PRINT_STUDENTS_COUNT:
                    System.out.println(studentStorage.getSize());
                    break;
                case DELETE_STUDENT_BY_INDEX:
                    deleteStudentByIndex();
                    break;
                case PRINT_STUDENTS_BY_LESSON:
                    printStudentByLesson();
                    break;
                case CHANGE_STUDENT_LESSON:
                    changeLesson();
                    break;
                case ADD_LESSON:
                    addLesson();
                    break;
                case PRINT_ALL_LESSONS:
                    lessonStorage.print();
                    break;
                default:
                    System.out.println("Invalid command, please try again");
            }
        }
    }

    private static void addStudent() {
        if (lessonStorage.getSize() == 0) {
            System.out.println("Please add the lesson");
            addLesson();
        } else {
            lessonStorage.print();
            System.out.println("Please choose the index of the lesson");
            int lessonIndex = Integer.parseInt(scanner.nextLine());
            Lesson lesson = lessonStorage.getLessonByIndex(lessonIndex);
            if (lesson == null) {
                System.out.println("Please input correct index");
                //addStudent();
            } else {
                System.out.println("Please input the student's name");
                String name = scanner.nextLine();

                System.out.println("Please input the student's surname");
                String surname = scanner.nextLine();

                System.out.println("Please input the student's age");
                int age = Integer.parseInt(scanner.nextLine());

                System.out.println("Please input the student's phoneNumber");
                String phoneNumber = scanner.nextLine();

                System.out.println("Please input the student's city");
                String city = scanner.nextLine();

                Student student = new Student(name, surname, age, phoneNumber, city, lesson);
                studentStorage.add(student);
                System.out.println("Thank you, student was added");
            }
        }
    }

    private static void deleteStudentByIndex() {
        studentStorage.print();
        System.out.println("Please choose student's index");
        int index = Integer.parseInt(scanner.nextLine());
        studentStorage.delete(index);
    }

    private static void printStudentByLesson() {
        System.out.println("Please input the lesson name");
        String lessonName = scanner.nextLine();
        studentStorage.printStudentsByLesson(lessonName);
    }

    private static void changeLesson() {
        studentStorage.print();
        System.out.println("Please select the index");
        int newIndex = Integer.parseInt(scanner.nextLine());
        Student student = studentStorage.getStudentByIndex(newIndex);
        if (student != null) {
            lessonStorage.print();
            System.out.println("Please choose lesson index");
            int lessonIndex = Integer.parseInt(scanner.nextLine());
            Lesson lesson = lessonStorage.getLessonByIndex(lessonIndex);
            if (lesson == null) {
                System.out.println("Please input correct index");
                changeLesson();
            } else {
                student.setLesson(lesson);
                System.out.println("Lesson changed");
            }
        } else {
            System.out.println("Invalid index, please try again");
            changeLesson();
        }
    }

    private static void addLesson() {
        System.out.println("Please input the name of the lasson");
        String name = scanner.nextLine();

        System.out.println("Please input the name of the teacher");
        String teacherName = scanner.nextLine();

        System.out.println("Please input the lasson duration by month");
        int duration = Integer.parseInt(scanner.nextLine());

        System.out.println("PLease input the price of the lesson");
        double price = Double.parseDouble(scanner.nextLine());

        Lesson lesson = new Lesson(name, teacherName, duration, price);
        lessonStorage.add(lesson);
        System.out.println("The lesson was created");
    }
}

