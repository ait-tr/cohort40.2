package l23.protected_example.student;

import l23.protected_example.person.Person;

public class Student extends Person {
    public static int qwerty = 2;
    private int graduationYear = 2018;

    public static void doSmth() {
        Student student = new Student();
        System.out.println(Student.qwerty);
        student.qwerty = 5;
        System.out.println(Student.qwerty);
    }

    public static void main(String[] args) {
        Student myObj = new Student();
//        System.out.println("Name: " + myObj.fname + " " + myObj.lname);
        System.out.println("Email: " + myObj.email);
        System.out.println("Age: " + myObj.age);
        System.out.println("Graduation Year: " + myObj.graduationYear);
    }
}


