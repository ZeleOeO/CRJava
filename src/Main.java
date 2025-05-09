import models.Admin;
import models.Course;
import models.Teacher;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Teacher teacher1 = new Teacher("Olufemi Peters");
        Teacher teacher2 = new Teacher("Arijemi Paul");
        teacher1.createCourse("CSC", 45, 300);
        teacher2.createCourse("CSC", 50, 400);
        System.out.println(Admin.allCourses);
    }

}