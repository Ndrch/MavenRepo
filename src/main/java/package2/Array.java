package package2;

public class Array {

	public static void main(String[] args) {
		
		int[][] dvovymirnyj = {
				/*0*/ {1,25},
				/*1*/ {2, 67, 777, 81, 999},
				/*2*/ {5, 33, 2}
		};
		System.out.println(dvovymirnyj[1][2]);
		
		String[][] dvovemirnyjS= {
				{"futbol", "Afryka"},
				{"komputer", "mova", "snig", "stina"},
				{"java", "sonce", "redyska"}
				
		};
		for (int ryad = 0; ryad < dvovemirnyjS.length; ryad++)
		{
			for(int st = 0; st < dvovemirnyjS[ryad].length; st++) {
				System.out.println(dvovemirnyjS[ryad][st]);
			}
		}
		
	}
	
}
