package at.campus02.musikanten;

public class Esel extends Musikant{
	protected double trittkraft;
	public Esel(int aB, Instrument i, double trittkraft) 
	{
		super(4,new Instrument("kkk",7));

	}

	@Override
	public int verscheueRaeuber() {
		return (int) (trittkraft*anzahlBeine);
	}

	@Override
	public double spieleMusik() {
		return 0;
	}

	@Override
	public String toString() {
		return "Esel:" +
				"trittkraft=" + trittkraft +
				", anzahlBeine=" + anzahlBeine +
				", instrument=" + instrument ;
	}
}
