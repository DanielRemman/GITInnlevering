import java.util.Scanner;

public class TowerOfHanoi {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Skriv inn antall skiver: ");
		int n = input.nextInt();
		System.out.println("\nTrekkene er: ");
		flyttBrikke(n, 'A', 'B', 'C');
	}

	private static void flyttBrikke(int n, char fraT�rn, char tilT�rn, char temp) {
		if (n == 1)
			System.out.printf("Flytt brikke %2d fra %c til %c\n", n, fraT�rn, tilT�rn);
		else{
			flyttBrikke(n-1, fraT�rn, temp, tilT�rn);
			System.out.printf("Flytt brikke %2d fra %c til %c\n", n, fraT�rn, tilT�rn);
			flyttBrikke(n-1, temp, tilT�rn, fraT�rn);
		}
			
		
	}

}
