package package3;

import java.util.Arrays;

public class ArraySirt {

	public static void main(String[] args) {
		int[] array = {3, 1, 9, 5, 4};
		SortAndPrint(array);

	}
	
	public static void SortAndPrint(int[] m)
	{
		Arrays.sort(m);
		System.out.println(Arrays.toString(m)); // vyvedenja vidsortovanogo masyvu
		for (int i = m.length - 1; i >= 0; i--) // masyv zzadu na pered
			System.out.print(m[i] + " ");
		System.out.println("");
	}

	
}
