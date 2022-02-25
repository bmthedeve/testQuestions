package salaryDataValidator;

public class SalaryData {
	private String name;
	private int daysInMonth;
	private double salary;
	
	public SalaryData(String name, int daysInMonth, double salary) {
		super();
		this.name = name;
		this.daysInMonth = daysInMonth;
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDaysInMonth() {
		return daysInMonth;
	}
	public void setDaysInMonth(int daysInMonth) {
		this.daysInMonth = daysInMonth;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "SalaryData [name=" + name + ", daysInMonth=" + daysInMonth + ", salary=" + salary + "]";
	}
	
}
