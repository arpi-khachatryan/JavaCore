package functionalJava.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Combine {

    protected static class Employee {

        public final String name;
        public final Integer age;
        public final String jobTitle;
        public final Float salary;

        public Employee(String name, Integer age, String jobTitle, Float salary) {
            this.name = name;
            this.age = age;
            this.jobTitle = jobTitle;
            this.salary = salary;
        }
    }

    public static void main(String[] args) {

        Employee[] employeesArr = {
                new Employee("John", 18, "developer", 22f),
                new Employee("Hannah", 35, "developer", 23f),
                new Employee("Bart", 22, "sales executive", 23f),
                new Employee("Sophie", 34, "construction worker", 23f),
                new Employee("Darren", 40, "writer", 23f)
        };

        List<Employee> employees = new ArrayList<>(Arrays.asList(employeesArr));

        Float developersTotalSalaries = employees
                .stream()
                .filter((employee) -> employee.jobTitle.equals("developer"))
                .map((developer) -> developer.salary)
                .reduce(0f, (acc, x) -> acc + x);

        Long numberOfDevelopers = employees
                .stream()
                .filter((employee) -> employee.jobTitle.equals("developer"))
                .collect(Collectors.counting());

        Float developerAverageSalary = developersTotalSalaries / numberOfDevelopers;
        System.out.println(developerAverageSalary);
    }
}