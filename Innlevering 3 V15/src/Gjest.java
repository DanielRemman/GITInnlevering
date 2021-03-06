/*
 * Kort, Oppgave 1 & 2 Innlevering 3
 * Gjest
 * 
 * Daniel Remman, 540388
 */

import java.util.GregorianCalendar;

public class Gjest extends Kort {

	private GregorianCalendar utl�psdato;
	
	public Gjest(String fornavn,String etternavn) {
		super(fornavn,etternavn,9999);
		GregorianCalendar time = new GregorianCalendar();
		time.add(GregorianCalendar.DAY_OF_MONTH, 7);
		utl�psdato = time;
	}

	@Override
	public boolean sjekkPIN(int pin) {
		GregorianCalendar time = new GregorianCalendar();
		
		if(time.compareTo(utl�psdato) > 0)
			super.setSperretKort(true);
		
		if (!isSperret()&& pin == 9999)
			return true;
		else
			return false;
	}
	
	@Override
	public Object clone(){
		Gjest clone = (Gjest) super.clone();
		clone.utl�psdato = (GregorianCalendar) this.utl�psdato.clone();
		
		return clone;
	}
}
