package at.campus02.musikanten;

public class Hahn extends Musikant {
	protected int flugWeite;
	public Hahn(int aB, Instrument i , int flugWeite) {
		super(2,new Instrument("Trompete",5));

	}

	@Override
	public int verscheueRaeuber() {
		int rauber=0;
		if(flugWeite<2){
			rauber= Integer.parseInt((String)"Viel");
		}
		else if(flugWeite==2){
			rauber=6;
		} else if (flugWeite==3) {
			rauber=5;
		}else if (flugWeite==4) {
			rauber=4;
		}else if (flugWeite==5) {
			rauber=3;
		}else if (flugWeite==6) {
			rauber=2;
		}

		return rauber;
	}
}
