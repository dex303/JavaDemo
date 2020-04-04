package KursYT;

public class Lekcja6 {
    public static void main(String[] args) {

        /*Telewizor t = new Telewizor();
            t.volumeUp();
            t.volumeDown();
            t.programUp();
            t.programDown();
            t.marka = "Sony";
            t.przekątna = 51;
            System.out.println(t.marka);
            System.out.println(t.przekątna);*/

        /*Telewizor t1 = new Telewizor();
            t1.marka = "Sony";
            t1.przekątna = 51;

        Telewizor t2 = new Telewizor();
            t2.marka = "Panasonic";
            t2.przekątna = 57;

        System.out.println(t1.marka);
        System.out.println(t1.przekątna);

        System.out.println(t2.marka);
        System.out.println(t2.przekątna);*/

        /*Telewizor t1 = new Telewizor();
        t1.setMarka("Sony");
        t1.setPrzekątna(54);
        System.out.println(t1.getMarka());
        System.out.println(t1.getPrzekątna());

        String marka = t1.getMarka();
        int przekatna = t1.getPrzekątna();
        System.out.println(marka);
        System.out.println(przekatna);

        Telewizor t2 = new Telewizor();
        t2.setMarka("Panasonic");
        t2.setPrzekątna(99);

        System.out.println(t2.getMarka());
        System.out.println(t2.getPrzekątna());*/

        Telewizor t1 = new Telewizor("Samsung", 32);
        Telewizor t2 = new Telewizor();
        t2.setMarka("Sharp");
        t2.setPrzekątna(40);

        System.out.println(t1.getMarka());
        System.out.println(t1.getPrzekątna());
        System.out.println(t2.getMarka());
        System.out.println(t2.getPrzekątna());
    }
}
