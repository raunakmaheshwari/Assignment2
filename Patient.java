
public class Patient {
	private String firstName;
	private String middleName;
	private String lastName;
	private String address;
	private String city;
	private String state;
	private int zipCode;
	private String phoneNumber;
	private String emergencyName;
	private String emergencyContact;
	
	public Patient() {
		this.firstName = "Jenny";
		this.middleName = "Elaine";
		this.lastName = "Santori";
		this.address = "123 Main Street";
		this.city = "MyTown";
		this.state = "CA";
		this.zipCode = 01234;
		this.phoneNumber = "301-123-4567";
		this.emergencyName = "Bill Santori";
		this.emergencyContact = "777-555-1212";
	}
	public Patient(String firstName, String middleName, String lastName) {
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.address = "123 Main Street";
		this.city = "MyTown";
		this.state = "CA";
		this.zipCode = 01234;
		this.phoneNumber = "301-123-4567";
		this.emergencyName = "Bill Santori";
		this.emergencyContact = "777-555-1212";
	}
	
	public Patient(String firstName, String middleName, String lastName, String address, String city, String state, int zipCode, String phoneNumber, String emergencyName, String emergencyContact) {
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		this.phoneNumber = phoneNumber;
		this.emergencyName = emergencyName;
		this.emergencyContact = emergencyContact;
				
	}
	/*Getting and setting all of the respective fields of the PATIENT CLASS*/
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getMiddleName() {
		return middleName;
	}
	
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getState() {
		return state;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	public int getZipCode() {
		return zipCode;
	}
	
	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public String getEmergencyName() {
		return emergencyName;
	}
	
	public void setEmergencyName(String emergencyName) {
		this.emergencyName = emergencyName;
	}
	
	public String getEmergencyContact() {
		return emergencyContact;
	}
	
	public void setEmergencyContact(String emergencyContact) {
		this.emergencyContact = emergencyContact;
	}
	/*Creates a full name by concatenating the first, middle, and last names.*/
	public String buildFullName() {
		return firstName + " " + middleName + " " + lastName;
	}
	/*Creates a full address by concatenating the main address, city, state, and zipcode.*/
	public String buildAddress() {
		return address + " " + city + " " + state + " " + zipCode;
	}
	/*Creates a full emergency contact by concatenating the emergency name and emergency phone number.*/
	public String buildEmergencyContact() {
		return emergencyName + " " + emergencyContact;
	}
	/*Displaying all information about the Patient. This includes displaying information about the
	 full name, address, and emergency information.*/
	@Override
	public String toString() {
		String fullName = buildFullName();
		String address = buildAddress();
		String emergencyInfo = buildEmergencyContact();
		String result = "";
		result += "Patient Info: \t \n";
		result += "\t Name: " + fullName + "\n";
		result += "\t Address: " + address + "\n";
		result += "\t Emergency Contact: " + emergencyInfo + "\n";
		return result;
	}
	
	
	
	
	
	
	
	
	
	
}
