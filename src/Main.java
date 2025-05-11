import models.Teacher;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Course Registration System");
        System.out.println("Enter Your name: ");
        String name = sc.nextLine();
        System.out.println("Are you a teacher(t) or a student(s)");
    }

    private static void teacherMenu(String name, Scanner sc, Teacher teacher) {
        System.out.println("Create A Course (c)");
        System.out.println("Delete A Course (d)");
        System.out.println("View All Courses (v)");
        System.out.println("(Press any key (but the above) to exit)");
        String selection = sc.nextLine().toLowerCase().trim();
        switch (selection) {
            case "v" -> {
                System.out.println(teacher.getAllCourseTeaching());
                teacherMenu(name, sc, teacher);
            }
            case "d" -> {
                System.out.print("Name of Course: ");
                String deleteC = sc.nextLine().trim().toLowerCase();
                try{
                    teacher.deleteCourse(deleteC);
                }
                catch(Exception e){
                    System.out.println(e.getMessage());
                    System.out.println("Create a Course first");
                    teacherMenu(name, sc, teacher);
                }
            }
            case "c" -> {
                System.out.print("Name of Course: ");
                String cCourse = sc.nextLine().toLowerCase().toLowerCase();
                System.out.print("Capacity of the Course: ");
                int cCapacity = Integer.parseInt(sc.nextLine().trim().toLowerCase());
                System.out.print("Level/Year of the Course: ");
                int cLevel = Integer.parseInt(sc.nextLine().trim().toLowerCase());
                teacher.createCourse(cCourse, cCapacity, cLevel);
                System.out.println("What else do you want to do");
                teacherMenu(name, sc, teacher);
            }
            default -> {}
        }
    }

    private static void studentMenu(String name, Scanner sc) {}
}