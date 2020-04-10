package JavaLab;

public class TapeDispenser2 {
    double tasma = 50;

    public TapeDispenser2(double iloscTasmy){
        tasma = iloscTasmy;
    }

    public TapeDispenser2(){

    }

    public String ileTasmy(TapeDispenser2 TapeDispenser2){
        if(tasma == 0){
            return "pusty.";
        }
        else if(tasma > 0 && tasma < 15){
            return "prawie pusty.";
        }
        else if(tasma >= 15 && tasma < 35){
            return "około połowy.";
        }
        else if(tasma >= 35 && tasma < 45){
            return "prawie pełny.";
        }
        else{
            return "pełny.";
        }
    }

    public boolean klejenie(TapeDispenser2 TapeDispenser2, double xPapier){
        if(tasma - (xPapier * 0.25) >= 0){
            tasma = tasma - (xPapier * 0.25);
            return true;
        }
        else{
            return false;
        }
    }

    public void zmienTasme(){
        tasma = 50;
    }
}
