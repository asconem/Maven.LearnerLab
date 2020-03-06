package io.zipcoder.interfaces;

public class Students {
    private static final Students instance = new Students();

    private Students() {};

    public static Students getInstance() {
        return instance;
    }
}
