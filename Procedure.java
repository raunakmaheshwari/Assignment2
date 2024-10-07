
public class Procedure {
	private String procedureName;
	private String procedureDate;
	private String practitionerName;
	private double procedureCharges;
	
	public Procedure() {
		this.procedureName = "Physical Exam";
		this.procedureDate = "7/20/19";
		this.practitionerName = "Dr. Irvine";
		this.procedureCharges = 3250.0;
	}
	
	public Procedure(String procedureName, String procedureDate) {
		this.procedureName = procedureName;
		this.procedureDate = procedureDate;
		this.practitionerName = "Dr. Irvine";
		this.procedureCharges = 3250.0;
	}
	
	public Procedure(String procedureName, String procedureDate, String practitionerName, double procedureCharges) {
		this.procedureName = procedureName;
		this.procedureDate = procedureDate;
		this.practitionerName = practitionerName;
		this.procedureCharges = procedureCharges;
	}
	/*Getting and setting all of the respective fields of the PATIENT CLASS*/
	public String getProcedureName() {
		return procedureName;
	}
	public void setProcedureName(String procedureName) {
		this.procedureName = procedureName;
	}
	public String getProcedureDate() {
		return procedureDate;
	}
	public void setProcedureDate(String procedureDate) {
		this.procedureDate = procedureDate;
	}
	public String getPractitionerName() {
		return practitionerName;
	}
	public void setPractitionerName(String practitionerName) {
		this.practitionerName = practitionerName;
	}
	public double getProcedureCharges() {
		return procedureCharges;
	}
	public void setProcedureCharges(double procedureCharges) {
		this.procedureCharges = procedureCharges;
	}
	
	@Override
	/*Displaying all information about a certain procedure, which contains displaying the procedure name,
	 procedure date, practitioner name, and the procedure charges*/
	public String toString() {
		String result = "";
		result += "\t\tProcedure: " + procedureName + "\n";
		result += "\t\tProcedure Date: " + procedureDate + "\n";
		result += "\t\tPractitioner Name: " + practitionerName + "\n";
		result += "\t\tCharge: " + procedureCharges + "\n";
		return result;
	}
	
	
	
}
