package CTCI.Chapter_7_OOD.Call_Center;

public enum EmployeeType {
	Respondent(0), Manager(1), Director(2);
	private int type;
	private EmployeeType(int type){
		this.type = type;
	}
	public int getType() {
		return type;
	}
}
