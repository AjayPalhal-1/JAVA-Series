package com.kabira;

public class MainApp {

	private void Salarypay(Employee[] allEmp) {
		for (int itr = 0; itr < allEmp.length; itr++) {
			allEmp[itr].pay();
		}
	}

	public static void main(String[] args) {

		Employee[] allEmp = { new Devloper(1, "AJAY", 2344, 500), new Manager(1, "AJAY", 2344, 500) };
		MainApp app = new MainApp();
//		allEmp[0].pay();
//		allEmp[1].pay();   

		app.Salarypay(allEmp);

	}

}
