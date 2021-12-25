package beispiel1;

public class DemoRezept {
    public static void main(String[] args) {
        Zutat rezept1 = new Zutat("Mehl", 200);
        Zutat rezept2 = new Zutat("Milch", 500);
        Zutat rezept3 = new Zutat("Eier", 2);

        Zutat[] zutaten = {rezept1, rezept2, rezept3};

        Rezept palatschinken = new Rezept("Palatschinken", 2, zutaten);
        palatschinken.printRezept();

        Rezept pala4 = palatschinken.umrechnen(4);
        pala4.printRezept();

    }



}
