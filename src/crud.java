import org.w3c.dom.ls.LSOutput;

import javax.swing.*;

import javax.swing.JOptionPane;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

import static javax.swing.UIManager.getIcon;

public class crud {

    JLabel text = new JLabel("");
    public void openAskDialog(){
        Object[] options = {"Erstellen", "Anzeigen", "Suchen"};
        int opt = JOptionPane.showOptionDialog(null, // Kein Eltern-Component
                "Was möchtest du machen?", // Frage / Nachricht
                "Auswahl Dialog", // Titel des Dialogs
                JOptionPane.DEFAULT_OPTION, // Typ der Buttons
                JOptionPane.QUESTION_MESSAGE, // Typ der Nachricht
                null, // Kein Icon
                options, // Array der Optionen
                options[0]); // Standardoption

        switch (opt) {
            case 0:
                put();
                break;
            case 1:
                show();
                break;
            case 2:
                search();
                break;
            default:
                close();
                break;
        }
    }



    public void put() {

        JFrame frame = new JFrame("Adresse speichern");
        frame.setSize(400, 300);
        calculateCenterLocation(frame);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setDefaultLookAndFeelDecorated(true);
        setLabel(frame);
        setResultText(frame);
        setButton(frame);


       JLabel firstName = new JLabel("Wie ist der Vorname?");
       JLabel surName = new JLabel("Wie ist der Nachname?");
       JLabel phone = new JLabel("Wie ist die Telefonnummer?");

       Contact contact = new Contact(firstName, surName, phone);

    }

    public void show() {

    }

    public void search(){

    }

    public void close(){

    }

    private void calculateCenterLocation(JFrame frame){
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int width = screenSize.width;
        int height = screenSize.height;
        Dimension frameSize = frame.getSize();
        int frameWidth = frameSize.width;
        int frameHeight = frameSize.height;
        frame.setLocation((width - frameWidth) / 2, (height - frameHeight) / 2);
    }

    private static void setLabel(JFrame frame) {
        JLabel text = new JLabel("Wir spielen: \"Rate eine Zahl zwischen 10 und 50\".");
        text.setBounds(20, 20, 360, 30);
        frame.add(text);
    }

    private void setResultText(JFrame frame) {
        text.setBounds(60, 120, 300, 60);
        frame.add(text);
    }

    private void setButton(JFrame frame) {
        JButton checkBtn = new JButton("Speichern");
        checkBtn.setBounds(260, 200, 100, 30);
        checkBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String textFromField = text.getText();


            }
        });
        frame.add(checkBtn);
    }


}

