package com.skypro.demotesting;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class UniversityTest {

    private Student student1;
    private Student student2;
    private Student student3;
    private University university;

    @BeforeEach
    public void setUp() {
        student1 = new Student("Engeniy", 35, true);
        student2 = new Student("Marina", 34, false);
        student3 = new Student("Alina", 7, false);

        university = new University();

        university.addStudent(student1);
        university.addStudent(student2);
        university.addStudent(student3);
    }

    @Test
    public void getAllStudents() {

        List<Student> expected = new ArrayList<>();
        expected.add(student1);
        expected.add(student2);
        expected.add(student3);
        List<Student> actual = university.getAllStudents();

       assertEquals(expected, actual);
    }

    @Test
    public void getAllStudentsNoNull() {
        List<Student> actual = university.getAllStudents();

        assertNotNull(actual);
    }

    @Test
    public void getAllStudentsIsMale() {

        List<Student> expected = new ArrayList<>();
        expected.add(student1);

        List<Student> actual = university.getAllStudents(true);

        assertEquals(expected, actual);
    }
}
