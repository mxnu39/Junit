package Aufgaben;

import java.util.ArrayList;
import java.util.Random;



public class Schueler{

    // Variable declarations
    private String name;
    private int age;
    private double height;
    private float weight;
    private boolean isStudent;
    private char grade;
    private long idNumber;
    static ArrayList<Integer> numList = new ArrayList<>();
    public static String Debug = "[Debug]>>";

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static void main(String[] args) {
        /*
         * ArrayList<String> list = new ArrayList<>();
         * 
         * list.add("");
         * list.add("");
         * list.add("");
         * 
         * for (String s : list) {
         * System.out.print(s + " ");
         * }
         */
        Schueler s1 = new Schueler("Manuel", getRandomNumID(), true);
        String m1 = s1.isStudent() ? (ANSI_GREEN + "Schueler wurde erstellt") : (ANSI_RED + "Lehrer wurde erstellt");
        System.out.printf(Debug + m1 + ANSI_CYAN + "[%s, %d] %n" + ANSI_RESET, s1.getName(), s1.getNum());
        Schueler s2 = new Schueler("Finn", getRandomNumID(), true);
        String m2 = s2.isStudent() ? (ANSI_GREEN + "Schueler wurde erstellt") : (ANSI_RED + "Lehrer wurde erstellt");
        System.out.printf(Debug + m2 + ANSI_CYAN + "[%s, %d] %n" + ANSI_RESET, s2.getName(), s2.getNum());
        Schueler s3 = new Schueler("Cleopatra", getRandomNumID(), false);
        String m3 = s3.isStudent() ? (ANSI_GREEN + "Schueler wurde erstellt") : (ANSI_RED + "Lehrer wurde erstellt");
        System.out.printf(Debug + m3 + ANSI_CYAN + "[%s, %d] %n" + ANSI_RESET, s2.getName(), s2.getNum());
    }

    public Schueler(String name) {
        this.name = name;
        this.idNumber = getRandomNumID();

    }

    public static int getRandomNumID() {
        Random rand = new Random();
        int num1 = rand.nextInt(1000);
        if (numList.contains(num1)) {
            num1 = 0;
        } else {
            numList.add(num1);
        }
        return num1;
    }

    public long getNum() {
        return this.idNumber;
    }

    public boolean isStudent() {
        return this.isStudent;
    }

    public Schueler(String name, long idNumber, boolean isStudent) {
        this.name = name;
        this.idNumber = idNumber;
        if (isStudent) {
            this.isStudent = true;
        } else {
            this.isStudent = false;
        }
    }

    public String getName() {
        return this.name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public void setage(int age) {
        this.age = age;
    }

    public void setheight(double height) {
        this.height = height;
    }

    public void setweight(float weight) {
        this.weight = weight;
    }

    public void setisstudent(boolean isStudent) {
        this.isStudent = isStudent;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    public void setidNumber(long idNumber) {
        this.idNumber = idNumber;
    }
}
