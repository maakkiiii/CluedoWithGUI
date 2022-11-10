package ch.bbw.pr.cluedo;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

import java.io.IOException;

public class ViewController
{
    @FXML
    private TextArea person;

    @FXML
    private TextArea waffe;

    @FXML
    private TextArea ort;

    @FXML
    private TextArea answer;

    @FXML
    private TextArea taeter;

    @FXML
    private TextArea tatwaffe;

    @FXML
    private TextArea tatort;

    GameLogik gameLogik;

    public void printAll()
    {
        Person[] personen = new Person[]
                {
                        new Person("Maki", 0, "breit wie en kühlschrank","King of Heroes"),

                        new Person("Heinrich",1 , "mittelstark", "Hausmeister und schlecht bezahlt"),
                        new Person("Peter", 2, "stark", "Aushilfe Hausmeister und schlecht bezahlt" ),
                        new Person("Michael", 3, "schwach","Neca's Sugar Daddy, liebt Jagen" ),
                        new Person("Chantal", 4, "schwach", "Köchin, aber dumm wie stroh"),
                        new Person("Janine", 5, "mittelstark", "sous-chef, sehr intelligent und stark für Frau")
                };

        for (Person person: personen)
        {
            this.person.setText(this.person.getText()+person.zahl+", "+person.name+", "+person.eigenschaften+", "+person.staerke+"\n");
        }

        Waffe[] waffen = new Waffe[]{
                new Waffe("Gate of Babylon",0, 0, "Schatzkammer"),
                new Waffe("Browining M1918", 1, 6000, "Automatisches Maschinengewehr"),
                new Waffe("Lachs",2, 2000, "Fisch"),
                new Waffe("Baseball Schläger", 3, 1000,  "Holz Schläger"),
                new Waffe("Bratpfanne", 4, 1500,  "Pfanne"),
                new Waffe("Besenstiel",5, 500, "Holzstiel"),
                new Waffe("Shuriken",6, 10, "Metallstern")
        };

        for (Waffe waffe : waffen)
            {
                this.waffe.setText(this.waffe.getText()+waffe.zahl+", "+waffe.name+", "+waffe.typ+", "+waffe.gewicht+"\n");
            }

        Ort[] orte = new Ort[]
                {
                        new Ort("Babylonien", 0, "Antikes Königreich in Mesopotamien"),
                        new Ort("Küche", 1,  "Arbeitsort von Chantal und Janine, voll mit Pfannen, Messern und Lebensmitteln"),
                        new Ort("Abstellkammer", 2,  "Nur die Hausmeister haben einen Schlüssel zur Abstellkammer da diese auch gleichzeitig ihr Schlafzimmer ist, alle Putzmittel werden dort gelagert"),
                        new Ort ("Schlafzimmer", 3,  "Neca's und Michaels Schlafzimmer, Michael lagert immer noch sein geladenes Gewehr aus dem 2, Weltkrieg dort und Neca den Baseballschläger mit dem er die World Series gewann")
                };

        for (Ort ort : orte)
        {
            this.ort.setText(this.ort.getText()+ort.zahl+", "+ort.name+", "+ort.beschreibung+"\n");
        }

        gameLogik =  new GameLogik();
        gameLogik.initialisieren(personen,waffen,orte);

    }
    @FXML
    public void run() throws IOException{
        try {
            String taeter1 = taeter.getText();
            String tatwaffe1 = tatwaffe.getText();
            String tatort1 = tatort.getText();
            int tae = Integer.parseInt(taeter1);
            int tatw = Integer.parseInt(tatwaffe1);
            int tato = Integer.parseInt(tatort1);

            if(tae>5)
            {
                throw new IllegalArgumentException("Taeter darf nur 5 oder kleiner sein.");
            }else
            {
                if(tatw>6)
                {
                    throw new IllegalArgumentException("Tatwaffe darf nur 6 oder kleiner sein.");
                }else
                {
                    if (tato>3)
                    {
                        throw new IllegalArgumentException("Tatort darf nur 3 oder kleiner sein.");
                    }
                }
            }
            String antwort = gameLogik.checkResults(tae,tatw,tato);
            String vorherigeAntwort = answer.getText();
            answer.setText(vorherigeAntwort + antwort +"\n");
        }catch (Exception e)
        {
            String error = "Bitte valide Eingabe!";
            answer.setText(error + "\n" +e.getMessage());
            System.out.println(error);
        }
        // = answer.setText(answer.getText()+gameLogik.checkResults(tae,tatw,tato));


    }

}
