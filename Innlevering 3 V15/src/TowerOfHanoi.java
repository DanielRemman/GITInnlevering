import java.util.Scanner;

public class TowerOfHanoi {

	private static Scanner input = new Scanner(System.in);
	private static long antallTrekk;

	public static void main(String[] args) {
		System.out.print("Skriv inn antall skiver: ");
		int n = input.nextInt();
		System.out.println("\nTrekkene er: ");
		flyttBrikke(n, 'A', 'B', 'C');
		System.out.println("Antall trekk: " + antallTrekk);
	}

	private static void flyttBrikke(int n, char fraTårn, char tilTårn, char temp) {
		if (n == 1){
			System.out.printf("Flytt brikke %2d fra %c til %c\n", n, fraTårn,
					tilTårn);
			antallTrekk++;
		}
		else {
			flyttBrikke(n - 1, fraTårn, temp, tilTårn);
			System.out.printf("Flytt brikke %2d fra %c til %c\n", n, fraTårn,
					tilTårn);
			flyttBrikke(n - 1, temp, tilTårn, fraTårn);
			antallTrekk++;
		}

	}

}
