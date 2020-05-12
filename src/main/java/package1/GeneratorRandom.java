package package1;

import java.util.Random;
import java.util.Scanner;

public class GeneratorRandom {

	public static void main(String[] args) {
		Scanner skan = new Scanner(System.in);
		Random kubyk = new Random();
		int chysloZkubyka, variantKorystuvacha = 0, sproba = 0;
		do {
			System.out.print("Vvedit chyslo vid 1 do 6: ");
			variantKorystuvacha = skan.nextInt();
			chysloZkubyka = 1 + kubyk.nextInt(6);
			System.out.println("Na kubyku vypalo: " + chysloZkubyka + ".");
			System.out.println("-----------------------------------------");
			sproba++;
		}
		while (variantKorystuvacha != chysloZkubyka);
		System.out.println("Vy vgadaly z " + sproba + " sproby!");
		

	}

}
