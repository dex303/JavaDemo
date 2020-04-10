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

        System.out.println("\nxXxXxXxXxXxXxXxXxXxXxXxXx\n");


        // polimorfizm
        // pozwala np. na zrobienie tablicy obiektów różnych typów, ale skorelowanych przez dziedziczenie

        Student [] studentTable = new Student[4];

        studentTable[0] = new StudentDzienny();
        studentTable[1] = new StudentZaoczny();
        studentTable[2] = new StudentDziennyInny();
        studentTable[3] = new StudentOnLine();

        for (int x = 0; x < studentTable.length; x++){
            studentTable[x].ObecnoscNaWykladzie();
        }

        // dzięki polimorfizmowi możemy stworzyć obiekt gdzie
        // zmienna jest typu Student ale obiekt jest typu StudentOnLine
        Student s = new StudentOnLine();
        wezStudenta(s);

        System.out.println("\nxXxXxXxXxXxXxXxXxXxXxXxXx\n");
        ObslugaStudenta st = new ObslugaStudenta();

        StudentOnLine sto = new StudentOnLine();
        StudentDzienny std = new StudentDzienny();

        st.obsluz(sto);
        st.obsluz(std);
    }

    public static void wezStudenta(Student s){
        System.out.println("\nxXxXxXxXxXxXxXxXxXxXxXxXx\n");
        s.ObecnoscNaWykladzie();
    }
}

class ObslugaStudenta{
    public void obsluz(Student st){
        st.ObecnoscNaWykladzie();
    }
}
