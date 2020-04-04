package JavaLab;

public class TapeDispenser {
    double nTapes = 50;

    public TapeDispenser(double numberTapes){
        nTapes = numberTapes;
    }

    public TapeDispenser(){

    }

    public String howManyTapes(TapeDispenser TapeDispenser){
        if(nTapes == 0){
            return "pusty.";
        }
        else if(nTapes > 0 && nTapes < 15){
            return "prawie pusty.";
        }
        else if(nTapes >= 15 && nTapes < 35){
            return "około połowy.";
        }
        else if(nTapes >= 35 && nTapes < 45){
            return "prawie pełny.";
        }
        else{
            return "pełny.";
        }
    }

    public boolean tape(TapeDispenser TapeDispenser, double xPapers){
        if(nTapes - (xPapers * 0.25) >= 0){
            nTapes = nTapes - (xPapers * 0.25);
            return true;
        }
        else{
            return false;
        }
    }

    public void fillTape(){
        nTapes = 50;
    }
}
