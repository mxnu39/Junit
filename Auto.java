public class Auto {
    
    private String marke;
    private int baujahr;
    private int kilometer;

    public void fahren(int km) {
        this.kilometer += km;
        System.out.println("Das Auto ist " + km + " km gefahren.");
    }

    public Auto(){
        this.marke = "Unbekannt";
        this.baujahr = 2000;
        this.kilometer = 0;
    }

    public Auto(String marke, int baujahr, int kilometer){
        this.marke = marke;
        this.baujahr = baujahr;
        this.kilometer = kilometer;
    }

    public void setMarke(String marke){
        if (marke != null){
            this.marke = marke;
        }
            System.out.printf("Die angegebene Marke(%s) konnte nicht gespeichert werden.%n", marke);
    }

    public void setBaujahr(int baujahr){
        if(!(baujahr < 1886)){
            this.baujahr = baujahr;
        }else{
            System.out.printf("Angegebenes Baujahr(%d) konnte nicht gespeichert werden.%n",baujahr);
        }
    }

    public void setKilometer(int kilometer){
        if(kilometer>=0){
            this.kilometer = kilometer;
        }else{
            System.out.printf("Angegebene Kilometeranzahl(%d) konnte nicht gespeichert werden.%n", kilometer);
        }
    }

    public String getMarke(){return this.marke;}
    public int getBaujahr(){return this.baujahr;}
    public int kilometer(){return this.kilometer;}

    public void anzeigen(){System.out.printf("Das Auto der Marke: %s ist seit %d %dkm weit gefahren.%n", this.marke, this.baujahr, this.kilometer);}

}
