package JavaLab;

public class Stapler {
    int nStaples = 0;

    public Stapler(int numberStaples){
        nStaples = numberStaples;
    }

    public Stapler(){

    }
    public String howManyStaples(Stapler x){
        if(nStaples == 0){
            return "pusty.";
        }
        else if(nStaples > 0 && nStaples <= 5){
            return "prawie pusty.";
        }
        else if(nStaples > 5 && nStaples <= 10){
            return "prawie pełny.";
        }
        else{
            return "pełny.";
        }
    }

    public boolean staple(Stapler y, double xPapier){
        if(nStaples <= 0){
            return false;
        }
        else if(nStaples > 0 && xPapier <= 50){
            nStaples = nStaples - 1;
            return true;
        }
        else if(nStaples >= 3 && xPapier > 50){
            System.out.println("Za dużo kartek! Tracisz 3 zszywki.");
            nStaples = nStaples - 3;
            return true;
        }
        else{
            return false;
        }
    }

    public void fillStapler(){
        nStaples += 10;
    }
}