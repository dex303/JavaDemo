package JavaLab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lab07 {
        static Scanner scanner = new Scanner(System.in);
        static boolean again = true;

    public static void main(String[] args) {
        System.out.println("Określ wielkość wszechświata (1-127):");
        byte universeSize = scanner.nextByte();
        char spot = '.';
        char carrot = '^';
        char baby = 0, child = 1, adult = 2;
        int runda = -1;

        // tworzymy tablicę
        List<Character> universe = new ArrayList<>(universeSize);

            for (int i = 0; i < universeSize; i++) {
                universe.add(spot);
            }
            for (int i = 4; i < universe.size(); i = i + 5) {
                universe.set(i, carrot);
            }
        while(again) {
            again = false;
            for (int i = (runda + 1); i < universe.size(); i = i + 7) {
                if(runda < 3) {
                    universe.set(i, baby);
                }
            }
            for (int i = 0; i < universe.size(); i++) {
                System.out.print(universe.get(i));
            }
            System.out.println("");
            response();
        }
    }

    public static void response(){
        System.out.println("(J)eszcze raz, (z)apisz lub (w)yjdź");
        String respone = scanner.next();

        if (respone.equals("J") || respone.equals("j")){
            again = true;
        }else if(respone.equals("Z") || respone.equals("z")){
            System.out.println("Zapisano dp pliku.");
            response();
        }else if(respone.equals("W") || respone.equals("w")){
            System.exit(0);
        }else {
            System.out.println("Wybrano błędny przycisk.");
            response();
        }
    }
}
