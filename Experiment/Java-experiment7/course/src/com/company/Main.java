package com.company;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Course course1 = new Course("JAVA");
        Course course2 = new Course("C++");

        course1.addStudent("li");
        course1.addStudent("zhang");
        course1.addStudent("zhou");

        course2.addStudent("wei");
        course2.addStudent("ome");

        System.out.println("Number of students in course1: "
                + course1.getNumberOfStudents());
        String[] students1 = course1.getStudents();
        for (int i = 0; i < course1.getNumberOfStudents(); i++) {
            System.out.print(students1[i]);
            if(i < course1.getNumberOfStudents()-1)
                System.out.print(",");
        }

        System.out.println();

        System.out.println("Number of students in course2: "
                + course2.getNumberOfStudents());
        String[] students2 = course2.getStudents();
        for (int i = 0; i < course2.getNumberOfStudents(); i++) {
            System.out.print(students2[i]);
            if(i < course2.getNumberOfStudents()-1)
                System.out.print(",");
        }
    }
}

class Course {
    private String name;

    private ArrayList<String> students = new ArrayList<>();

    public Course(String name) {
        this.name = name;
    }

    public void addStudent(String student) {
        students.add(student);
    }

    public String[] getStudents() {
        String[] result = new String[students.size()];
        students.toArray(result);
        return result;
    }

    public int getNumberOfStudents() {
        return students.size();
    }
}
