package Aufgaben.elektronik;


public class Computer implements Elektronisch {

    @Override
    public void einschalten() {
        System.out.println("Computer wird eingeschaltet.");
    }

    @Override
    public void ausschalten() {
        System.out.println("Computer wird ausgeschaltet.");
    }

    public static void main(String[]args){
        Computer c = new Computer();
        c.einschalten();
        c.ausschalten();
    }

}
