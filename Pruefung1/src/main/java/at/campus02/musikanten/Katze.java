package at.campus02.musikanten;

public class Katze extends Musikant {
	protected double kratzKraft;
	
	public Katze(int aB, Instrument i , double kratzKraft) {
		super(4,new Instrument("nemtudom",5));

	}


	@Override
	public double spieleMusik() {
		return instrument.getLautstaerke();
	}
	@Override
	public int verscheueRaeuber() {
		if(anzahlBeine >= 4)
		{
			return (int)kratzKraft;
		}
		if(anzahlBeine == 3)
		{
			return (int)(kratzKraft/2);
		}
		return 1;
	}
	@Override
	public String toString() {
		return "Katze " + kratzKraft + ":" + super.toString();
	}


}




