package io.zipcoder.interfaces;

import java.util.HashMap;
import java.util.Map;

public class ZipCodeWilmington {
    private Students students = Students.getInstance();
    private Instructors instructors = Instructors.getInstance();

    public void hostLecture(Teacher teacher, double numberOfHours) {
        teacher.lecture(students.getArray(), numberOfHours);
    }

    public void hostLecture(long id, double numberOfHours){
        Teacher teacher = instructors.findById(id);
        hostLecture(teacher, numberOfHours);
    }

    public Map<Student, Double> getStudyMap() {
        Map<Student, Double>  map = new HashMap<>();
        for(Student s : students.getArray()){
            map.put(s, s.getTotalStudyTime());
        }
        return map;
    }
}
