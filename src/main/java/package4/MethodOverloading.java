package package4;

public class MethodOverloading {

	public static void main(String[] args) {
		System.out.println(dodatyChysla(1, 3));
		System.out.println(dodatyChysla(1, 3, 5));
		System.out.println(dodatyChysla("sobaka", "-barabaka"));
		
	}
	public static int dodatyChysla(int a, int b) { return a + b; }
	public static int dodatyChysla(int a, int b, int c) { return a + b + c; }
	public static double dodatyChysla(double a, double b) { return a + b; }
	public static String dodatyChysla(String a, String b) { return a + b; }
	public static void dodatyChysla() {}
	public static int dodatyChysla(int[] iArray) {
		int sum = 0; for (int i: iArray) {sum += i; } return sum;
	}

}
