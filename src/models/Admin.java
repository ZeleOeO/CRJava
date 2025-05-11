package models;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Admin {
    public static Set<String> allCourses = new HashSet<String>();
    public static Set<String> allStudents = new HashSet<String>();
    public static Set<String> allTeachers = new HashSet<String>();
    protected static Set<Course> allCoursesObj = new HashSet<Course>();
    public static Map<String, String> allCourseAndTeachers;
}
