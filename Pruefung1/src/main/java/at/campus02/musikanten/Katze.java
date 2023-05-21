package at.campus02.musikanten;

public class Katze extends Musikant {
	protected double kratzKraft;
	
	public Katze(int aB, Instrument i , double kratzKraft) {
		super(4,new Instrument("nemtudom",5));

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
		return "Katze:" +
				"kratzKraft=" + kratzKraft +
				", anzahlBeine=" + anzahlBeine +
				", instrument=" + instrument ;
	}
}
