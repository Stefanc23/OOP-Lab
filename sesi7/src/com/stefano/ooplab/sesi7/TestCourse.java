package com.stefano.ooplab.sesi7;

import java.util.ArrayList;

public class TestCourse {

    public static void main(String[] args) {
        // create object course1 & course2 from class Course
        Course course1 = new Course("Object Oriented Programming");
        Course course2 = new Course("Software Engineering");

        // insert data to course1
        course1.addStudent("Peter Jones");
        course1.addStudent("Kim Smith");
        course1.addStudent("Anne Kennedy");

        // insert data to course2
        course2.addStudent("Peter Jones");
        course2.addStudent("Steve Smith");

        // output
        System.out.println("Number of students in course1: " + course1.getNumberOfStudents());
        ArrayList<String> course1Students = course1.getStudents();
        for(int i=0; i<course1Students.size(); ++i) System.out.print(course1Students.get(i) + ", ");
        System.out.println("\n\nNumber of students in course2: " + course2.getNumberOfStudents());
        ArrayList<String> course2Students = course2.getStudents();
        for(int i=0; i<course2Students.size(); ++i) System.out.print(course2Students.get(i) + ", ");
        System.out.println("\n\nDrop students: Peter Jones from course1");
        course1.dropStudent("Peter Jones"); // Drop student named Peter Jones from course1
        System.out.println("Number of students in course1: " + course1.getNumberOfStudents());
        course1Students = course1.getStudents();
        for(int i=0; i<course1Students.size(); ++i) {
            if(i == course1Students.size() - 1) System.out.print(course1Students.get(i));
            else System.out.print(course1Students.get(i) + ", ");
        }
    }
}
