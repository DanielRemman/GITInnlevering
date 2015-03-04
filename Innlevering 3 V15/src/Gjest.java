/*
 * Kort, Oppgave 1 Innlevering 3
 * Gjest
 * 
 * Daniel Remman, 540388
 */

import java.util.GregorianCalendar;

public class Gjest extends Kort {

	private GregorianCalendar utløpsdato;
	
	public Gjest(String fornavn,String etternavn) {
		super(fornavn,etternavn,9999);
		GregorianCalendar time = new GregorianCalendar();
		time.add(GregorianCalendar.DAY_OF_MONTH, 7);
		utløpsdato = time;
	}

	@Override
	public boolean sjekkPIN(int pin) {
		GregorianCalendar time = new GregorianCalendar();
		
		if(time.compareTo(utløpsdato) > 0)
			super.setSperretKort(true);
		
		if (!isSperret()&& pin == 9999)
			return true;
		else
			return false;
	}
	
}
