
// balans = vklad * (1 + vidsotok)^kRokiv

public class Depozit {

	public static void main(String[] args) {
		double vklad = 1000, vidsotok = 0.2, balans = 0;
		int rikVkladu = 2020;
		for (int rik = rikVkladu; rik <= (rikVkladu + 10); rik++) 
		{
			balans = vklad * Math.pow(1 + vidsotok, (rik - rikVkladu + 1));
			System.out.println("Balans na kinec " + rik + " roku: " + balans);
		}
		
		

	}

}
