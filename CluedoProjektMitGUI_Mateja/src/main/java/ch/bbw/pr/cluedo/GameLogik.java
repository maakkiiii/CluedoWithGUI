package ch.bbw.pr.cluedo;

import java.util.Random;
import java.util.Scanner;

public class GameLogik
{
    int taeter;
    int tatwaffe;
    int tatort;
    int versuche;
    public void initialisieren(Person[] personen, Waffe[] waffen, Ort[] orte)
    {
        Random random = new Random();
        taeter = random.nextInt(personen.length);
        tatwaffe = random.nextInt(waffen.length);
        tatort = random.nextInt(orte.length);
        versuche = 0;
    }
    //============================================================================================================

    public String checkResults(int taeter, int tatwaffe, int tatort)
    {
        String returnString = "";
        int richtig = 0;
        versuche++;

            if (this.taeter == taeter)
            {
                System.out.println("noice");
                richtig++;
            }
            if (this.tatwaffe == tatwaffe)
            {
                richtig++;
            }
            if (this.tatort == tatort)
            {
                richtig++;
            }
            if (richtig == 3)
            {
                System.out.println("Ich gratuliere, sie haben gewonnen.");
                System.out.println(taeter + ", " + tatwaffe + ", " + tatort);
                returnString = "Ich gratuliere, sie haben gewonnen.";
            }else
            {
                System.out.println("Anzahl richtige Antworten: "+ richtig);
                System.out.println("Komm noch ein Versuch");
                System.out.println();
                returnString = "Anzahl richtige Antworten: "+ richtig+"\n"+"Komm noch ein Versuch";
            }

        if ( versuche ==5)
        {
            returnString="Zu viele Versuche, schlecht";
        }
        else if(versuche>=6)
        {
            System.out.println("");
            returnString="";
        }

        return returnString;
    }

    //============================================================================================================
    public void spielen(Person[] personen, Waffe[] waffen, Ort[] orte)
    {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int taeter = random.nextInt(personen.length);
        int tatwaffe = random.nextInt(waffen.length);
        int tatort = random.nextInt(orte.length);
        int name;
        int waffe;
        int ort;
        boolean ende = false;
        int anzahlDurchläufe = 0;
        int falsche = 0;

        while (ende == false)
        {
            System.out.println("Bitte Täternummer eingeben: ");
            String scannerInputName = scanner.nextLine();
            name = Integer.parseInt(scannerInputName);
            System.out.println("Bitte Tatwaffennummer eingeben: ");
            String scannerInputWaffe = scanner.nextLine();
            waffe = Integer.parseInt(scannerInputWaffe);
            System.out.println("Bitte Tatortnummer eingeben: ");
            String scannerInputOrte = scanner.nextLine();
            ort = Integer.parseInt(scannerInputOrte);
            int richtig = 0;

            if (taeter == name)
            {
                System.out.println("noice");
                richtig++;
            }
            if (tatwaffe == waffe)
            {
                richtig++;
            }
            if (tatort == ort)
            {
                richtig++;
            }
            if (richtig == 3)
            {
                System.out.println("Ich gratuliere, sie haben gewonnen.");
                System.out.println(taeter + ", " + tatwaffe + ", " + tatort);
                ende = true;
            }else
            {

                System.out.println("Anzahl richtige Antworten: "+ richtig);
                System.out.println("Komm noch ein Versuch");
                System.out.println();
                falsche++;
            }
            if (falsche >= 5)
            {
                System.out.println("Tut mir leid, zu viele Versuche");
                ende = true;
            }

        }
    }
}
