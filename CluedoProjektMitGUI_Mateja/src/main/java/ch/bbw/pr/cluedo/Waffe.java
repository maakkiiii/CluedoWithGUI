package ch.bbw.pr.cluedo;

public class Waffe
{
    String name;
    int gewicht;
    String typ;
    int zahl;

    public Waffe(String name, int zahl, int gewicht, String typ) {
        this.name = name;
        this.gewicht = gewicht;
        this.typ = typ;
        this.zahl = zahl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGewicht() {
        return gewicht;
    }

    public void setGewicht(int gewicht) {
        this.gewicht = gewicht;
    }

    public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }

    public int getZahl() {
        return zahl;
    }

    public void setZahl(int zahl) {
        this.zahl = zahl;
    }
}
