/*
 * Class: CMSC203 
 * Instructor: Dr. Kuijt
 * Description: A project that displays certain procedures and its respective information for a medical patient.
 * Due: 10/06/24
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment 
* independently. I have not copied the code from a student or any source. I have not given my code to any student.
 * Print your Name here: RAUNAK MAHESHWARI
*/
import java.util.Scanner;

public class PatientDriverApp {
	final static String programmerName = "Raunak Maheshwari";
	final static String mcNumber = "M21162103";
	final static String dueDate = "10/6/24";
	
	/*Calculates and returns the total charges from all 3 procedures*/
	public static double calculateTotalCharges(Procedure p1, Procedure p2, Procedure p3) {
		double result = p1.getProcedureCharges() + p2.getProcedureCharges() + p2.getProcedureCharges();
		return result;
	}
	/*Displays all of the patient information*/
	public static void displayPatient(Patient p1) {
		String result = p1.toString();
		System.out.println(result);
	}
	/*Displays all of the procedure information*/
	public static void displayProcedure(Procedure p1) {
		String result = p1.toString();
		System.out.println(result);
	}
	public static void main(String[] args) {
		String firstName, middleName, lastName, address, city, state, phoneNumber, emergencyName, emergencyContact;
		int zipCode;
		double totalCharges;
		Scanner scanner = new Scanner(System.in);
		System.out.println("First Name: ");
		firstName = scanner.nextLine();
		System.out.println("Middle Name: ");
		middleName = scanner.nextLine();
		System.out.println("Last Name: ");
		lastName = scanner.nextLine();
		System.out.println("Address: ");
		address = scanner.nextLine();	
		System.out.println("City: ");
		city = scanner.nextLine();
		System.out.println("State: ");
		state = scanner.nextLine();
		System.out.println("Zip Code: ");
		zipCode = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Phone Number: ");
		phoneNumber = scanner.nextLine();
		System.out.println("Emergency Name: ");
		emergencyName = scanner.nextLine();
		System.out.println("Emergency Contact: ");
		emergencyContact = scanner.nextLine();
		
	
		Patient p1 = new Patient(firstName, middleName, lastName, address, city, state, zipCode, phoneNumber, emergencyName, emergencyContact);
		Procedure procedure1 = new Procedure();
		Procedure procedure2 = new Procedure("X-ray", "7/20/2019");
		Procedure procedure3 = new Procedure("Blood Test", "7/20/2019", "Dr. Smith", 1440.75);
		displayPatient(p1);
		displayProcedure(procedure1);
		displayProcedure(procedure2);
		displayProcedure(procedure3);
		totalCharges = calculateTotalCharges(procedure1, procedure2, procedure3);
		System.out.println("Total Charges: $" + totalCharges);
		System.out.println("");
		System.out.println("Student Name: " + programmerName);
		System.out.println("MC#: " + mcNumber);
		System.out.println("Due Date: " + dueDate);
	}
	
	
	
	
	
	
	
	
}
