package KursYT;

public class Lekcja5 {

    public static void main(String[] args) {

        int x = 6;

        if (x == 4){
            System.out.println("X = 4");
        }else if (x == 6){
            System.out.println("X = 6");
        }else if (x == 7) {
            System.out.println("X = 7");
        }else {
            System.out.println("X nie ma żądanej wartości");
        }

        System.out.println("Koniec if i zaczynamy switch");

        /*switch (x) {
            case 4:
                System.out.println("X = 4");
                break;
            case 6:
                System.out.println("X = 6");
                break;
            case 7:
                System.out.println("X = 7");
                break;
            default:
                System.out.println("X nie ma żądanej wartości");
                break;
        }*/

        switch (x) {
            case 4:
                showNumber(x);
                break;
            case 6:
                showNumber(x);
                break;
            case 7:
                showNumber(x);
                break;
            default:
                System.out.println("X nie ma żądanej wartości");
                break;
        }

        System.out.println("Koniec switch");

        String imie = "Jan";
        String imie2 = "Kasia";

        if (imie.equals("Jan")){
            System.out.println("Cześć " + imie);
        }

        if (imie == "Jan"){
            System.out.println("Cześć " + imie);
        }

        if(imie != "Kasia"){
            System.out.println("Cześć " + imie);
        }

        if(imie.equals("Jan") && imie2.equals("Kasia")){
            System.out.println("Cześć " + imie + " i " + imie2);
        }
    }

    public static void showNumber(int x){
        System.out.println("X = " + x);
    }
}
