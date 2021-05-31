package com.gaydash;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Group {

    private String courseName;
    private String startDate;
    private int lessonAmount;
    private int lessonPerWeek;
    private final static List<Student> STUDENTS = new ArrayList<>();

    public Group(String courseName, String startDate, int lessonAmount, int lessonPerWeek) {
        this.courseName = courseName;
        this.startDate = startDate;
        this.lessonAmount = lessonAmount;
        this.lessonPerWeek = lessonPerWeek;
    }

    public static void addStudent(Student student) {
        STUDENTS.add(student);
    }

    public static void deleteStudentByIndex(int index) {
        STUDENTS.remove(index);
    }

    public static void removeStudentByLastName(String lastName) {
        Iterator<Student> it = STUDENTS.iterator();
        while (it.hasNext()) {
            if (it.next().getLastName() == lastName) {
                it.remove();
                break;
            }
        }
    }

    public String getGroupName() {
        return courseName + "_" + startDate;
    }

    public static void printStudents() {
        Iterator<Student> studentIterator = STUDENTS.iterator();
        while (studentIterator.hasNext()) {
            Student student = studentIterator.next();
            System.out.println(student.getFirstName() + " " + student.getLastName());
        }
    }

    public boolean hasStudent(String lastName) {
        Iterator<Student> it = STUDENTS.iterator();
        while (it.hasNext()) {
            if (it.next().getLastName() == lastName) {
                System.out.println("Student" + " " + " " + lastName + " is in the group");
                break;
            } else {
                System.out.println("Student" + " " + " " + lastName + " is not in the group");
            }
        }
        return true;
    }

    @Override
    public String toString() {
        return "Group{" +
                "courseName='" + courseName + '\'' +
                ", startDate='" + startDate + '\'' +
                ", lessonAmount=" + lessonAmount +
                ", lessonPerWeek=" + lessonPerWeek +
                '}';
    }
}
