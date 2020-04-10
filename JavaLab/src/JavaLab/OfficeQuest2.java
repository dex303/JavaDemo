package JavaLab;


import java.util.Random;
import java.util.Scanner;

public class OfficeQuest2 {
        static Stapler2 stapler2 = new Stapler2(10);
        static TapeDispenser2 tapeDispenser2 = new TapeDispenser2(50);
        static int xPapier, xDostawa;


    public static void main(String[] args) {
        int licznikRund = 0;
        Random randomDostawa = new Random();
        Random randomArkusze = new Random();
        boolean gramy = true;

        while (gramy) {
            System.out.println("Runda: " + licznikRund);
            System.out.println("Zszywacz jest " + stapler2.ileZszywek(stapler2));
            System.out.println("Dozownik taśmy jest " + tapeDispenser2.ileTasmy(tapeDispenser2));

            xDostawa = randomDostawa.nextInt(99) + 1;
            if (xDostawa <= 5) {
                stapler2.dodajZszywki(10);
                System.out.println("Dostałeś 10 zszywek.");
            } else if (xDostawa <= 10) {
                tapeDispenser2.zmienTasme();
                System.out.println("Dostałeś nową taśmę.");
            } else {
                xPapier = randomArkusze.nextInt(59) + 1;
                System.out.println("Dostałeś " + xPapier + " arkuszy papieru.");
                System.out.println("[Z}szyć je czy [s]kleić? Wciśnij klawisz z lub s.");
                wybor();
            }
                Time.timeToGO(licznikRund);
                System.out.println("........................");
                if (licznikRund == 24) {
                    System.exit(0);
                }
                licznikRund++;
        }
    }

    public static void wybor() {
        String wyborGracza;
        Scanner scanner = new Scanner(System.in);
        wyborGracza = scanner.next();
        if (wyborGracza.equals("Z") || wyborGracza.equals("z")) {
            if(stapler2.zszywanie(stapler2,xPapier)){
                System.out.println("Zszyłeś kartki.");
            }else {
                System.out.println("Przegrałeś - zabrakło zszywek!)");
                System.exit(0);
            }
        } else if (wyborGracza.equals("S") || wyborGracza.equals("s")) {
            if(tapeDispenser2.klejenie(tapeDispenser2,xPapier)){
                System.out.println("Skleiłeś kartki");
            }else {
                System.out.println("Przegrałeś - zabrakło taśmy!)");
                System.exit(0);
            }
        } else {
            System.out.println("Wybrano niepoprawny klawisz.");
                System.out.println("[Z}szyć je czy [s]kleić? Wciśnij klawisz z lub s.");
                wybor();
        }
    }
}
