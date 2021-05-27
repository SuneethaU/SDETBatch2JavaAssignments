////Program to add employees in to ArrayList and retrieve the employee at index 2 and Retrieve all the employees information
package basics;
import java.util.ArrayList;
public class ArrayListDemoWithEmployee{
	
	public static void main(String[] args) {
			
			ArrayList<Employee> empList=new ArrayList();
			empList.add(new Employee("Emp1",1,10000));
			empList.add(new Employee("Emp2",2,20000));
			empList.add(new Employee("Emp3",3,30000));
			empList.add(new Employee("Emp4",4,40000));
			empList.add(new Employee("Emp5",5,50000));
			//Get the Employee Information in index 2
			Employee emp1=empList.get(2);
			System.out.println("Emploee ID: "+emp1.getEmpID()+"  "+"Name: "+emp1.getEmpName()+"  "+"Salary: "+emp1.getSal());
			
			for(int i=0;i<empList.size();i++) {
				Employee emp=empList.get(i);
				System.out.println("Emploee ID: "+emp.getEmpID()+"  "+"Name: "+emp.getEmpName()+"  "+"Salary: "+emp.getSal());
				
			}
			
			
			
			

		}

	}

