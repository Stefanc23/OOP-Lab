package com.stefano.ooplab.sesi7;

import java.util.ArrayList;

public class Course {
    private String courseName;
    private ArrayList<String> students = new ArrayList<>();
    private int numberOfStudents = 0;

    Course(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void addStudent(String student) {
        students.add(student);
        numberOfStudents++;
    }

    public void dropStudent(String student) {
        // find student based on student name
        for(int i=0; i<numberOfStudents; ++i) {
            if(students.get(i).equals(student)) {
                students.remove(i);
                numberOfStudents--;
                break;
            }
        }
    }

    public ArrayList<String> getStudents() {
        return students;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }
}
