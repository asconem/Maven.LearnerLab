package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class People<E extends Person>{
    private List<E> personList = new ArrayList<>();

    public void add(E person) {
        personList.add(person);
    }

    public E findById(long id) {
        for (E person: personList) {
            if (person.getId() == id) {
                return person;
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

    public void removeByPerson(Person person) {
        personList.remove(person);
    }

    public void removeById(long id) {
        personList.remove(findById(id));
    }

    public void removeAll() {
        personList.clear();
    }

    public int count() {
        return personList.size();
    }

    public abstract E[] getArray();

    public Object[] toArray() {
        return personList.toArray();
    }
}
