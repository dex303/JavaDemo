package JavaLab;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class OfficeQuest2 {
    public static void main(String[] args) {
        int licznikRund = 0;
        Random randomDostawa = new Random();
        Random randomArkusze = new Random();
        String czas;
        Scanner scanner = new Scanner(System.in);





        List<String> listaCzasu = new ArrayList<>();
        listaCzasu.add("Pozostało 8 godzin, 00 minut");
        listaCzasu.add("Pozostało 7 godzin, 40 minut");
        listaCzasu.add("Pozostało 7 godzin, 20 minut");
        listaCzasu.add("Pozostało 7 godzin, 00 minut");
        listaCzasu.add("Pozostało 6 godzin, 40 minut");
        listaCzasu.add("Pozostało 6 godzin, 20 minut");
        listaCzasu.add("Pozostało 6 godzin, 00 minut");
        listaCzasu.add("Pozostało 5 godzin, 40 minut");
        listaCzasu.add("Pozostało 5 godzin, 20 minut");
        listaCzasu.add("Pozostało 5 godzin, 00 minut");
        listaCzasu.add("Pozostało 4 godzin, 40 minut");
        listaCzasu.add("Pozostało 4 godzin, 20 minut");
        listaCzasu.add("Pozostało 4 godzin, 00 minut");
        listaCzasu.add("Pozostało 3 godzin, 40 minut");
        listaCzasu.add("Pozostało 3 godzin, 20 minut");
        listaCzasu.add("Pozostało 3 godzin, 00 minut");
        listaCzasu.add("Pozostało 2 godzin, 40 minut");
        listaCzasu.add("Pozostało 2 godzin, 20 minut");
        listaCzasu.add("Pozostało 2 godzin, 00 minut");
        listaCzasu.add("Pozostało 1 godzin, 40 minut");
        listaCzasu.add("Pozostało 1 godzin, 20 minut");
        listaCzasu.add("Pozostało 1 godzin, 00 minut");
        listaCzasu.add("Pozostało 0 godzin, 40 minut");
        listaCzasu.add("Pozostało 0 godzin, 20 minut");
        listaCzasu.add("Gratulacje - wygrałeś!");

        for(int i = 0; i < listaCzasu.size(); i++){
            czas = listaCzasu.get(i);
            System.out.println(czas);
        }

    }
}