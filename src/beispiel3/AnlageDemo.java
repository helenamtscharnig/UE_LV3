package beispiel3;

public class AnlageDemo {
    public static void main(String[] args) {
       Anlage laptop = new Anlage("Laptop", 5000, 5);

       System.out.println(laptop.toString());
       laptop.abschreiben();
       System.out.println(laptop.toString());
       laptop.simulate(3, 300);

       Anlage neu = laptop.renew(2000, 4);
       System.out.println(neu.toString());
    }
}
