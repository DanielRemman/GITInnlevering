/*
 * Kort, Oppgave 1 Innlevering 3
 * 
 * Daniel Remman, 540388
 */

public class Kort {

	String fornavn;
	String etternavn;
	int pinKode;
	static int kortnummer;
	static boolean aksess;
	static int antallKort;
	
	public Kort(String fornavn,String etternavn,int pinKode){
	this.fornavn = fornavn;
	this.etternavn = etternavn;
	this.pinKode = pinKode;
	aksess = false;
	if (antallKort == 0)
		antallKort = 1;
	kortnummer = antallKort;
	antallKort++;
	}
	
	public String getNavn(){
		return (fornavn + " " + etternavn);
	}
	
	public static boolean isSperret(){
		return (aksess == false ? false : true);
	}
	
	public boolean sjekkPIN(int pin){
		return (pinKode == pin ? true : false);
	}
	
	public String toString(){
		return (fornavn + " " + etternavn + " " + kortnummer + " " + (aksess == false ? "Gyldig" : "Ugyldig"));
	}
}