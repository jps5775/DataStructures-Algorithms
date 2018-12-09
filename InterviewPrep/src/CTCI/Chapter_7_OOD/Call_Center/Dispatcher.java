package CTCI.Chapter_7_OOD.Call_Center;

public class Dispatcher {
	public static void dispatchCall(PhoneCall phoneCall){
		
	}
	
	public static void createCenter() {
		
	}
	
	public static void main(String[] args) {
		createCenter();
		
		dispatchCall(new PhoneCall(EmployeeType.Manager));
		
	}
}
