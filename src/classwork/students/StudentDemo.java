package classwork.students;

import java.util.Scanner;

public class StudentDemo {
    private static Scanner scanner = new Scanner(System.in);
    private static StudentStorage studentStorage = new StudentStorage();

    public static void main(String[] args) {
        boolean run = true;
        while (run) {
            System.out.println("Please input 0 for exit");
            System.out.println("Please input 1 to add student");
            System.out.println("Please input 2 to print the student/students");
            System.out.println("Please input 3 to print the number of students");
            System.out.println("Please input 4 to delete the student by index");
            System.out.println("Please input 5 to print the student/students by lesson");
            System.out.println("Please input 6 to change the students's lesson");
            int command = Integer.parseInt(scanner.nextLine());
            switch (command) {
                case 0:
                    run = false;
                    break;
                case 1:
                    addStudent();
                    break;
                case 2:
                    studentStorage.print();
                    break;
                case 3:
                    System.out.println(studentStorage.getSize());
                    break;
                case 4:
                    deleteStudentByIndex();
                    break;
                case 5:
                    printStudentByLesson();
                    break;
                case 6:
                    changeLesson();
                    break;
                default:
                    System.out.println("Invalid command, please try again");
            }
        }
    }

    private static void addStudent() {
        System.out.println("Please input the student's name");
        String name = scanner.nextLine();

        System.out.println("Please input the student's surname");
        String surname = scanner.nextLine();

        System.out.println("Please input the student's age");
        String ageStr = scanner.nextLine();

        System.out.println("Please input the student's phoneNumber");
        String phoneNumber = scanner.nextLine();

        System.out.println("Please input the student's city");
        String city = scanner.nextLine();

        System.out.println("Please input the lesson");
        String lesson = scanner.nextLine();

        int age = Integer.parseInt(ageStr);

        Student student = new Student(name, surname, age, phoneNumber, city, lesson);
        studentStorage.add(student);
        System.out.println("Thank you, student is added");
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
            System.out.println("Please input the lesson name");
            String lesson = scanner.nextLine();
            if (lesson != null && !lesson.trim().equals("")) {
                student.setLesson(lesson.trim());
            }
        } else {
            System.out.println("Invalid index, please trya again");
            //changeLesson();
        }
    }
}

