package package3;

import java.io.EOFException;
import java.util.Scanner;

public class ExceptionAnketa {
	public static String IMJA;
	public static double RIST;
	public static short VIK;
	

	public static void main(String[] args) {
		Scanner skan = new Scanner(System.in);
		boolean EPOMYLKA1 = false;
		boolean EPOMYLKA2 = false;
		boolean EPOMYLKA3 = false;
		do {
			try {

				System.out.println("Vvedit svoje imja: ");
				IMJA = skan.nextLine();
				EPOMYLKA1 = true;
			} catch (Exception pomylka) {
				System.out.println("Vvedit svoje imja virno!" + "\t" + pomylka.getMessage());
			}
		} while (!EPOMYLKA1);
		
		do {
			try {

				System.out.println("Vvedit svij rist: ");
				String line = skan.nextLine();
				RIST = Double.parseDouble(line);				
				EPOMYLKA2 = true;
			} catch (Exception pomylka) {
				System.out.println("Vvedit svij rist virno - chyslom!" + "\t" + pomylka.getMessage());
			}
		} while (!EPOMYLKA2);
		
		do {
			try {

				System.out.println("Vvedit svij vik: ");
				String line2 = skan.nextLine();
				VIK = Short.parseShort(line2);
				EPOMYLKA3 = true;
				

			} catch (Exception pomylka) {
				System.out.println("Vvedit svij vik virno - chyslom!" + "\t" + pomylka.getMessage());
			}
		} while (!EPOMYLKA3);

		System.out.println("Imja" + "\t" + "Rist" + "\t" + "Vik");
		System.out.println(IMJA + "\t" + RIST + "\t" + VIK);
		skan.close();

	}

}
