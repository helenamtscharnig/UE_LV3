package beispiel4;

public class Mitarbeiter {
    private String vorname;
    private String nachname;
    private int mitnummer; //static, weil nur einmal existent
    private double gehalt;
    private int alter;
    private static int snummer = 0;

    public Mitarbeiter(String vorname, String nachname, double gehalt) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.gehalt = gehalt;
        mitnummer = ++snummer;
    }

    public String getVorname() {
        return vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public double getGehalt() {
        return gehalt;
    }

    public int getAlter() {
        return alter;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public void setGehalt(double gehalt) {
        this.gehalt = gehalt;
    }

    @Override
    public String toString() {
        return "Mitarbeiter{" +
                "vorname='" + vorname + '\'' +
                ", nachname='" + nachname + '\'' +
                ", gehalt=" + gehalt +
                ", alter=" + alter +
                '}';
    }

    public double monatsAbrechnung(){
        double abrechnung;
        double sv;
        double est;
        double estgl;

        sv = gehalt *0.2;
        estgl = gehalt - sv;

        if(estgl <= 10000){
            est = estgl*0.1;
        }
        else if (estgl <=20000){
            est = (10000*0.1)+(estgl-20000)*0.2;
        }
        else if (estgl <= 30000){
            est = (10000*0.1)+(10000*0.2)+(estgl-20000)*0.32;
        }
        else if (estgl <= 50000){
            est = (10000*0.1)+(10000*0.2)+(10000*0.32)+(estgl-30000)*0.45;
        }
        else{est = (10000*0.1)+(10000*0.2)+(10000*0.32)+(20000*0.45)+(estgl-50000)*0.6; }

        abrechnung = gehalt - sv - est;
        return abrechnung;
    }

    public double jahresAbrechnung(){
        double jgehalt;
        jgehalt = monatsAbrechnung()*14;
        return jgehalt;
    }

    public double jahresAbrechnung(int monate){
        if(monate != 12){
            double jgehalt;
            jgehalt = monatsAbrechnung()*(14/12*monate);
            return jgehalt;
        }
        else{return jahresAbrechnung();}
    }

}
