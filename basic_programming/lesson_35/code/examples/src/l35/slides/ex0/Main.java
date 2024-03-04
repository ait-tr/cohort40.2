package l35.slides.ex0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee implements Comparable<Employee> {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public int compareTo(Employee other) {
        return (int) (this.salary - other.salary);
    }

    @Override
    public String toString() {
        return name + ": " + salary;
    }
}

class EmployeeNameComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        return e1.name.compareTo(e2.name);
    }
}

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("John", 50000.00));
        employees.add(new Employee("Alice", 60000.00));
        employees.add(new Employee("Bob", 40000.00));

        // Сортировка по зарплате
        Collections.sort(employees);
        System.out.println("Отсортировано по зарплате: " + employees);

        // Сортировка по имени
        Collections.sort(employees, new EmployeeNameComparator());
        System.out.println("Отсортировано по имени: " + employees);

        // Сортировка по имени
        Collections.sort(employees, (e1, e2) -> e1.name.compareTo(e2.name));
        System.out.println("Отсортировано по имени: " + employees);

        // Сортировка по имени
        employees.sort((e1, e2) -> e1.name.compareTo(e2.name));
        System.out.println("Отсортировано по имени: " + employees);
    }
}
