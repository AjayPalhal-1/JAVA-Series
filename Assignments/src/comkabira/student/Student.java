package comkabira.student;

import com.kabira.third_year.ThirdYearMarks;
import com.kabira.second_year.SecondYearMarks;

public class Student {

	int rollNo;
	String name;
	ThirdYearMarks tyMarks;
	SecondYearMarks syMarks;

	public Student(int rollNo, String name, ThirdYearMarks tyMarks, SecondYearMarks syMarks) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.tyMarks = tyMarks;
		this.syMarks = syMarks;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ThirdYearMarks getTyMarks() {
		return tyMarks;
	}

	public void setTyMarks(ThirdYearMarks tyMarks) {
		this.tyMarks = tyMarks;
	}

	public SecondYearMarks getSyMarks() {
		return syMarks;
	}

	public void setSyMarks(SecondYearMarks syMarks) {
		this.syMarks = syMarks;
	}

	public void calculateGrade() {
		int totalMarksObtained = tyMarks.getPracticalMarks() + tyMarks.getTheoryMarks() + syMarks.getComputerMarks()
				+ syMarks.getEntcMark() + syMarks.getMathMark();
		int maxmarks = 500;
		float totalMarks = (totalMarksObtained / (float) maxmarks * 100);

		System.out.println("Total Marks : " + totalMarks);

		if (totalMarks >= 70) {
			System.out.println("Grade : A");
		} else if (totalMarks >= 60) {
			System.out.println("Grade : B");

		} else if (totalMarks >= 50) {
			System.out.println("Grade : C");

		} else if (totalMarks >= 40) {
			System.out.println("Grade : Pass ");

		} else {
			System.out.println("You Failed As Student Bro !!!!!!!!");

		}

	}

	public void displayDetails() {
		System.out.println("Roll No: " + rollNo);
		System.out.println("Name: " + name);
		calculateGrade();
	}

}
