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
}
