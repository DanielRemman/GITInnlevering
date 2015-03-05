
import java.util.Scanner;

public class SnuTekst {

	static int teller;
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Skriv inn en streng: ");
		String temp = input.nextLine();
		System.out.println(temp);
		baklengs(temp);
	}

	public static void baklengs(String tekst) {
		int tekstLengde = tekst.length() - 1;
		if (tekstLengde >= 0) {
			System.out.print(tekst.charAt(tekstLengde));
			teller++;
			baklengs(tekst.substring(0, tekstLengde));
		} else
			System.out.printf("\nDet er totalt %d tegn i tekststrengen\n", teller);
	}
}
