package models;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class Teacher extends User {
    private Set<Course> coursesTeaching;

    public Teacher(int id, String name) {super(id, name);}

    private Set<String> getStudentsFromFile() {
        Set<String> students = new HashSet<>();
        File file = new File("datafiles/students.txt");
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String studentName;
            while ((studentName = br.readLine()) != null) {
                students.add(studentName);
            }
        }
        catch (IOException e) {
//            e.printStackTrace();
        }
        return students;
    }

    public void createCourse(String courseName, int capacity, int level) {
        Course course = new Course(courseName, capacity, level);
        coursesTeaching.add(course);
        Admin.allCourses.add(course.getName());
        Admin.allTeachers.add(course.getName());
    }
}
