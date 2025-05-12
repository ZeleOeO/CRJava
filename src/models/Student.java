package models;

import exceptions.CourseRegistrationException;

import java.util.*;
import java.util.stream.Collectors;

public class Student  extends User{
    private Set<Course> courses = new HashSet<>();

    public Student(String name) {
        super(name);
        Admin.allStudents.add(name);
    }

    public Map<String, String> viewCoursesRegistered() {
        Map<String, String> coursesRegisteredWithTeacher = new HashMap<>();
        if (courses.isEmpty()) {throw new CourseRegistrationException("There are no courses registered");}
        for (Course course : courses) {
            coursesRegisteredWithTeacher.put(course.getName(), course.getTeacher().getName());
        }
        return coursesRegisteredWithTeacher;
    }

    public void registerCourse(String courseName) {
        Course course = Admin.allCoursesObj.stream().filter(c -> c.getName().toLowerCase().equals(courseName)).findFirst().get();
        if (course.getCapacity()==0) {throw new CourseRegistrationException("Course capacity exceeded");}
        if (!course.getStudentsThatShouldBeInCourse().contains(this.getName())) {throw new CourseRegistrationException("Student is not permitted to register course");}
        courses.add(course);
        course.setCapacity(course.getCapacity()-1);
    }

    public void dropCourse(String courseName) {
        courses.remove(this.courses.stream().filter(course -> course.getName().equals(courseName)).findFirst().get());
    }

    public List<String> getRegisteredCourses() {
        return courses.stream().map(Course::getName).toList();
    }
}
