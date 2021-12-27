package beispiel4;

public class AbrechnungDemo {
    public static void main(String[] args) {
        Mitarbeiter m1 = new Mitarbeiter("Helena", "Tscharnig", 3000);
        Mitarbeiter m2 = new Mitarbeiter("Johannes", "Tscharnig", 5000);

        System.out.println("Monatsabrechnung M1: "+m1.monatsAbrechnung());
        System.out.println("Monatsabrechnung M2: "+m2.monatsAbrechnung());

        System.out.println("Jahresabrechnung M1: "+m1.jahresAbrechnung(8));
        System.out.println("Jahresabrechnung M2: "+m2.jahresAbrechnung(12));
    }
}
