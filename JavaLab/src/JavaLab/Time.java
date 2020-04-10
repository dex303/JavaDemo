package JavaLab;

import java.util.ArrayList;
import java.util.List;

public class Time {

    public static void timeToGO(int x) {
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
        System.out.println(listaCzasu.get(x));
    }
}