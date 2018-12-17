package _04_hospital;

import java.util.ArrayList;

public class Doctor {
	
	ArrayList<Patient> pats = new ArrayList<Patient>();
	
	Doctor() {
	}
	
	public boolean performsSurgery() {
		return false;
	}
	
	public boolean makesHouseCalls() {
		return false;
	}
	
	public void assignPatient(Patient p) {
		pats.add(p);
	}
	
	public ArrayList<Patient> getPatients() {
		return pats;
	}
}
