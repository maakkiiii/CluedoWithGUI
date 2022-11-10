package ch.bbw.pr.cluedo;

public class Ort
{
    String name;
    int zahl;
    String beschreibung;


    public Ort(String name, int zahl, String beschreibung) {
        this.name = name;
        this.beschreibung = beschreibung;
        this.zahl = zahl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBeschreibung() {
        return beschreibung;
    }

    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    public int getZahl() {
        return zahl;
    }

    public void setZahl(int zahl) {
        this.zahl = zahl;
    }
}
