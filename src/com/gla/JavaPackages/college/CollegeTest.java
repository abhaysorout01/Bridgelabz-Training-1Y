package com.gla.JavaPackages.college;

import com.gla.JavaPackages.college.faculty.Faculty;
import com.gla.JavaPackages.college.student.Student;

public class CollegeTest {
    public static void main(String[] args) {

        Student s=new Student();
        s.displayStudent("Rahul",101);

        System.out.println();

        Faculty f=new Faculty();
        f.displayFaculty("Dr. Sharma","Computer Science");

    }
}