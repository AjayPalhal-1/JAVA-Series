package com.kabira.overriding_overloading;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 99;
		String str = "Random ";

		Employee ref = new Employee(1, "Amul");
		ref.display();
//		ref.display(num);

		Employee ref1 = new Hr(1, "Ankush ");
		ref1.display();
//		ref1.display(num);

		Hr ref2 = new Hr(120, "Parvin");
		ref2.display();
		ref2.display(num);
		ref2.display(str);
	}

}
