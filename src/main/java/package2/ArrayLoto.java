package package2;

public class ArrayLoto {

	public static void main(String[] args) {
		int[][] lotto = {
				{2, 53, 32, 17, 43, 5},
				{44, 12, 39, 1, 6, 50},
				{17, 9, 8, 44, 19, 21},
				{54, 3, 29, 20, 4, 11},
				{26, 54, 4, 37, 41, 8},
				{12, 8, 47, 5, 23, 27},
				{51, 30, 9, 20, 42, 15}
		};
		for (int i = 0; i < lotto.length; i++)
		{
			int sumachyselRozigrashu = 0;
		 
			for (int j: lotto[i])
			{
				sumachyselRozigrashu = sumachyselRozigrashu + j;
			}
			System.out.println("Suma chysel ¹" + i + ": " + sumachyselRozigrashu + ";");
			System.out.println("Seredne rozigrasu ¹" + i + ": " + sumachyselRozigrashu / lotto[i].length);
			
		}

	}

}
