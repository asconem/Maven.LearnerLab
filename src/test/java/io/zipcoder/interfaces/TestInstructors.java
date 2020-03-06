package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructors {
    @Test
    public void testInstructorSingleton() {
        Instructors instance = Instructors.getInstance();
        Instructor expected = instance.findById(1);
        String expectedName = expected.getName();
        Assert.assertEquals("Roberto", expectedName);
    }

    @Test
    public void testInstructorSingleton2() {
        Instructors instance = Instructors.getInstance();
        Instructor expected = instance.findById(2);
        String expectedName = expected.getName();
        Assert.assertEquals("Nobles", expectedName);
    }
}
