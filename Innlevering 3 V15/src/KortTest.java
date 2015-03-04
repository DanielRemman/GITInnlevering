/*
 * Kort, Oppgave 1 Innlevering 3
 * KortTest
 * 
 * Daniel Remman, 540388
 */

import java.util.ArrayList;
import java.util.GregorianCalendar;

public class KortTest {

    public static void main(String[] args) {
    	
        ArrayList<Kort> reg = new ArrayList<Kort>();
        
        Kort k1 = new Ansatt("Ole", "Olsen", 1234, 23948.896, new GregorianCalendar(2005, 1, 1));
        Kort k2 = new Gjest("Marit", "Olsen");
        
        reg.add(k1);
        reg.add(k2);

        for (int i=0; i<reg.size(); i++) {
            Kort kort = (Kort)reg.get(i);
            System.out.print(kort);
            System.out.println("\nTest av kort: med kode 1234 er" + (kort.sjekkPIN(1234) ?  " gyldig" :  " ugyldig" ) );
            System.out.println("\nTest av kort: med kode 9999 er" + (kort.sjekkPIN(9999) ?  " gyldig" :  " ugyldig" ) );
            
        }
        
        Ansatt a1 = (Ansatt)k1;
        System.out.println("Kreditt for " + k1.getNavn() + ": " + a1.beregnKreditt());
        System.out.println("Bonus for " + k1.getNavn() + ": " + a1.beregnBonus());
        
        Ansatt a2 = (Ansatt) a1.clone();
        System.out.println("Samme referanse? " + (a1 == a2));
        System.out.println("Er de like? " + (a1.compareTo(a2) == 0 ? "Ja": "Nei"));
        
        a2.setFulltNavn("Daniel Remman");
        System.out.println(a2);
    }
}