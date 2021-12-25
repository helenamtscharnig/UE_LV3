package beispiel1;
import java.util.Arrays;

public class Rezept {

    private String name;
    private int personen;
    private Zutat[] zutaten;    //so initialisiere ich einen Array, kein Datentyp erforderlich

    public Rezept(String name, int personen, Zutat[] zutaten) {
        this.name = name;
        this.personen = personen;
        this.zutaten = zutaten;
    }

    public String getName() {
        return name;
    }

    public int getPersonen() {
        return personen;
    }

    public Zutat[] getZutaten() {
        return zutaten;
    }

    public void printRezept(){
        System.out.println("Rezeptname: "+name);
        System.out.println("Personen: "+personen);
        System.out.println("Zutaten: ");
        for(int i = 0; i < zutaten.length; i++){
            System.out.println(zutaten[i].toString());
        }
    }

    public Rezept umrechnen(int personen){
        double faktor = personen / (getPersonen()*1.0);

        Zutat[] neueZutaten = new Zutat[zutaten.length];
        for (int i = 0; i < zutaten.length; i++){
            neueZutaten[i] = new Zutat(
                    this.zutaten[i].getName(), (int) (this.zutaten[i].getMenge()*faktor)
            );
        }

        Rezept neu = new Rezept(name, personen, neueZutaten);
        return neu;

    }

    @Override
    public String toString() {
        return "Rezept{" +
                "name='" + name + '\'' +
                ", personen=" + personen +
                ", zutaten=" + Arrays.toString(zutaten) +
                '}';
    }
}
