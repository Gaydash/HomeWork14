package com.gaydash;

import java.util.Objects;

public class Student {

    private String firstName;
    private String lastName;
    private String dateOfBirthday;
    private String contactInformation;

    public Student(String firstName, String lastName, String dateOfBirthday, String contactInformation) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirthday = dateOfBirthday;
        this.contactInformation = contactInformation;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDateOfBirthday() {
        return dateOfBirthday;
    }

    public String getContactInformation() {
        return contactInformation;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDateOfBirthday(String dateOfBirthday) {
        this.dateOfBirthday = dateOfBirthday;
    }

    public void setContactInformation(String contactInformation) {
        this.contactInformation = contactInformation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return firstName.equals(student.firstName) && lastName.equals(student.lastName) && dateOfBirthday.equals(student.dateOfBirthday) && contactInformation.equals(student.contactInformation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, dateOfBirthday, contactInformation);
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirthday='" + dateOfBirthday + '\'' +
                ", contactInformation='" + contactInformation + '\'' +
                '}';
    }
}
