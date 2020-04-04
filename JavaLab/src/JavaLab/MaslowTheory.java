package JavaLab;

import java.util.Scanner;

public class MaslowTheory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int level;
        while (true) {
            System.out.println("Wybierz poziom potrzeb 1-5 lub 6 aby zakończyć.");
            level = scanner.nextInt();
            if (level >= 6) {
                System.exit(0);
            } else {
                for (int i = 1; i <= level; i++) {
                    switch (i) {
                        case 1:
                            System.out.println("1. Fizjologiczne (np. tlen, jedzenie, woda)");
                            break;
                        case 2:
                            System.out.println("2. Bezpieczeństwo (np. bezpieczeństwo osobiste i finansowe)");
                            break;
                        case 3:
                            System.out.println("3. Miłość i przynależność (np. przyjaźń i rodzina)");
                            break;
                        case 4:
                            System.out.println("4. Szacunek (np. szacunek innych, szacunek do samego siebie)");
                            break;
                        case 5:
                            System.out.println("5. Samorealizacja (osiągnięcie całkowitego potencjału)");
                            break;
                    }
                }
            }
        }
    }
}
