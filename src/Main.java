import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        File file = new File("text.txt");
        System.out.println(file.exists()); // file.exists() fragt ab, ob Datei existiert

        try {
            file.createNewFile();
        } catch (IOException e) {
            System.out.println("Fehler");
        }

        //in die Datei schreiben
        try {
            FileWriter writer = new FileWriter(file);
            writer.write("Hei ich schreibe einen Text.");
            writer.close();
        } catch (IOException e) {
            System.out.println("Fehler");
        }

        // datei lesen
        try {
          FileReader reader = new FileReader(file);
          int zeichen = 0;
          while (zeichen != -1) {
              zeichen = reader.read();
              System.out.print((char) zeichen);
          };
          reader.close();
        } catch (IOException e) {
            System.out.println("Fehler");
        }

    }
}