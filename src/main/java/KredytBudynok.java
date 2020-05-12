import java.util.Scanner;
// cost - vartist
// advance - avans
// term - termin

public class KredytBudynok {

	public static void main(String[] args) {

		Scanner skan = new Scanner(System.in);

		double cost = 0, advance = 0, vidsotok = 0, platig, tilokr;
		int term = 0, vydkredytu = 0;

		System.out.println("Vvedit pochatkovu vartist objecta: ");
		cost = skan.nextDouble();

		System.out.println("Vvedit sumu pershogo vnesku: ");
		advance = skan.nextDouble();
		tilokr = cost - advance;

		System.out.println("Vvedit termin kredytuvannja: 12/24/36/48/+");
		term = skan.nextInt();

		System.out.println("Oberit sposib pogashennja kredytu: ");
		System.out.println(" 1 - suma chomisjachnyh plategiv odnakova (anujitet);");
		System.out.println(" 2 - pogachennja tila kredytu rivnymy chastynsmu, suma chomisjachnyh plategiv zmenshuetsja;");
		vydkredytu = skan.nextInt();

		if (vydkredytu == 1) {
			povidomlennja1(term, vidsotok, tilokr);
		} else {
			/////////
		}

	}

	/**
	 * metod povertae vidsotkovu stavky, v zalegnosti vid obranoho terminu kredytu
	 * 
	 * @param term - termin kreduty
	 * @return vidsotok - vidsotkova stavka
	 */
	public static double choosingALendingProgram(int term) {
		double vidsotok;
		if (term <= 12) {
			vidsotok = 25;
		} else {
			if (term <= 24) {
				vidsotok = 27;
			} else {
				if (term <= 36) {
					vidsotok = 30;
				} else {
					if (term <= 48) {
						vidsotok = 32;
					} else {
						vidsotok = 34;
					}
				}
			}
		}
		return vidsotok;
	}

	/**
	 * metod povertae znachennja chomisjachnoho plategu dlja 1 typu kredutu
	 * 
	 * @param term     - termin kredytu
	 * @param vidsotok - vidsotkova stavka
	 * @param tilokr   - tilo kredytu
	 * @return platig1 - chomisjachnyj platig dla 1 typu kredytu
	 */
	public static double calculationOfMonthlyPayment1(int term, double vidsotok, double tilokr) {
		double K;
		double vids = vidsotok / 100;
		K = ((vids / 12) * Math.pow(1 + (vids / 12), term)) / (Math.pow(1 + (vids / 12), term) - 1);
		double platig1 = K * tilokr;

		return platig1;
	}

	/**
	 * metod povertae zagalnu sumu vidsotkiv za ves period
	 * 
	 * @param term   - termin kredytu
	 * @param platig - chomisjachnyj platig
	 * @param tilokr - tilo kredytu
	 * @return vidsotky - zagalna suma vidsotkiv za ves period
	 */
	public static double interestCalculation1(int term, double platig, double tilokr) {
		double vidsotky = platig * term - tilokr;
		return vidsotky;
	}

	/**
	 * metod vyvodyt povidomlennja po kredytu
	 * 
	 * @param term     - termin kredytu
	 * @param vidsotok - vidsotkova stavka
	 * @param tilokr   - tilo kredytu
	 */
	public static void povidomlennja1(int term, double vidsotok, double tilokr) {
		vidsotok = choosingALendingProgram(term);
		double platig = calculationOfMonthlyPayment1(term, vidsotok, tilokr);
		System.out.println("Za obranoy vamy programoju kredytuvannj - (" + choosingALendingProgram(term)
				+ "% richnyh na " + term + " misjaci)");
		System.out.println("chomicjachnyj platig skladatyme: "
				+ Math.round(calculationOfMonthlyPayment1(term, vidsotok, tilokr)) + " v micjac, ");
		System.out.print("protjahom " + term + " misjaciv. ");
		System.out.println("Zahalna suma vidsotkiv sklade: " + Math.round(interestCalculation1(term, platig, tilokr)));
	}
}
