package package6;

public class Persona {
	private String lastName;
	private String firstName;
	private String surname;
	private int age;
	private String city;
	private InfoAboutAccommodation registration;
	
	Persona()
	{
		this.lastName = "-unknown-";
		this.firstName = "-unknown-";
		this.surname = "-unknown-";
		this.age = 0;		
	}
		
	Persona(String lastName, String firstName, int age)
	{
		this.lastName = lastName;
		this.firstName = firstName;
		this.age = age;				
	}
	Persona(String lastName, String firstName, String surname)
	{
		this.lastName = lastName;
		this.firstName = firstName;
		this.surname = surname;
	}
	Persona(String lastName, String firstName, String surname, int age)
	{
		this.lastName = lastName;
		this.firstName = firstName;
		this.surname = surname;
		this.age = age;
	}
	public String  toString()
	{
		return lastName + " " + firstName + " " +  surname + " " + age;
	}
	String getLastName() {
		return lastName;
	}
	void setLastName(String lastName) {
		this.lastName = lastName;
	}
	String getFirstName() {
		return firstName;
	}
	void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	String getSurname() {
		return surname;
	}
	void setSurname(String surname) {
		this.surname = surname;
	}
	int getAge() {
		return age;
	}
	void setAge(int age) {
		if (age < 18 || age > 100)
		{
			System.out.println("Unfortunately you do not fall under the sample!");
		} else {
		this.age = age;
		}
	}

	InfoAboutAccommodation getRegistration() {
		return registration;
	}

	void setRegistration(InfoAboutAccommodation registration) {
		this.registration = registration;
	}

	String getCity() {
		return city;
	}

	void setCity(String city) {
		if (city.toLowerCase().equals("lviv"))
		{
		this.city = city;
		} else {
			System.out.println("Unfortunately you do not fall under the sample!");
		}
	}
	
	
	
	

}
