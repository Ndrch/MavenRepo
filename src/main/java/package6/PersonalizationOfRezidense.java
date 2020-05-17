package package6;

import java.io.ObjectInputStream.GetField;
import java.util.Scanner;

public class PersonalizationOfRezidense {

	public static void main(String[] args) {

		PersonalizationOfRezidense xxx = new PersonalizationOfRezidense();

		Persona person = xxx.creatPerson();
		//System.out.println(person);
		Scanner skan = new Scanner(System.in);
		System.out.println(person.getFirstName() + " what city are you from?");
		String city = skan.nextLine();
		person.setCity(city);
		

	}

	public Persona creatPerson() {
		Scanner skan = new Scanner(System.in);
		System.out.println("Enter personal data: ");
		System.out.println("lastname / -");
		String lastName = skan.nextLine();
		System.out.println("firstname / -");
		String firstName = skan.nextLine();
		System.out.println("surname / -");
		String surname = skan.nextLine();
		System.out.println("how old are you - number in integers / 0");
		int age = skan.nextInt();
		
		if (lastName.equals("-") && firstName.equals("-") && surname.equals("-") && String.valueOf(age).equals("0"))
		{
			return new Persona();
		} else {
			if (surname.equals("-"))
			{
				return new Persona(lastName, firstName, age);
			} else {
				if (String.valueOf(age).equals("-"))
				{
					return new Persona(lastName, firstName, surname);
				} else {
					return new Persona(lastName, firstName, surname, age);
				}
			}
		
		}
		
	}

}
