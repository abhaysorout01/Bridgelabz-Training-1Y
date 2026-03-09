package com.gla.JavaPackages.school.main;

import com.gla.JavaPackages.school.data.Student;
import com.gla.JavaPackages.school.util.Analyzer;

public class MainApp {

    public static void main(String[] args) {

        Student s1 = new Student("Rahul",85,78,92);

        Analyzer analyzer = new Analyzer();
        double avg = analyzer.calculateAverage(s1);
        String grade = analyzer.findGrade(avg);

        System.out.println(s1);  // calls toString()
        System.out.println("Average: "+avg);
        System.out.println("Grade: "+grade);
    }
}