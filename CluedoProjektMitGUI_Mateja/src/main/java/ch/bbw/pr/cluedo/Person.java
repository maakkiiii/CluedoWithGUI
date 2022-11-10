package ch.bbw.pr.cluedo;

public class Person
{
    String name;
    int zahl;
    String staerke;
    String eigenschaften;

    public Person(String name, int zahl, String staerke, String eigenschaften) {
        this.name = name;
        this.zahl = zahl;
        this.staerke = staerke;
        this.eigenschaften = eigenschaften;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAlter() {
        return zahl;
    }

    public void setAlter(int alter) {
        this.zahl = alter;
    }

    public String getStaerke() {
        return staerke;
    }

    public void setStaerke(String staerke) {
        this.staerke = staerke;
    }

    public String getEigenschaften() {
        return eigenschaften;
    }

    public void setEigenschaften(String eigenschaften) {
        this.eigenschaften = eigenschaften;
    }
}
