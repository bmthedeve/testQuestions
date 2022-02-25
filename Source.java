package studentDetails;

import java.util.ArrayList;
import java.util.List;

public class Source {

	public static void main(String[] args) {
		StudentImplementation s = new StudentImplementation();
		
		List<Student> students = new ArrayList<Student>();
		students.add(new Student("Smith","John",60));
		students.add(new Student("Dean","James",80));
		students.add(new Student("Jennifer","David",70));
		students.add(new Student("Smith","John",70));
		
		System.out.println(s.countStudents(students));
		System.out.println(s.getName(students));

	}

}
