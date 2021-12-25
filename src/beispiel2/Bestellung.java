package beispiel2;

import java.util.Arrays;

public class Bestellung {
    String nummer;
    Bestellzeile[] zeilen;

    public Bestellung(String nummer, Bestellzeile[] zeilen) {
        this.nummer = nummer;
        this.zeilen = zeilen;
    }

    public String getNummer() {
        return nummer;
    }

    public Bestellzeile[] getZeilen() {
        return zeilen;
    }


    public void printBestellung(){      //Probleme hier!
        System.out.println("Bestellung: "+this.nummer);
        for (int i = 0; i < this.zeilen.length; i++){
            Bestellzeile bz = this.zeilen[i]; // Bestellzeile für Bestellzeile aus dem Array
            System.out.println(bz.getName() + " - "
                    + bz.getMenge() + " Stück zu je "
                    + bz.getPreis() + " EUR = " + bz.getKosten() + " EUR ");
        }

        System.out.println("Gesamtpreis: " + getKosten() + " EUR");

    }

    public double getKosten(){      //Probleme hier!
        double gkosten = 0;

        for(int i = 0; i < this.zeilen.length; i++){
            Bestellzeile bz = this.zeilen[i];
            gkosten = bz.getKosten() + gkosten;
        }
        return gkosten;
    }



}
