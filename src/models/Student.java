package models;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Student  extends User{
    private Set<Course> courses;

    public Student(int id, String name) {super(name);}

    public Map<String, String> getCoursesRegistered() {
        Map<String, String> coursesRegisteredWithTeacher = new HashMap<>();
        for (Course course : courses) {
            coursesRegisteredWithTeacher.put(course.getName(), course.getTeacher().getName());
        }
        return coursesRegisteredWithTeacher;
    }

    public void registerCourse(Course course) {
        courses.add(course);
    }

    public void dropCourse(Course course) {
        courses.remove(course);
    }
}
