package io.zipcoder.interfaces;

import java.util.List;

public class People {
    private List<Person> personList;

    public void add(Person person) {
        personList.add(person);
    }

    public Person findById(long id) {
        for (Person p: personList) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    public boolean contains(Person person) {
        if (personList.contains(person))
            return true;
        else
            return false;
    }
}
