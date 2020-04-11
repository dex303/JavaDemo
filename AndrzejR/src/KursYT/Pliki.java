package KursYT;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Pliki {
    public static void main(String[] args) throws IOException {

        String fileName = "plik.txt";
        FileWriter fileWriter = null;

    try {
        fileWriter = new FileWriter(fileName);
        fileWriter.write("Tekst 1\n");
        fileWriter.write("Tekst 2\n");
        fileWriter.write("Tekst 3\n");
        fileWriter.write("Tekst 4\n");
        fileWriter.write("Tekst 5\n");
        //fileWriter.close(); // zamyka strumień
        //fileWriter.flush(); // opróżnia strumień po zamknięciu
    } catch (IOException ex){
        System.out.println("Problem z dostępem do pliku.");
    } finally {
        if(fileWriter == null){
            System.out.println("Problem");
            fileWriter.close();
        } else {
            fileWriter.close(); // uwaga gdyby nie if() wykonało by się nawet jeśli wcześniej wyrzuci błąd
        }
    }

        BufferedReader bf = null; //żeby odczytywać linia po lini

        try{
            bf = new BufferedReader(new FileReader(fileName));
            String linia = null;
            do {
                linia = bf.readLine();
                if(linia != null) {
                    System.out.println(linia);
                }
            }while (linia != null);
        }catch (IOException ex){
            System.out.println("Problem z dsotępem do pliku");
        } finally {
            if(bf.readLine() != null){
                System.out.println("Problem");
                bf.close();
            } else {
                bf.close();
            }
        }
    }
}
