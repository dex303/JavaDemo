package JavaLab;

import java.util.Scanner;

public class Utilitarianism {
    public static void main(String[] args) {
        boolean menu = true;
            System.out.println("Podaj imię:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String moral = "neutralne";
        int menuChoice, quantity, util = 0;
        while (menu){
            System.out.println("Wybierz akcję:");
            System.out.println("(1) Kup lody dla ludzi");
            System.out.println("(2) Ukradnij lody od ludzi");
            System.out.println("(3) Wyobraź sobie ludzi jedzących lody");
            System.out.println("(4) Śmierć");
            menuChoice = scanner.nextInt();
            switch (menuChoice){
                case 1:
                    System.out.println("Ile osób było zaangażowanych?");
                    quantity = scanner.nextInt();
                    util = util + (quantity * 3);
                    System.out.println("Spowodowałeś " + (quantity * 3) + " utili szczęścia");
                    break;
                case 2:
                    System.out.println("Ile osób było zaangażowanych?");
                    quantity = scanner.nextInt();
                    util = util - (quantity * 5);
                    System.out.println("Spowodowałeś - " + (quantity * 5) + " utili szczęścia");
                    break;
                case 3:
                    System.out.println("Spowodowałeś " + "0" + " utili szczęścia");
                    break;
                case 4:
                    if (util > 0) moral = "pozytywne";
                    if (util < 0) moral = "negatywne";
                    menu = false;
                    break;
            }
        }
            System.out.println(name + " spoodował " + util + " utili szczęścia.");
            System.out.println("Jego życie było moralnie " + moral);
            System.exit(0);
    }
}
