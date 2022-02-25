package salaryDataValidator;

public class Source {
	public static void main(String[] args) {
		SalaryData s = new SalaryData("Steve",30,10000);
		Validator val = new Validator();
		System.out.println(val.validateSalaryData(s));
		System.out.println(val.getTotalSalary(s));
	}
}
