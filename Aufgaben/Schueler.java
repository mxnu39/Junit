package Aufgaben;

import java.util.ArrayList;
import java.util.Random;

public class Schueler {

    // Variable declarations
    private String name;
    private int age;
    private double height;
    private float weight;
    private boolean isStudent;
    private char grade;
    private long idNumber;
    static ArrayList<Integer> numList = new ArrayList<>();

    public static void main(String[] args) {
        /* ArrayList<String> list = new ArrayList<>();
        
        list.add("");
        list.add("");
        list.add("");

        for (String s : list) {
            System.out.print(s + " ");
        } */
        
        Schueler s1 = new Schueler("Manuel", getRandomNumID(), true);
        Schueler s2 = new Schueler("Finn", getRandomNumID(), true);

        System.out.println("Schueler Nr." + s1.getNum() + ") " + s1.getName());
        System.out.println("Schueler Nr." + s2.getNum() + ") " + s2.getName());
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

    public long getNum(){
        return this.idNumber;
    }
    
    public Schueler(String name, long idNumber, boolean isStudent) {
        this.name = name;
        this.idNumber = idNumber;
        if(isStudent){
            this.isStudent = true;
        } else{
            this.isStudent = false;
        }
    }
    public String getName(){
        return this.name;
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
