package beispiel2;

public class BestellungDemo {
    public static void main(String[] args) {
        Bestellzeile bz1 = new Bestellzeile("Hemd", 1, 40);
        Bestellzeile bz2 = new Bestellzeile("Hose", 2, 50);
        Bestellzeile bz3 = new Bestellzeile("Socken", 1, 5);

        Bestellzeile[] order1 = new Bestellzeile[3];
        order1[0] = bz1;
        order1[1] = bz2;
        order1[2] = bz3;

        Bestellung b1 = new Bestellung("B1", order1);
        b1.printBestellung();
    }





}
