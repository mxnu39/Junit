package Aufgaben;

import java.util.ArrayList;

public class a1 {

    // Variable declarations
    private String name;
    private int age;
    private double height;
    private float weight;
    private boolean isStudent;
    private char grade;
    private long idNumber;

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hallo");
        list.add("Welt");
        list.add("!");

        for (String s : list) {
            System.out.print(s + " ");
        }
    }

    public void setname(String name) {
        this.name = name;
    }

    public void setage(int age){
        this.age = age;
    }

    public void setheight(double height){
        this.height = height;
    }

    public void setweight(float weight){
        this.weight = weight;
    }

    public void setisstudent(boolean isStudent){
        this.isStudent = isStudent;
    }

    public void setGrade (char grade){
        this.grade = grade;
    }

    public void setidNumber(long idNumber){
        this.idNumber = idNumber;
    }
}
