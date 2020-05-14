package package3;

import java.util.Arrays;

public class ArraySirt {

	public static void main(String[] args) {
		int[] array = {3, 1, 9, 5, 4};
		bobbleSort(array);
		

	}

	public static void sortAndPrint(int[] m) {
		Arrays.sort(m);
		System.out.println(Arrays.toString(m)); // vyvedenja vidsortovanogo masyvu
		for (int i = m.length - 1; i >= 0; i--) // masyv zzadu na pered
			System.out.print(m[i] + " ");
		System.out.println("");
	}

	public static void bobbleSort(int[] m) 
	{
		int povtor = 0;
		boolean vidbZamina = true;

		while (vidbZamina) {
			vidbZamina = false;
			for (int i = 0; i < m.length - 1 - povtor; i++) // povtor daje garantiju ost znachenna = max
			{ 
				if (m[i] > m[i + 1]) 
				{
					int tmp = m[i];
					m[i] = m[i + 1];
					m[i + 1] = tmp;
					vidbZamina = true;
				}
			}

			povtor++;
		}
		for (int i: m)
			System.out.print(i + " ");
	}

}
