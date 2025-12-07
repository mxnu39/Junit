package Aufgaben;

import java.util.ArrayList;
import java.util.Random;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;



public class Schueler implements Comparable<Schueler> {

    // Variable declarations
    private String name;
    private int age;
    private double height;
    private float weight;
    private boolean isStudent;
    private char grade;
    private long idNumber;
    private int zuteilung = 0;
    static ArrayList<Integer> numList = new ArrayList<>();
    public static String Debug = "[Debug]>>";
    static ArrayList<Schueler> Schuelerliste = new ArrayList<>();
    static ArrayList<Schueler> LehrerListe = new ArrayList<>();
    static String[][] Arbeitsgruppen = new String[5][5];


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

        // Erstellung erster Schueler-Objekt
        Schueler s1 = new Schueler("Manuel", getRandomNumID(), true);
        String m1 = s1.isStudent() ? (ANSI_GREEN + "Schueler wurde erstellt") : (ANSI_RED + "Lehrer wurde erstellt");
        System.out.printf(Debug + m1 + ANSI_CYAN + "[%s, %d] %n" + ANSI_RESET, s1.getName(), s1.getNum());
        
        // Erstellung zweiter Schueler-Objekt
        Schueler s2 = new Schueler("Finn", getRandomNumID(), true);
        String m2 = s2.isStudent() ? (ANSI_GREEN + "Schueler wurde erstellt") : (ANSI_RED + "Lehrer wurde erstellt");
        System.out.printf(Debug + m2 + ANSI_CYAN + "[%s, %d] %n" + ANSI_RESET, s2.getName(), s2.getNum());

        // Erstellung dritter Schueler-Objekt
        Schueler s3 = new Schueler("Cleopatra", getRandomNumID(), false);
        String m3 = s3.isStudent() ? (ANSI_GREEN + "Schueler wurde erstellt") : (ANSI_RED + "Lehrer wurde erstellt");
        System.out.printf(Debug + m3 + ANSI_CYAN + "[%s, %d] %n" + ANSI_RESET, s3.getName(), s3.getNum());
        

        // Zuweisung der Arbeitsgruppe
        for (Schueler s: Schuelerliste){
            s.sortieren();
            s.getSorted();
        } // Lehrpersonen
        for (Schueler l : LehrerListe){
            l.sortieren();
            l.getSorted();
        }
        // createRandomStudents();
        comparabletest();
    }

    public static void createRandomStudents(){

        for(int x = 0; x < 22; x++){
            String x_name = "r_s_" + x;
            long x_num = getRandomNumID();
            boolean x_bol = true;
            Schueler x_s = new Schueler(x_name, x_num, x_bol);
            x_s.sortieren();
        }
    }

    public void sortieren(){
        if (this.zuteilung == 0 && isStudent){
            for(int a = 0; a < Arbeitsgruppen.length; a++){
                for (int y = 0; y < Arbeitsgruppen[a].length; y++){
                    if (Arbeitsgruppen[a][y] == null){
                        // Wenn freier Platz vorhanden ist:
                        Arbeitsgruppen[a][y] = this.name;
                        this.zuteilung = a+1; // updated Zuteilung
                        return;
                    }
                }   
            }   
        } else if(!isStudent){ // Fuer Lehrpersonen
            return;
        }
        else { // Wenn bereits zugeteilt:
            System.out.printf(Debug + "[%s/%d] Schueler wurde bereits einer AG zugeteilt.", this.name, this.idNumber);
        }
    }


    // Informationen ueber die Zuteilung
    public void getSorted(){
        if (this.zuteilung != 0){
            System.out.printf(Debug + ANSI_YELLOW + "[%s/%d]" + ANSI_RESET + " befindet sich in der Arbeitsgruppe(AG): [AG %d]%n", this.name, this.idNumber, this.zuteilung, getArrayByID(this.name));
        } 
        else if (!isStudent){
            System.out.printf(Debug + "[%s/%d] ist eine Lehrperson (Keine AG)", this.name, this.idNumber);
        }
        else{
            System.out.printf(Debug + ANSI_RED + "Schueler [%s/%d] wurde noch nicht zugeteilt.%n" + ANSI_RESET, this.name, this.idNumber);
        }
    }


    // Welche AG befindet sich das Objekt
    public int getArrayByID(String name){
        for (int i = 0; i < Arbeitsgruppen.length; i++){
            for (int j = 0; j < Arbeitsgruppen[i].length; j++){
                if (Arbeitsgruppen[i][j] != null && Arbeitsgruppen[i][j].contains(name)){
                    return i+1;
                } 
            }
        } 
        return -1;
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
            Schuelerliste.add(this);
        } else {
            this.isStudent = false;
            LehrerListe.add(this);
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


    @Override
    public int compareTo(Schueler other){
        return this.name.compareToIgnoreCase(other.name); // Sortierung alphabetisch
    } 

    public static void comparabletest(){
        System.out.printf("%n%n------ Sortierte Schueler ------%n");

        Collections.sort(Schuelerliste,
           Comparator.comparingInt((Schueler s) -> s.zuteilung)
                    .thenComparingLong(s -> s.idNumber)
                    .thenComparing(s -> s.getName())
        ); // Sortieren der Liste

        for (Schueler s : Schuelerliste){
            System.out.println(s.zuteilung + ") {ID:" + s.idNumber + "} NAME:" + s.getName());
        }
    }




}
