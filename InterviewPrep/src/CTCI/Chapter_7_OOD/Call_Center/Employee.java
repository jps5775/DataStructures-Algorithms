package CTCI.Chapter_7_OOD.Call_Center;

public class Employee {
	private EmployeeType employeeType;
	private PhoneCall phoneCall;
	private boolean available;
	
	public Employee(EmployeeType employeeType){
		this.employeeType = employeeType;
	}
	
	public boolean canTakeCall(PhoneCall phoneCall) {
		if(available && employeeType.getType() == phoneCall.getEmployeeTypeNeeded()) {
			return true;
		}else {
			return false;
		}
	}
	
	
}
