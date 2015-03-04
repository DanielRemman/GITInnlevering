/*
 * Kort, Oppgave 1 Innlevering 3
 * 
 * Daniel Remman, 540388
 */

public abstract class Kort {

	private String fornavn, etternavn;
	private int pinKode, kortnummer;
	private boolean sperretKort;
	private static int antallKort;
	
	public Kort(String fornavn,String etternavn,int pinKode){
	this.fornavn = fornavn;
	this.etternavn = etternavn;
	this.pinKode = pinKode;
	sperretKort = false;
	kortnummer = ++antallKort;
	}
	
	public String getNavn(){
		return (fornavn + " " + etternavn);
	}
	
	public int getPin(){
		return pinKode;
	}
	
	public boolean isSperret(){
		return sperretKort;
	}
	
	public abstract boolean sjekkPIN(int pin);
	
	public String toString(){
		return (fornavn + " " + etternavn + " " + kortnummer + " " + pinKode + " " + (sperretKort == false ? "Gyldig" : "Ugyldig"));
	}

	public void setSperretKort(boolean b) {
		sperretKort = b;	
	}
}