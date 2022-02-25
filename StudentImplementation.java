package studentDetails;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StudentImplementation {
		
//	public static int sumScore(List<Student> list) {
//		return list.stream().collect(Collectors.summingInt(Student::getScore));
//	}
//	
//	public static List<String> listNames(List<Student> list) {
//		return list.stream().map(o->o.getFirstName()).collect(Collectors.toList());
//	}
	
	public long countStudents(List<Student> list) {
		return list.stream().filter(o->o.getScore()>70).count();
	}
	
	public List<String> getName(List<Student> list) {
		return list.stream().map(o->String.format("%s %s", o.getFirstName(),o.getLastName())).collect(Collectors.toList());
	}
}
