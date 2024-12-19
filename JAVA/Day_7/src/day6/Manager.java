package day6;

public class Manager extends Employee
{
	
	int projectSize;

	public Manager(int id, String name, int salary,int psize) {
		super(id, name, salary);
		this.projectSize=psize;
		
	}

	public int getProjectSize() {
		return projectSize;
	}

	public void setProjectSize(int projectSize) {
		this.projectSize = projectSize;
	}
	
	public void calculateSalary()
	{
		System.out.println("Employee Salary : "+this.getSalary());
	}
	
	
	
	
	

}
