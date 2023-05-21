package at.campus02.musikanten;

public class Hund extends Musikant{
	protected double bellLautstaerke;
	public Hund(int aB, Instrument i , double bellLautstaerke) {
		super(4, new Instrument("lklk",10));

	}

	@Override
	public int verscheueRaeuber() {
		return 0;
	}

	@Override
	public double spieleMusik() {
		return 0;
	}

	@Override
	public String toString() {
		return "Hund:" +
				"bellLautstaerke=" + bellLautstaerke +
				", anzahlBeine=" + anzahlBeine +
				", instrument=" + instrument ;
	}
}
