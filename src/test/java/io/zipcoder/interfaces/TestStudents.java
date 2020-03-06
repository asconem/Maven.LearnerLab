package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudents {
    @Test
    public void testStudentSingleton() {
        Students instance = Students.getInstance();
        Student expected = instance.findById(1);
        String expectedName = expected.getName();
        Assert.assertEquals("Matt", expectedName);
    }

    @Test
    public void testStudentSingleton2() {
        Students instance = Students.getInstance();
        Student expected = instance.findById(2);
        String expectedName = expected.getName();
        Assert.assertEquals("Dave", expectedName);
    }
}
