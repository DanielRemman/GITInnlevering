/*
 * Kort, Oppgave 1 Innlevering 3
 * Ansatt
 * 
 * Daniel Remman, 540388
 */

import java.util.GregorianCalendar;

public class Ansatt extends Kort implements Fast {

	private double timelønn;

	private int åretAnsatt;

	public Ansatt(String fornavn, String etternavn, int pinKode, int timelønn,
			GregorianCalendar åretAnsatt) {
		super(fornavn, etternavn, pinKode);
		this.timelønn = timelønn;
		this.åretAnsatt = åretAnsatt.get(GregorianCalendar.YEAR);
	}

	@Override
	public boolean sjekkPIN(int pin) {
		GregorianCalendar time = new GregorianCalendar();
		if (time.get(GregorianCalendar.HOUR_OF_DAY) > 7
				|| time.get(GregorianCalendar.HOUR_OF_DAY) < 17
				|| time.get(GregorianCalendar.DAY_OF_WEEK) != 1
				|| time.get(GregorianCalendar.DAY_OF_WEEK) != 7 && !isSperret())
			return true;
		else
			return false;
	}

	@Override
	public void settFornavn(String fornavn) {
		super.setFornavn(fornavn);
	}

	@Override
	public String hentForNavn() {
		return super.getFornavn();
	}

	@Override
	public void settEtternavn(String etternavn) {
		super.setEtternavn(etternavn);
	}

	@Override
	public String hentEtterNavn() {
		return super.getEtternavn();
	}

	@Override
	public void setFulltNavn(String navn) {
		String[] navnSplittet = navn.split("\\s");
		super.setFornavn(navnSplittet[0]);
		super.setEtternavn(navnSplittet[1]);
	}

	@Override
	public String hentFulltNavn() {
		return super.getNavn();
	}

	@Override
	public double beregnKreditt() {
		return FAKTOR * timelønn;
	}

	@Override
	public double beregnBonus() {
		GregorianCalendar time = new GregorianCalendar();
		
		int åretNå = time.get(GregorianCalendar.YEAR);
		
		return FAKTOR * (åretNå - åretAnsatt);
	}

}
