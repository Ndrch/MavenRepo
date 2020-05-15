package package4;

public class FirstOOPClass {

	public static void main(String[] args) {
		Box myBox = new Box();
		myBox.width = 2;
		myBox.height = 3;
		myBox.length = 4;
		
		double objem = myBox.returnObjem();
		System.out.println(objem);
		
		Box myBox2 = new Box();
		myBox2.height = 1;
		myBox2.width = 2;
		myBox2.length = 3;
		System.out.println(myBox2.returnObjem());

	}

}
