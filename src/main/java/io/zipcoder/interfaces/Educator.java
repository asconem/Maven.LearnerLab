package io.zipcoder.interfaces;

public enum Educator implements Teacher {
    ROBERTO("Roberto", 1),
    NOBLES("Nobles", 2),
    KRIS("Kris", 3),
    FROILAN("Froilan", 4),
    DOLIO("Dolio", 5);

    final Instructor instructor;
    double timeWorked = 0;

    Educator(String name, long id){
        instructor = new Instructor(id, name);
        Instructors.getInstance().add(instructor);
        this.timeWorked = 0;
    }

    @Override
    public void teach(Learner learner, double numberOfHours) {
        instructor.teach(learner, numberOfHours);
        timeWorked += numberOfHours;
    }

    @Override
    public void lecture(Learner[] learner, double numberOfHours) {
        instructor.lecture(learner, numberOfHours);
        timeWorked += numberOfHours;
    }
}
