package models;

import exceptions.CourseAlreadyCreatedException;
import exceptions.FileNotFound;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Teacher extends User {
    private final Set<Course> coursesTeaching = new HashSet<>();

    public Teacher(String name) {super(name);}

    public List<String> getAllCourseTeaching() {
        return this.coursesTeaching.stream().map(Course::getName).toList();
    }

    private Set<String> getStudentsFromFile() {
        Set<String> students = new HashSet<>();
        File file = new File("src/datafiles/students.txt");
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String studentName;
            while ((studentName = br.readLine()) != null) {
                students.add(studentName);
            }
        }
        catch (IOException e) {
            throw new FileNotFound(e.getMessage());
        }
        return students;
    }

    public void createCourse(String courseName, int capacity, int level) {
            for (String course : Admin.allCourses) {
                if (courseName.equals(course)) {
                    throw new CourseAlreadyCreatedException(courseName);
                }
            }
        Course course = new Course(courseName, capacity,this, level, this.getStudentsFromFile());
        coursesTeaching.add(course);
        Admin.allCourses.add(course.getName());
        Admin.allCoursesObj.add(course);
        Admin.allTeachers.add(course.getTeacher().getName());
    }

    public void deleteCourse(String courseName) {
        coursesTeaching.remove(coursesTeaching.stream().filter(course -> course.getName().equals(courseName)).findFirst().get());
    }

}
