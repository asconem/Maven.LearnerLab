package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

    @Test
    public void testConstructorID() {
        Person person = new Person(2345, "John");
        long expected = 2345;
        long actual = person.getId();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConstructorName() {
        Person person = new Person(2345, "John");
        String expected = "John";
        String actual = person.getName();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetName() {
        Person person = new Person(4567, "Bob");
        person.setName("Jack");

        String expected = "Jack";
        String actual = person.getName();

        Assert.assertEquals(expected, actual);
    }
}

