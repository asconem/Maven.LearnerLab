package io.zipcoder.interfaces;

public class Instructors extends People<Instructor> {
    private static final Instructors INSTANCE = new Instructors();

    private Instructors() {
        add(new Instructor(1, "Roberto"));
        add(new Instructor(2, "Nobles"));
        add(new Instructor(3, "Kris"));
        add(new Instructor(4, "Froilan"));
        add(new Instructor(5, "Dolio"));
    }

    public static Instructors getInstance() {
        return INSTANCE;
    }
}
