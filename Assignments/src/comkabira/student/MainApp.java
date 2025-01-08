package comkabira.student;

import com.kabira.third_year.ThirdYearMarks;
import com.kabira.second_year.SecondYearMarks;

public class MainApp {
	public static void main(String[] args) {

		ThirdYearMarks tymark = new ThirdYearMarks(100, 100);
		SecondYearMarks symark = new SecondYearMarks(10, 100, 100);

		Student ref = new Student(10, "Ramesh", tymark, symark);
		ref.displayDetails();
		

	}
}
