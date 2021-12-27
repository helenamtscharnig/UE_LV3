package beispiel3;

public class Anlage {
   private String bezeichnung;
   private double initialWert;
   private double restWert;
   private int nutzungsdauer;
   private int alter;

    public Anlage(String bezeichnung, double initialWert, int nutzungsdauer) {
        this.bezeichnung = bezeichnung;
        this.initialWert = initialWert;
        this.restWert = initialWert;
        this.nutzungsdauer = nutzungsdauer;
        this.alter = 0;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public double getInitialWert() {
        return initialWert;
    }

    public int getNutzungsdauer() {
        return nutzungsdauer;
    }

    public int getAlter() {
        return alter;
    }

    public double getRestWert(){
        return restWert;
    }

    @Override
    public String toString() {
        return "Anlage{" +
                "bezeichnung='" + bezeichnung + '\'' +
                ", initialWert=" + initialWert +
                ", restWert=" + restWert +
                ", nutzungsdauer=" + nutzungsdauer +
                ", alter=" + alter +
                '}';
    }

    public void abschreiben(){
        //Restwert berechnen, wenn Alter kleiner ND ist
        //sonst Restwert ausgeben.
        alter++;
        if(alter<=nutzungsdauer){
            restWert = Math.floor(initialWert / nutzungsdauer * (nutzungsdauer - alter));
        }
    }

    public void simulate(int maxJahre, int minWert){
        int counter = 1;
        while(restWert != 0.0 && counter <= maxJahre && restWert >= minWert){
                    System.out.println("Restwert alt:"+counter+" "+toString());
                    abschreiben();
                    System.out.println("Restwert neu: "+counter+" "+toString());
                    counter++;
        }
    }

    public Anlage renew(int zusatzWert, int zusatzJahre){
        double newInitialWert = restWert + zusatzWert;
        int newNutzungsdauer = (this.nutzungsdauer - this.alter) + zusatzJahre;

        Anlage neueAnlage = new Anlage(this.bezeichnung, newInitialWert, newNutzungsdauer);

        return neueAnlage;
    }


}
