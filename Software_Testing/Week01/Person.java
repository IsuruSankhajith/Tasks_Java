/**
 * Class that represents a person with attributes name, email address 
 
 *
 */
public class Person {
	
	/* Attribute declarations */
	private String lastName;	// last name
	private String firstName;	// first name
	private String email;		// email address
			
	/**
	 * Constructor initializes the person's name and email address
	 */
	public Person(String firstName, String lastName, String email) {
		this.firstName = firstName;
		this.lastName = lastName;		
		this.email = email;
	}

	/**
	 * getName method returns the person's full name
	 * @return first name followed by last name, blank separated
	 */
	public String getName(){
		return firstName + " " + lastName;
	}
	
	/**
	 * getEmail method returns the person's email address
	 * @return email address
	 */
	public String getEmail() {
		return email;
	}
	
	/**
	 * setEmail method sets the person's email address
	 * @param email
	 */
	public void setEmail (String email) {
		this.email = email;
	}
	
	/**
	 * equals method determines whether two persons have the same name
	 * @param other	other Person object that this is compared to
	 * @return true of they have the same first name and last name, false otherwise
	 */
	public boolean equals(Person other){
		if (this.firstName.equals(other.firstName)&& this.lastName.equals(other.lastName))
			return true;
		else
			return false;
	}

	/**
	 * toString method returns a string representation of the person
	 * @return string with first name and last name, email address 
	 */
	public String toString() {
		String s = firstName + " " + lastName + "\t" + email;
		return s;
	}
}
