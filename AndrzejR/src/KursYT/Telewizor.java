package KursYT;

public class Telewizor {

    private String marka;
    private int przekątna;

    public Telewizor(String marka, int przekątna) { //konstruktor argumentowy, przysłania domyślny
                            // i jeśli chcemy korzystać z domyślnego, musimy go utworzyć
        this.marka = marka;
        this.przekątna = przekątna;
    }

    public Telewizor() {} //konstruktor domyślny, bezargumentowy



    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public int getPrzekątna() {
        return przekątna;
    }

    public void setPrzekątna(int przekątna) {
        this.przekątna = przekątna;
    }

    public void volumeUp() {
        System.out.println("Volume up");
    }

    public void volumeDown() {
        System.out.println("Volume down");
    }

    public void programUp() {
        System.out.println("Program up");
    }

    public void programDown() {
        System.out.println("Program down");
    }
}
