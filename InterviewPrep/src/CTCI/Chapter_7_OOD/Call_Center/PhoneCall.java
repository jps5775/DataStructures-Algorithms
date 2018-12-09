package CTCI.Chapter_7_OOD.Call_Center;

public class PhoneCall {
	private EmployeeType employeeTypeNeeded;
	public PhoneCall(EmployeeType type) {
		employeeTypeNeeded = type;
	}
	public int getEmployeeTypeNeeded() {
		return employeeTypeNeeded.getType(); 
	}
}
