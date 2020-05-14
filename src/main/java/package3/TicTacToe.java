package package3;

import java.util.Scanner;

public class TicTacToe {
	// fiksovani zminni, jaki vkazujut na vmist komirky
	public static final String POROZHNJA = "   ", KHRESTYK = " x ", NULYK = " O ";
	public static String aktyvnyjGravec;
	// zminni dlja zberigannja info pro igrove pole i stan gry
	public static final int RYADKIV = 3, STOVPCHYKIV = 3;
	public static String[][] sitka = new String[RYADKIV][STOVPCHYKIV];
	public static int statusGry;
	public static final int STATUS_GRA_TRYVAJE = 0, STATUS_NICHYJA = 1, STATUS_PEREMOGA_X = 3, STATUS_PEREMOGA_O = 4;
	public static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		pochatyGru();
		do {
			otrymatyVvedenjaGravcja();
			proanalizuvatySitky();
			vyvestySitku();
			if (statusGry == STATUS_PEREMOGA_X) {
				System.out.println("'X' peremig! Vitajemo!");
			} else if (statusGry == STATUS_PEREMOGA_O) {
				System.out.println("'O' peremig! Vitajemo!");
			} else if (statusGry == STATUS_NICHYJA) {
				System.out.println("Gra zakinchylas v nichyu! Do pobachennja!");
			}
			
			aktyvnyjGravec = (aktyvnyjGravec == KHRESTYK?NULYK:KHRESTYK);
		}

		while (statusGry == STATUS_GRA_TRYVAJE);

	}

	/**
	 * metod zopovnjaje sitku porognimy klitynkamu, vkazuje hto bude aktyvnyj gravec
	 */
	public static void pochatyGru() {
		for (int ryad = 0; ryad < RYADKIV; ryad++) {
			for (int stovp = 0; stovp < STOVPCHYKIV; stovp++) {
				sitka[ryad][stovp] = POROZHNJA;
			}
		}
		aktyvnyjGravec = KHRESTYK;
		vyvestySitku();

	}

	public static void otrymatyVvedenjaGravcja() {

		boolean vvedenjaDijsne = false;
		do {
			System.out.println("Gravec '" + aktyvnyjGravec + "' , vvedit rjadok (1-3) ta stovpec (1-3) tcherez probil");
			int ryad = in.nextInt() - 1;
			int stovp = in.nextInt() - 1;
			if (ryad >= 0 && ryad < RYADKIV && stovp >= 0 && stovp < STOVPCHYKIV && sitka[ryad][stovp] == POROZHNJA) {
				sitka[ryad][stovp] = aktyvnyjGravec;
				vvedenjaDijsne = true;
			} else {
				System.out.println("Vybrane rozmichennja (" + (ryad + 1) + "," + (stovp + 1)
						+ ") ne moge buty vykonane. Sprobujte che raz...");
			}
		} while (!vvedenjaDijsne);

	}

	public static void proanalizuvatySitky() {
		String peremozhets = znajtyPeremogcja();
		if (peremozhets.equals(KHRESTYK)) {
			statusGry = STATUS_PEREMOGA_X;
		} else if (peremozhets.equals(NULYK)) {
			statusGry = STATUS_PEREMOGA_O;
		} else if (chyVsiClitynkyZapovnenu()) {
			statusGry = STATUS_NICHYJA;
		} else {
			statusGry = STATUS_GRA_TRYVAJE;
		}

}

	public static boolean chyVsiClitynkyZapovnenu() {
		for (int ryad = 0; ryad < RYADKIV; ryad++) {
			for (int stovp = 0; stovp < STOVPCHYKIV; stovp++) {
				if (sitka[ryad][stovp] == POROZHNJA) {
					return false;
				}
			}
		}
		return true;

	}

	public static String znajtyPeremogcja() {

		int iKilkistOdnakovyh;
		for (int ryad = 0; ryad < RYADKIV; ryad++) {
			iKilkistOdnakovyh = 0;
			for (int stovp = 0; stovp < STOVPCHYKIV; stovp++) {
				if (sitka[ryad][0] != POROZHNJA && sitka[ryad][0] == sitka[ryad][stovp]) {
					iKilkistOdnakovyh++;
				}
			}
			if (iKilkistOdnakovyh == 3) {
				return sitka[ryad][0];
			}
		}

		for (int stovp = 0; stovp < STOVPCHYKIV; stovp++) {
			iKilkistOdnakovyh = 0;
			for (int ryad = 0; ryad < RYADKIV; ryad++) {
				if (sitka[0][stovp] != POROZHNJA && sitka[0][stovp] == sitka[ryad][stovp]) {
					iKilkistOdnakovyh++;
				}
			}
			if (iKilkistOdnakovyh == 3) {
				return sitka[0][stovp];
			}
		}
		if (sitka[0][0] != POROZHNJA && sitka[0][0] == sitka[1][1] && sitka[0][0] == sitka[2][2]) {
			return sitka[0][0];
		}
		if (sitka[0][2] != POROZHNJA && sitka[1][1] == sitka[0][2] && sitka[2][0] == sitka[0][2]) {
			return sitka[0][2];
		}
		return POROZHNJA;
	}

	public static void vyvestySitku() {
		for (int ryad = 0; ryad < RYADKIV; ryad++) {
			for (int stovp = 0; stovp < STOVPCHYKIV; stovp++) {
				System.out.print(sitka[ryad][stovp]);
				if (stovp != STOVPCHYKIV - 1) {
					System.out.print("|");
				}
			}
			System.out.println();
			if (ryad != RYADKIV - 1) {
				System.out.println("-----------");
			}
		}
		System.out.println();

	}

}
