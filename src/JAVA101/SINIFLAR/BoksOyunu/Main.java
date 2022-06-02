package JAVA101.SINIFLAR.BoksOyunu;

public class Main {
    public static void main(String[] args) {
        Fighter marc = new Fighter("Marc", 15, 100, 90, 0, Math.random());
        Fighter alex = new Fighter("Alex", 10, 95, 100, 0, Math.random());
        Ring r = new Ring(marc, alex, 90, 100);
        r.run();
    }
}