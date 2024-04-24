import java.util.Arrays;

public class Contactlist {

    // Array für Elemente
    Contact[] contactList = new Contact[2];

   // Objektmethode hinhzufügen

    public void addContact(Contact contact) {
       int index = 0;
        boolean addedContact = false;
       while(index < contactList.length) {
           if(contactList[index] == null) {
               contactList[index] = contact;
               index = contactList.length;
               addedContact = true;
               break;
           } else {
               index++;
           }
       }
        if(!addedContact) newArray(contact, contactList.length);
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
        printContact();
    }

    // objektmeth Array kopieren
    private void newArray(Contact contact, int length){
        Contact[] contactsCopy = new Contact[length + 1];
        System.arraycopy(contactList, 0, contactsCopy, 0, contactList.length);
        contactsCopy[length + 1] = contact;
        contactList = contactsCopy;
        printContact();

    }

    private void printContact() {
            System.out.println(Arrays.toString(contactList));
    }



}
