package JavaLab;

public class Stapler2 {
    int zszywki = 0;

    public Stapler2(int iloscZszywek){
        zszywki = iloscZszywek;
    }

    public Stapler2(){

    }

    public String ileZszywek(Stapler2 Stapler2){
        if(zszywki == 0){
            return "pusty.";
        }
        else if(zszywki > 0 && zszywki <= 5){
            return "prawie pusty.";
        }
        else if(zszywki > 5 && zszywki <= 10){
            return "prawie pełny.";
        }
        else{
            return "pełny.";
        }
    }

    public boolean zszywanie(Stapler2 Stapler2, double xPapier){
        if(zszywki <= 0){
            return false;
        }
        else if(zszywki > 0 && xPapier <= 50){
            zszywki = zszywki - 1;
            return true;
        }
        else if(zszywki >= 3 && xPapier > 50){
            System.out.println("Za dużo kartek! Tracisz 3 zszywki.");
            zszywki = zszywki - 3;
            return true;
        }
        else{
            return false;
        }
    }

    public void dodajZszywki(int x){
        zszywki += x;
    }
}