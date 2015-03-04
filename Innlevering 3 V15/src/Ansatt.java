/*
 * Kort, Oppgave 1 Innlevering 3
 * Ansatt
 * 
 * Daniel Remman, 540388
 */

import java.util.GregorianCalendar;

public class Ansatt extends Kort {

	public Ansatt(String fornavn, String etternavn, int pinKode) {
		super(fornavn, etternavn, pinKode);
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

}
