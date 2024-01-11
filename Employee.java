package javaTask_C_day_10;

public class Employee {
	
	private int id ;
	private String firstname;
	private String lastname;
	private double salary;
	
	
	public Employee(int idE, String firstnameE, String lastnameE, int salaryE ) {
		this.id	=idE;
		this.firstname=firstnameE;
		this.lastname=lastnameE;
		this.salary	=salaryE;
		
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	 public void raiseSalary(int percent) {
	        double raiseFactor = 1 + (percent / 100.0);
	        salary = (int) (salary * raiseFactor);
	    }

	   
	    @Override
	    public String toString() {
	        return "Employee[id=" + id + ", name=" + getFirstname() + ", salary=" + salary + "]";
	    }

	    
	    public static void main(String[] args) {
	       
	        Employee employee = new Employee(1, "Shiva", "A", 50000);

	        System.out.println(employee);

	        employee.raiseSalary(10);

	        System.out.println("Updated Salary: " + employee.getSalary());
	    }
}

