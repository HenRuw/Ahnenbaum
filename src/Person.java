public class Person {
    String nachname;
    String vorname;
    char geschlecht;
    public Person(String nachname, String vorname, char geschlecht) {
        this.nachname = nachname;
        this.vorname = vorname;
        this.geschlecht = geschlecht;
    }
    public String getNachname() {
        return nachname;
    }

    public String getVorname() {
        return vorname;
    }

    public char getGeschlecht() {
        return geschlecht;
    }


}
