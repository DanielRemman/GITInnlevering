/*
 * Kort, Oppgave 2 Innlevering 3
 * Fast
 * 
 * Daniel Remman, 540388
 */

public interface Fast {

	public final double FAKTOR = 1.5;
	
	public void settFornavn(String fornavn);
	public String hentForNavn();
	public void settEtternavn(String etternavn);
	public String hentEtterNavn();
	public void setFulltNavn(String navn);
	public String hentFulltNavn();
	public double beregnKreditt();
	public double beregnBonus();
}
