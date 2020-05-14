package package3;

public class VariableParamMethod {

	public static void main(String[] args) {
		System.out.println(znajtySerednje(1,2,3,4,5));
		System.out.println(znajtySerednje(15,34,46,75,89,1,45,23,11));

	}
	public static double znajtySerednje(int...chysla)
	{
		int suma = 0;
		for (int i: chysla)
			suma += i;
		return (double)suma / (double)chysla.length;
	}

}
