import models.Admin;
import models.Student;
import models.Teacher;
import models.User;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        landingMenu();
    }
    private static void landingMenu() {
        String teacherOrStudent = homeMenu();
        if (teacherOrStudent.equals("t")) {
            teacherMenu();
        }
        else if (teacherOrStudent.equals("s")) {
            studentMenu();
        }
        else {
            System.out.println("Invalid selection");
            homeMenu();
        }
    }

    private static String homeMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Course Registration System");
        System.out.println("Welcome to Course Registration System");
        System.out.println("Are you a Teacher(t) or a Student(s)?");
        String choice = sc.nextLine();
        return choice.toLowerCase().trim();
    }

    private static void teacherMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name: ");
        String name = sc.nextLine();
        Teacher teacher = new Teacher(name);
        while (true) {
            System.out.println("Create A Course (c)");
            System.out.println("Delete A Course (d)");
            System.out.println("View All Courses (v)");
            System.out.println("(Press any key (but the above) to exit)");
            String selection = sc.nextLine().toLowerCase().trim();
            switch (selection) {
                case "v" -> {
                    System.out.println(teacher.getAllCourseTeaching());
                }
                case "d" -> {
                    System.out.print("Name of Course: ");
                    String deleteC = sc.nextLine().trim().toLowerCase();
                    try {
                        teacher.deleteCourse(deleteC);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                        System.out.println("Create a Course first");
                    }
                }
                case "c" -> {
                    System.out.print("Name of Course: ");
                    String cCourse = sc.nextLine().toLowerCase().toLowerCase();
                    System.out.print("Capacity of the Course: ");
                    int cCapacity = Integer.parseInt(sc.nextLine().trim().toLowerCase());
                    System.out.print("Level/Year of the Course: ");
                    int cLevel = Integer.parseInt(sc.nextLine().trim().toLowerCase());
                    try {
                        teacher.createCourse(cCourse, cCapacity, cLevel);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                }
                default -> {
                    landingMenu();
                }
            }
        }
    }

    private static void studentMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Name: ");
        String studentName = sc.nextLine().trim();
        Student student = new Student(studentName);
        while (true) {
            System.out.println(Admin.allCourses);
            System.out.println("Register A Course (r)");
            System.out.println("Drop A Course (d)");
            System.out.println("View Courses Registered (v)");
            String selection = sc.nextLine().toLowerCase().trim();
            switch (selection) {
                case "r" -> {
                    System.out.println("Enter Name of Course: ");
                    String name = sc.nextLine().toLowerCase();
                    try {
                        student.registerCourse(name);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                }
                case "d" -> {
                    System.out.println("Enter Name of Course: ");
                    String name = sc.nextLine().toLowerCase();
                    try {
                        student.dropCourse(name);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                }
                case "v" -> {
                    System.out.println(student.viewCoursesRegistered());
                }
                default -> {
                    landingMenu();
                }
            }
        }
    }
}