package models;

import java.util.Set;

public class Course {
    private int id;
    private String name;
    private int capacity;
    private Teacher teacher;
    private int level;
    private Set<String> studentsThatShouldBeInCourse;

    public Course() {}

    public Course(String name, int capacity, Teacher teacher, int level, Set<String> studentsThatShouldBeInCourse) {
//        this.id =
        this.name = name;
        this.capacity = capacity;
        this.teacher = teacher;
        this.level = level;
        this.studentsThatShouldBeInCourse = studentsThatShouldBeInCourse;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public Set<Student> getStudentsThatShouldBeInCourse() {
        return studentsThatShouldBeInCourse;
    }

    public void setStudentsThatShouldBeInCourse(Set<Student> studentsThatShouldBeInCourse) {
        this.studentsThatShouldBeInCourse = studentsThatShouldBeInCourse;
    }
}
