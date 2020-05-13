package package2;

import java.util.Random;
import java.util.Scanner;

public class Lotto {

	public static void main(String[] args) {

		// krok 1 - otrymaty vvedennja vid korystuvacha
		String[] chyslaVidKorystuvacha = otrymatyVvedennjaVidKorustuvacha();

		int iKilkistSpivpadin = 0;
		int iKilkistRozigrashi = 0;

		while (iKilkistSpivpadin != 6) {
			iKilkistRozigrashi++;

			// krok 2 - provesty rozigrach (6 vypadkovyh chysel)
			int[] tsejRozigrach = provestyRozigrach();

			// krok 3 - pereviryty chysla vid korystuvacha na spivpadinnja
			iKilkistSpivpadin = perevirytyRezultat(chyslaVidKorystuvacha, tsejRozigrach);

			if (iKilkistSpivpadin > 4) {
				// krok 4 - vyvesty rezultat
				String vsiChyslaRozigrachu = konvertuvatyMasyvVTekst(tsejRozigrach);
				System.out.println("U " + iKilkistRozigrashi + " rozigrachi spivpalo (" + vsiChyslaRozigrachu + "): "
						+ iKilkistSpivpadin);

			}
		}
	}

	public static String[] otrymatyVvedennjaVidKorustuvacha() {

		Scanner scan = new Scanner(System.in);

		System.out.println("Vvedit 6 chysel cherez komu (vid 1 do 54): ");
		String chysla = scan.nextLine();
		scan.close();
		// (String) "1,24,17,45,11,7" -> split(",") -> String[] a =
		// {"1","24","17","45","11","7"};
		String[] strMasyvVvedenyhChysel = chysla.split(",");
		return strMasyvVvedenyhChysel;
	}

	public static int[] provestyRozigrach() {
		int[] tsejRozigrach = new int[6];
		Random r = new Random();
		int iChysloRozigrashu = 0;

		while (iChysloRozigrashu != 6) {
			boolean chysloVgeIsnuja = false;
			int tseChyslo = r.nextInt(54) + 1;
			for (int isnujuchechyslo : tsejRozigrach) {
				if (isnujuchechyslo == tseChyslo) {
					chysloVgeIsnuja = true;
					break;
				}
			}
			if (chysloVgeIsnuja != true) {
				tsejRozigrach[iChysloRozigrashu++] = tseChyslo;
			}
		}
		return tsejRozigrach;
	}

	public static int perevirytyRezultat(String[] strMasyvVvedenyhChysel, int[] tsejRozigrach) {
		int iKilkistSpivpadin = 0;
		for (int k = 0; k < strMasyvVvedenyhChysel.length; k++) {
			int chyslo = Integer.parseInt(strMasyvVvedenyhChysel[k]);
			for (int tseVygrashneChyslo : tsejRozigrach) {
				if (chyslo == tseVygrashneChyslo) {
					iKilkistSpivpadin++;
				}
			}
		}
		return iKilkistSpivpadin;
	}

	public static String konvertuvatyMasyvVTekst(int[] chysla) {
		String vsiChyslaRozigrachu = "";
		for (int Chyslo : chysla) {
			vsiChyslaRozigrachu = vsiChyslaRozigrachu + Chyslo + " ";
		}
		return vsiChyslaRozigrachu;
	}

}
