package at.campus02.musikanten;

public abstract class Musikant {
    protected int anzahlBeine;
    protected Instrument instrument;

    public Musikant(int anzahlBeine, Instrument instrument) {
        this.anzahlBeine = anzahlBeine;
        this.instrument = instrument;
    }

    public int getAnzahlBeine() {
        return anzahlBeine;
    }

    public Instrument getInstrument() {
        return instrument;
    }

    public abstract int verscheueRaeuber();

    public abstract double spieleMusik();




    @Override
    public String toString() {

        return "Musikant{" +
                "anzahlBeine=" + anzahlBeine +
                ", instrument=" + instrument +
                ", Verscheucht= " +verscheueRaeuber() +
                ", Musiziert= " + spieleMusik() +
                '}';
    }
}
