package KursYT;

public class Lekcja8 {
    public static void main(String[] args) {

        // przeciążanie
        // metod

        Lekcja8 ref = new Lekcja8();
        ref.metoda01();
        ref.metoda01("z parametrem");
        ref.metoda01("z parametrem", 3);
        ref.metoda01(4, "odwrotnej");

    }

    public void metoda01() {
        System.out.println("test metody");
    }

    public void metoda01(String string) {
        System.out.println("test metody " + string);
    }

    public void metoda01(String string, int x) {
        System.out.println("test metody " + string + " numer " + x);
    }

    public void metoda01(int x, String string) {
        System.out.println("test metody " + string + " numer " + x);
    }
}
