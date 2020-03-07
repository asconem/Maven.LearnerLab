package io.zipcoder.interfaces;

public class Students extends People<Student> {
    private static final Students INSTANCE = new Students();

    private Students() {
        add(new Student(1, "Matt"));
        add(new Student(2, "Dave"));
        add(new Student(3, "Adam"));
        add(new Student(4, "Leila"));
        add(new Student(5, "Moe"));
    };

    public static Students getInstance() {
        return INSTANCE;
    }
    
}
