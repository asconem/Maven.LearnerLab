package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudent {

    @Test
    public void testImplementation() {
        Student newStudent = new Student(234, "Trey");
        Assert.assertTrue(newStudent instanceof Learner);
    }

    @Test
    public void testInheritance() {
        Student newStudent = new Student(234, "Trey");
        Assert.assertTrue(newStudent instanceof Person);
    }

    @Test
    public void testLearn() {
        Student newStudent = new Student(123, "John");
        Double expected = 10.0;
        newStudent.learn(10.0);
        Double actual = newStudent.getTotalStudyTime();

        Assert.assertEquals(expected, actual);
    }
}
