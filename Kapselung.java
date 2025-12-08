public class Kapselung {


    public String marke;
    public int baujahr;
    public int kilometer;


    public void fahren(int km) {


        kilometer += km;

        System.out.println("Das Auto ist " + km + " km gefahren.");
    }
    
}
