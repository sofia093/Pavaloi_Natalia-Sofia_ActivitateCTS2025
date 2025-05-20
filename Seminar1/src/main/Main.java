package main;

import clase.Curs;
import clase.Profesor;
import clase.Student;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<Student>();
        students.add(new Student("Mihaela", 22, "1"));
        students.add(new Student("Rares", 22, "3"));
        for(Student student : students) {
            System.out.println(student.toString());
        }

        Profesor profesor = new Profesor("Iulia", 23, "4", 4000, 0.1F);
        profesor.preda();
        profesor.setNume("Ana");
        System.out.println(profesor.toString());
        System.out.println(profesor.calculVenit());

        Curs curs=new Curs();

    }
}