package areYouVaccinated;

import java.util.*;
import java.util.stream.Collectors;

public class VaccinationCamp {
	public static void main(String[] args) throws Exception{
	
		VaccinationCamp vc = new VaccinationCamp();
		
		ArrayList<Vaccine> list1 = new ArrayList<>();
		list1.add(new Vaccine(49));
		list1.add(new Vaccine(26));
		list1.add(new Vaccine(19));

		ArrayList<Vaccine> list2 = new ArrayList<>();
		list2.add(new Vaccine(49,250));
		list2.add(new Vaccine(26,200));
		list2.add(new Vaccine(19,100));
		
		vc.assignVaccine(list1);
		System.out.println(vc.vaccineInjected(list2));
	}
	
	public void assignVaccine(ArrayList<Vaccine> list) {
		for(Vaccine vaccine:list) {
			if(vaccine.getAge()>=45) vaccine.setDosage(250);
			else if(vaccine.getAge()>=20) vaccine.setDosage(200);
			else vaccine.setDosage(100);
		}
	}
	
	public float vaccineInjected(ArrayList<Vaccine> list) {
		float total = 0;
		for(Vaccine vaccine:list) {
			total = total + vaccine.getDosage();
		}
		return total;
	}
}
