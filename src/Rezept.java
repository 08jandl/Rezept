import java.util.Arrays;

public class Rezept {


    public String name;
    public int personen;
    public Zutat[] zutat;
    public double menge;

    public Rezept(String name, int personen, Zutat[] zutat) {
        this.name = name;
        this.personen = personen;
        this.zutat = zutat;
    }

    public void printRezept(){
        System.out.println(name);
        for (Zutat t: zutat) {
            t.print();
        }
    }

    public void umrechnen(int neuePersonen) {
        for (Zutat t : zutat) {
            menge = (t.menge/personen) * neuePersonen;
            System.out.println("Neue Menge für " + neuePersonen + " Personen = " + menge);
        }
        personen = neuePersonen;
    }

    public double gesamtGewicht(){
        double gewicht = 0;
        for (Zutat t : zutat) {
            gewicht = gewicht + t.menge;
                    }
        System.out.println("Das Gesamtgewicht beträgt: " + gewicht);
        return gewicht;
    }
}
