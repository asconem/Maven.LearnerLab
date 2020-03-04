package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {

    @Test
    public void testImplementation() {
        Instructor newInstructor = new Instructor(555, "Harry");
        Assert.assertTrue(newInstructor instanceof Teacher);
    }

    @Test
    public void testInheritance() {
        Instructor newInstructor = new Instructor(555, "Harry");
        Assert.assertTrue(newInstructor instanceof Person);
    }

    @Test
    public void testTeach() {
        Instructor newInstructor = new Instructor(555, "Harry");
        Student newStudent = new Student(777, "Mike");

        newInstructor.teach(newStudent, 15.0);

        Double expected = 15.0;
        Double actual = newStudent.getTotalStudyTime();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testLecture() {
        Student student1 = new Student(222, "John");
        Student student2 = new Student(333, "Steve");
        Learner[] learners = new Learner[2];
        learners[0] = student1;
        learners[1] = student2;

        Instructor newInstructor = new Instructor(555, "Harry");
        newInstructor.lecture(learners, 10.0);

        Double expected = 5.0;
        Double actual = student1.getTotalStudyTime();
        Double actual2 = student2.getTotalStudyTime();

        Assert.assertEquals(expected, actual);
    }
}
