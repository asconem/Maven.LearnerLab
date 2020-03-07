package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestEducator {
    @Test
    public void testImplementation(){
        Educator educator = Educator.NOBLES;

        boolean actual = educator instanceof Teacher;

        Assert.assertTrue(actual);
    }


    @Test
    public void testTeach(){
        Educator educator = Educator.FROILAN;
        Student student = new Student(7, "Joe");
        double expected = 10;

        educator.teach(student, expected);
        double actual = student.getTotalStudyTime();

        Assert.assertEquals(expected, actual, .001);
    }

    @Test
    public void testTeachEducatorTimeWorked(){
        // Given
        Educator educator = Educator.NOBLES;
        Student student = new Student(90, "John");
        double expected = 10;

        // When
        educator.teach(student, expected);
        double actual = educator.timeWorked;

        // Then
        Assert.assertEquals(expected, actual, .001);
    }

    @Test
    public void testLecture(){
        // Given
        Educator educator = Educator.DOLIO;
        Student student1 = new Student(10, "Corey");
        Student student2 = new Student(22, "April");
        Student student3 = new Student(37, "Aarti");
        Student[] studentsExpected = new Student[3];
        studentsExpected[0] = student1;
        studentsExpected[1] = student2;
        studentsExpected[2] = student3;

        for(int i = 0; i < 3; i++){
            studentsExpected[i].learn(5);
        }

        // When
        Student[] studentsActual = new Student[3];
        studentsActual[0] = student1;
        studentsActual[1] = student2;
        studentsActual[2] = student3;

        educator.lecture(studentsActual, 15);

        // Then
        Assert.assertArrayEquals(studentsExpected, studentsActual);
    }

    @Test
    public void testLectureEducatorTimeWorked(){
        // Given
        Educator educator = Educator.ROBERTO;
        Student student1 = new Student(10, "Jeremy");
        Student student2 = new Student(22, "Khalil");
        Student student3 = new Student(32, "James");
        Student[] students= new Student[3];
        students[0] = student1;
        students[1] = student2;
        students[2] = student3;

        double expected = 15;

        // When
        educator.lecture(students, expected);
        double actual = educator.timeWorked;

        // Then
        Assert.assertEquals(expected, actual, .001);
    }
}
