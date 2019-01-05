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

	public void assignPatientsToDoctors() {
		int fullDocs = pats.size() / docs.size();
		int remainder = pats.size() % docs.size();
		int fullPats = pats.size() - remainder;
		System.out.println("fullDocs = " + fullDocs + " remainder = " + remainder + " fullPats = " + fullPats);
		int i, j = 0;
		for (i = 0; i < fullDocs; i++) {
			for (j = 0; j < 3; j++) {
				try {
					docs.get(i).assignPatient(pats.get((i * 3) + j));
				} catch (DoctorFullException e) {
					e.printStackTrace();
				}
			}
			j = 0;
		}
		for (j = fullPats; j < pats.size(); j++) {
			try {
				docs.get(i).assignPatient(pats.get(j));
			} catch (DoctorFullException e) {
				e.printStackTrace();
			}
		}
	}
}
