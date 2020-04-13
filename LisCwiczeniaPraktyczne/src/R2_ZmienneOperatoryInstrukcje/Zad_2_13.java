package R2_ZmienneOperatoryInstrukcje;

// Przekroczenie zakresu zmiennej

public class Zad_2_13 {
    public static void main(String[] args) {
    long a, b = (long) Math.pow(2, 63);
        System.out.println(b);
    a = b + b;
        System.out.println("a = " + a);
    }
}
