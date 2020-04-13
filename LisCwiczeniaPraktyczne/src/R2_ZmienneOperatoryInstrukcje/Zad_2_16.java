package R2_ZmienneOperatoryInstrukcje;

// równanie kwadratowe = A*x^2 + B*x + C = 0
// delta: d=B^2-4*a*C
// d>0 mamy dwa rozwiązania x1=(-B+sqrt(d))/(2*A) oraz x2=(-B-sqrt(d))/(2*A)
// d=0 mamy jedno rozwiązanie x= -B /(2*A)
// d<0 brak rozwiązania
// oblicz pierwiastki równania kwadratowego o parametrach A=1, B=-1, C=-6

public class Zad_2_16 {
    public static void main(String[] args) {
        int pA = 1, pB = -1, pC = 6;
        double d, x1, x2;
        System.out.println("Parametry A = "+ pA + " , B = " + pB + " , C = " + pC);

        // liczymy deltę
        if (pA == 0){
            System.out.println("To nie jest równanie kwadratowe A = 0!");
        }else{
        d = pB ^ 2 - 4 * pA * pC;
        if(d>0){
            x1 = (-pB + Math.sqrt(d))/(2*pA);
            x2 = (-pB - Math.sqrt(d))/(2*pA);
            System.out.println(" Rzowiązanie: x1= " + x1 + " oraz x2= " + x2);
        }else if (d == 0) {
                x1 = (-pB) / (2 * pA);
                System.out.println("Rozwiązanie: x = " + x1);
            } else {
                System.out.println("Brak rozwiązania.");
            }
        }
    }
}
