package salaryDataValidator;

public class Validator {
	
	public static String validateSalaryData(SalaryData s){
		if(!(s.getDaysInMonth()==28 || s.getDaysInMonth()==30 || s.getDaysInMonth()==31)) {
			try {
				throw new InvalidDaysException("Invalid Days");
			}
			catch(InvalidDaysException i) {
				return i.getMessage();
			}
		}
		if(s.getSalary()<0 || s.getSalary()>1000000) {
			try {
				throw new InvalidSalaryException("Invalid Salary");
			}
			catch(InvalidSalaryException is) {
				return is.getMessage();
			}
		}
		else
			return "Valid Data";
	}
	
	public static double getTotalSalary(SalaryData s) {
		try{
			validateSalaryData(s);
			return s.getDaysInMonth()*s.getSalary();
		}
		catch(Exception e){
			return 0.0;
		}
	}
}
