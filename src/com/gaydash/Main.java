package com.gaydash;

public class Main {

    public static void main(String[] args) {

        Group group = new Group("Java", "21.04", 16, 2);
        group.addStudent(new Student("Olga", "Gaydash", "24.05", "Odessa"));
        group.addStudent(new Student("Alex", "Ivanov", "01.01", "Kiev"));
        group.addStudent(new Student("Ivan", "Sidorov", "05.08", "Dnepr"));
        group.addStudent(new Student("Kate", "Kell", "03.02", "Donetsk"));

        String name = group.getGroupName();
        System.out.println(name);

        group.printStudents();

        group.deleteStudentByIndex(1);
        group.removeStudentByLastName("Sidorov");

        System.out.println();
        System.out.println("Group after deleted student:");
        group.printStudents();

        System.out.println();
        group.hasStudent("Gaydash");
    }
}
