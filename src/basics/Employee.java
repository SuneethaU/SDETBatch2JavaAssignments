package basics;
public class Employee {
	
	
	public String empName;
	public int empID;
	public int sal;
	
	
	public Employee(String empName, int empID, int sal) {
		this.empName=empName;
		this.empID=empID;
		this.sal=sal;
	}
	
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	
	
	

}