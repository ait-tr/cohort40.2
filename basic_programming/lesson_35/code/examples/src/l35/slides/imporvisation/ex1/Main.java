package l35.slides.imporvisation.ex1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee implements Comparable<Employee>{
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return name + ": " + salary;
    }

    @Override
    public int compareTo(Employee o) {
        return (int) (this.salary - o.salary);
    }
}


class Main {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee("max", 121322));
        list.add(new Employee("andrew", 126322));
        list.add(new Employee("anne", 146322));

        System.out.println(list);
        list.sort((o1, o2) -> o1.name.compareTo(o2.name));
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);

        Collections.sort(list, (o1, o2) -> o1.name.compareTo(o2.name));
        System.out.println(list);
    }
}