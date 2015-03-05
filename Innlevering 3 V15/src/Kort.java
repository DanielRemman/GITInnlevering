/*
 * Kort, Oppgave 1 & 2 Innlevering 3
 * 
 * Daniel Remman, 540388
 */

public abstract class Kort implements Comparable<Kort>,Cloneable{

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
	
	public String getFornavn() {
		return fornavn;
	}

	public void setFornavn(String fornavn) {
		this.fornavn = fornavn;
	}

	public String getEtternavn() {
		return etternavn;
	}

	public void setEtternavn(String etternavn) {
		this.etternavn = etternavn;
	}

	public int getPinKode() {
		return pinKode;
	}

	public void setPinKode(int pinKode) {
		this.pinKode = pinKode;
	}

	public int getKortnummer() {
		return kortnummer;
	}

	public void setKortnummer(int kortnummer) {
		this.kortnummer = kortnummer;
	}

	public static int getAntallKort() {
		return antallKort;
	}

	public static void setAntallKort(int antallKort) {
		Kort.antallKort = antallKort;
	}

	public boolean isSperretKort() {
		return sperretKort;
	}

	@Override
	public int compareTo(Kort k) {
		if (k == null)
			return -1;
		else if (this.getEtternavn().compareTo(k.getEtternavn()) < 0)
			return -1;
		else if (this.getEtternavn().compareTo(k.getEtternavn()) > 0)
			return 1;
		else if (this.getFornavn().compareTo(k.getFornavn()) < 0)
			return -1;
		else if (this.getFornavn().compareTo(k.getFornavn()) > 0)
			return 1;
		else
			return 0;
	}
	
	public Object clone() {
		try {
			Kort clone = (Kort) super.clone();
			clone.setFornavn(new String(this.getFornavn()));
			clone.setEtternavn(new String(this.getEtternavn()));
			return clone;
		} catch (Exception e) {
			return null;
		}
	}
}