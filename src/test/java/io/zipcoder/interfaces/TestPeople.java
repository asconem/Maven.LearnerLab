package io.zipcoder.interfaces;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestPeople {
    People<Person> personList = new People<>();

    @Test
    public void testAdd() {
        Person person1 = new Person(555, "Steve");
        Person person2 = new Person(678, "Jack");

        personList.add(person1);
        personList.add(person2);

        Assert.assertTrue(personList.contains(person1));
    }

    @Test
    public void testRemove() {
        Person person1 = new Person(555, "Steve");
        Person person2 = new Person(678, "Jack");

        personList.add(person1);
        personList.add(person2);
        personList.removeByPerson(person1);

        Assert.assertTrue(!personList.contains(person1));
    }

    @Test
    public void testFindById() {
        Person person1 = new Person(555, "Steve");
        Person person2 = new Person(678, "Jack");

        personList.add(person1);
        personList.add(person2);

        Person expected = person1;
        Person actual = personList.findById(555);

        Assert.assertEquals(expected, actual);
    }
}
