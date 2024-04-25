import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        //Kontakte laden

        //Kontaktklasse erstellen
        Contact Martin = new Contact("Martin", "Buder", "01512 899 7385");
        Contact Peter = new Contact("Peter", "Duder", "01512 899 7385");
        Contact Vroni = new Contact("Vroni", "Buder", "01512 899 7385");

        Contactlist phoneBook = new Contactlist();
        phoneBook.addContact(Martin);
        phoneBook.addContact(Vroni);
        phoneBook.addContact(Peter);
        phoneBook.deleteContact(Peter);

        //Listenstruktur für Kontakte implementieren


        //Eingabenaufforderung
        crud dialog = new crud();
        dialog.openAskDialog();

        //Logik

        // Kontakte Speichern
    }


}