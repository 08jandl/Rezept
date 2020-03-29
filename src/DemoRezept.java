public class DemoRezept {

    public static void main (String[] args) {

        Zutat[] zutaten = new Zutat [4];
        zutaten[0] = new Zutat ("Mehl", 100.0);
        zutaten[1] = new Zutat ("Wasser", 120.0);
        zutaten[2] = new Zutat ("Zucker", 20.0);
        zutaten[3] = new Zutat ("Zimt", 10.0);

        Rezept palatschinken = new Rezept ("Palatschinken", 2, zutaten);

        palatschinken.printRezept();
        palatschinken.umrechnen(3);
        palatschinken.gesamtGewicht();





    }
}
