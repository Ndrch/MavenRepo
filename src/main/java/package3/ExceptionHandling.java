package package3;

import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {
		boolean yePomylka = false;
		do {
			try {
				Scanner s = new Scanner(System.in);
				System.out.println("Vvedit chyselnyk: ");
				int c1 = s.nextInt();
				System.out.println("Vvedit znamennyk: ");
				int c2 = s.nextInt();

				System.out.println("Rezultat: " +(double) c1 / c2);
				s.close();
				yePomylka = true;
			} catch (Exception pomylka) {
				System.out.println("Takogo robyty ne mogna :( " + pomylka.getMessage());
			}
		} while (!yePomylka);

	}

}
