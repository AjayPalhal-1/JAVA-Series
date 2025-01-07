package com.kabira.anonymous_inner_class;

public class MainApp {

	public static void main(String[] args) {

		Employee emp = new Employee() {
			public void employeeDetails() {
//				  static int name = 10;

				System.out.println("Anonymous Inner Class Called");
				System.out.println("Value Of Static variable via Supeclass is : " + variable);
				Employee.display();

			}

			@Override
			public void paySalary() {
				System.out.println("Payables Method Called ");
			}

		};

		emp.employeeDetails();
		emp.paySalary();

		Payable ref = new Payable() {
			public void paySalary() {
//				 static int name = 10;
				Employee.display();

				System.out.println("Payable References Method Called");
				System.out.println("Value Of Static variable via interface referances  is : " + variable);
			}

		};

		ref.paySalary();

	}

}
