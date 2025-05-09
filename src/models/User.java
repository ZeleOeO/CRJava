package models;

import javax.swing.*;
import java.util.Random;

public class User {
    private int id;
    private String name;

    public User(String name) {
        Random rand = new Random();
        this.id= rand.nextInt();this.name=name;}

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void viewAllCourses() {

    }

}
