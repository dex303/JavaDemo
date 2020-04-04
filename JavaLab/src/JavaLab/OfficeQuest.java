package JavaLab;


import java.util.Random;
import java.util.Scanner;

public class OfficeQuest {
    static int licznikTur = 0;

    public static void main(String[] args){

        String wyborGracza = "";
        double xPapier = 0;
        int xDostawa = 5;
        Scanner wybor = new Scanner(System.in);
        boolean turn = true;
        boolean answer = true;
        Random rngPaper = new Random();
        Random rngDelivery = new Random();

        System.out.println("Witam w Biurowym Wyzwaniu");
        Stapler zszywacz = new Stapler(10);
        TapeDispenser tasma = new TapeDispenser(50);
        while(turn){
            answer = true;
            xPapier = rngPaper.nextInt(59) + 1;
            System.out.println("Tura " + licznikTur);
            czasTur(licznikTur);


            System.out.println("Zszywacz jest... " + zszywacz.howManyStaples(zszywacz));

            System.out.println("Podajnik taśmy jest... " + tasma.howManyTapes(tasma));

            if(licznikTur > 0){
                xDostawa = rngDelivery.nextInt(99) + 1;
            }
            if(licznikTur == 0){
                System.out.printf("%.0f arkuszy papieru zostało dostarczone! %n", xPapier);
            }
            if(wyborGracza.equals("T") || wyborGracza.equals("t") || wyborGracza.equals("Z") || wyborGracza.equals("z")){
                if(xDostawa >= 1 && xDostawa <= 5){
                    System.out.println("Dostałeś nową rolkę taśmy!");
                    tasma.fillTape();
                    answer = false;
                    licznikTur++;
                }
                else if(xDostawa >= 6 && xDostawa <= 10){
                    System.out.println("Dostałeś 10 zszywek!");
                    zszywacz.fillStapler();
                    answer = false;
                    licznikTur++;
                }
                else{
                    System.out.printf("%.0f arkuszy papieru zostało dostarczone! %n", xPapier);
                }
            }



            while(answer){

                System.out.println("Użyć [Z]szywacza czy [T]aśmy?");

                wyborGracza = wybor.nextLine();

                if(wyborGracza.equals("Z") || wyborGracza.equals("z")){
                    turn = false;
                    licznikTur++;
                    if(zszywacz.staple(zszywacz, xPapier)){
                        answer = false;
                        turn = true;
                        System.out.println("-------------------------------");
                        System.out.println("                               ");
                        System.out.println("Zszyłeś razem kartki.");
                    }
                    else{
                        System.out.println("Przegrałeś, dobra gra! (Brak zszywek, żeby kontynuować.)");
                        System.exit(0);
                    }



                }
                else if(wyborGracza.equals("T") || wyborGracza.equals("t")){
                    turn = false;
                    licznikTur++;
                    if(tasma.tape(tasma, xPapier)){
                        answer = false;
                        turn = true;
                        System.out.println("-------------------------------");
                        System.out.println("                               ");
                        System.out.println(" Skleiłeś razem arkusze papieru.");
                    }
                    else{
                        System.out.println("Przegrałeś, dobra gra! (Brak taśmy, żeby kontynuować)");
                        System.exit(0);
                    }


                }
                else{
                    System.out.println("Proszę wcisnąć poprawny przycisk na klawiaturze.");
                }
            }

        }

    }

    public static void czasTur(int licznikTur){
        String czas = "";

        switch (licznikTur){

            case 0: czas = "8 godzin, 0 minut do wyjścia";
                System.out.println(czas);
                break;
            case 1: czas = "7 godzin, 40 minut do wyjścia";
                System.out.println(czas);
                break;
            case 2: czas = "7 godzin, 20 minut do wyjścia";
                System.out.println(czas);
                break;
            case 3: czas = "7 godzin, 0 minut do wyjścia";
                System.out.println(czas);
                break;
            case 4: czas = "6 godzin, 40 minut do wyjścia";
                System.out.println(czas);
                break;
            case 5: czas = "6 godzin, 20 minut do wyjścia";
                System.out.println(czas);
                break;
            case 6: czas = "6 godzin, 0 minut do wyjścia";
                System.out.println(czas);
                break;
            case 7: czas = "5 godzin, 40 minut do wyjścia";
                System.out.println(czas);
                break;
            case 8: czas = "5 godzin, 20 minut do wyjścia";
                System.out.println(czas);
                break;
            case 9: czas = "5 godzin, 0 minut do wyjścia";
                System.out.println(czas);
                break;
            case 10: czas = "4 godziny, 40 minut do wyjścia";
                System.out.println(czas);
                break;
            case 11: czas = "4 godziny, 20 minut do wyjścia";
                System.out.println(czas);
                break;
            case 12: czas = "4 godziny, 0 minut do wyjścia";
                System.out.println(czas);
                break;
            case 13: czas = "3 godziny, 40 minut do wyjścia";
                System.out.println(czas);
                break;
            case 14: czas = "3 godziny, 20 minut do wyjścia";
                System.out.println(czas);
                break;
            case 15: czas = "3 godziny, 0 minut do wyjścia";
                System.out.println(czas);
                break;
            case 16: czas = "2 godziny, 40 minut do wyjścia";
                System.out.println(czas);
                break;
            case 17: czas = "2 godziny, 20 minut do wyjścia";
                System.out.println(czas);
                break;
            case 18: czas = "2 godziny, 0 minut do wyjścia";
                System.out.println(czas);
                break;
            case 19: czas = "1 godzina, 40 minut do wyjścia";
                System.out.println(czas);
                break;
            case 20: czas = "1 godzina, 20 minut do wyjścia";
                System.out.println(czas);
                break;
            case 21: czas = "1 godzina, 0 minut do wyjścia";
                System.out.println(czas);
                break;
            case 22: czas = "0 godzin, 40 minut do wyjścia";
                System.out.println(czas);
                break;
            case 23: czas = "0 godzin, 20 minut do wyjścia";
                System.out.println(czas);
                break;
            case 24: czas = "Wygrałeś Biurowe Wyzwanie!";
                System.out.println(czas);
                System.exit(0);
                break;
        }
    }

}