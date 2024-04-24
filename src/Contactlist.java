import java.util.Arrays;
import java.util.Comparator;

public class Contactlist {

    // Array für Elemente
    // ein Array für immer genau die größe bereitzustellen kostet performance
    Contact[] contactList = new Contact[10];

   // Objektmethode hinhzufügen

    public void addContact(Contact contact) {
       int index = 0;
       boolean addedContact = false;
       while(index < contactList.length) {
           if(contactList[index] == null) {
               contactList[index] = contact;
               addedContact = true;
               break;
           } else {
               index++;
           }
       }
        if(!addedContact) {
            newArray(contact);
        }
        printContact();
    }

    // objekt entfernen
    public void deleteContact(Contact contact) {
        int index = 0;
        while(index < contactList.length) {
            if(contactList[index] == contact) {
                contactList[index] = null;
                index = contactList.length;
            } else {
                index++;
            }
        }
        sortContacts();
        printContact();
    }

    // objektmeth Array kopieren
    private void newArray(Contact contact){
        Contact[] contactsCopy = new Contact[contactList.length + 5];
        System.arraycopy(contactList, 0, contactsCopy, 0, contactList.length);
        contactsCopy[contactList.length] = contact;
        contactList = contactsCopy;
        printContact();

    }

    private void printContact() {
            System.out.println(Arrays.toString(contactList));
    }

    private void sortContacts() {
        Arrays.sort(contactList, Comparator.nullsLast(Comparator.comparing(Contact::getSurname, Comparator.nullsLast(String::compareTo))));
    }
}
