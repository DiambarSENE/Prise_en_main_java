package sn.dev;

public enum Day {
	MATIN(8,"heure pour se lever"),
	MIDI(12, " lheure du repas"),
	APRESMIDI(15 ,"il est 15h"),
	SOIR(22,"heure de se coucher");
	
	public int hour;
	public String message;

	Day(int hour, String message) {
		this.hour = hour;
		this.message = message;
	}
	
	
}
