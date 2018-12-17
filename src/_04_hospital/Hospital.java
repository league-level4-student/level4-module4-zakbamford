package _04_hospital;

import java.util.ArrayList;

public class Hospital {
	
	private ArrayList<Doctor> docs;
	private ArrayList<Patient> pats;
	
	Hospital() {
		docs = new ArrayList<Doctor>();
		pats = new ArrayList<Patient>();
	}
	
	public void addDoctor(Doctor d) {
		docs.add(d);
	}
	
	public void addPatient(Patient p) {
		pats.add(p);
	}
	
	public ArrayList<Doctor> getDoctors() {
		return docs;
	}
	
	public ArrayList<Patient> getPatients() {
		return pats;
	}
}
