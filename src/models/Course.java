package models;

import java.util.Random;
import java.util.Set;

public class Course {
    private int id;
    private String name;
    private int capacity;
    private Teacher teacher;
    private int level;
    private Set<String> studentsThatShouldBeInCourse;

    public Course() {}

    protected Course(String name, int capacity, Teacher teacher, int level, Set<String> studentsThatShouldBeInCourse) {
        Random rand = new Random();
        this.id = rand.nextInt(10);
        this.name = name + String.valueOf(level).charAt(0) + "0" + String.valueOf(this.id);
        this.capacity = capacity;
        this.teacher = teacher;
        this.level = level;
        this.studentsThatShouldBeInCourse = studentsThatShouldBeInCourse;
    }

    public int getId() {
        return id;
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

    public Set<String> getStudentsThatShouldBeInCourse() {
        return studentsThatShouldBeInCourse;
    }

    public void setStudentsThatShouldBeInCourse(Set<String> studentsThatShouldBeInCourse) {
        this.studentsThatShouldBeInCourse = studentsThatShouldBeInCourse;
    }
}
