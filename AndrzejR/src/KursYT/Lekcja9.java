package KursYT;

public class Lekcja9 {
    public static void main(String[] args) {

        // dziedziczenie

        StudentDzienny sd = new StudentDzienny();
        sd.imie = "Jan";
        sd.nazwisko = "S.Dzienny";
        sd.ObecnoscNaWykladzie();
        sd.komunikat();

        StudentZaoczny sz = new StudentZaoczny();
        sz.imie = "Jan";
        sz.nazwisko = "S.Zaoczny";
        sz.ObecnoscNaWykladzie();

        StudentOnLine so = new StudentOnLine();
        so.imie = "Jan";
        so.nazwisko = "S.Online";
        so.ObecnoscNaWykladzie();

        StudentDziennyInny sdi = new StudentDziennyInny();
        sdi.imie = "Jan";
        sdi.nazwisko = "S.D.Inny";
        sdi.ObecnoscNaWykladzie();
        sdi.komunikat();
    }
}
