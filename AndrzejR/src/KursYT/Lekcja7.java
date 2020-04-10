package KursYT;

import java.util.Scanner;

public class Lekcja7 {
    public static void main(String[] args) {

        //odczyt z klawiatury
        // oraz parsowanie

        Scanner scanner = new Scanner(System.in);

        String str;


        System.out.print("Wpisz coś: ");

        str = scanner.nextLine();

        try {

        int x = Integer.parseInt(str);

    System.out.println("Wpisałeś " + x);
    }catch (Exception e){
            System.out.println("niepoprawny format liczby");
            main(null);
        }

        System.out.println("Podaj liczbę: ");

        try {
            int liczba = scanner.nextInt();

            String str2 = String.valueOf(liczba);
            System.out.println(str2);
        }catch (Exception e){}
    }
}
