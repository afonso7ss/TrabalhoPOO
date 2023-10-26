
import java.util.ArrayList;

public class Company {
	private String name;
	private ArrayList <Employee> employees;
	

	public Company(String name, ArrayList<Employee> employee) {
		this.name = name;
		this.employees = employee;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public ArrayList<Employee> getEmployees() {
		return employees;
	}


	public void setEmployees(ArrayList<Employee> employees) {
		this.employees = employees;
	}


	
}