package areYouVaccinated;

public class Vaccine {
	private int age;
	private float dosage;
	
	public Vaccine(int age) {
		super();
		this.age = age;
	}
	
	public Vaccine(int age, float dosage) {
		super();
		this.age = age;
		this.dosage = dosage;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public float getDosage() {
		return dosage;
	}
	public void setDosage(float dosage) {
		this.dosage = dosage;
	}
}
