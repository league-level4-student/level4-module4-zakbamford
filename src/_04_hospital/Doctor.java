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

	public void assignPatient(Patient p) throws DoctorFullException {
		System.out.println("pats.size() = " + pats.size());
		if (pats.size() < 3)
			pats.add(p);
		else
			throw new DoctorFullException();
	}

	public ArrayList<Patient> getPatients() {
		return pats;
	}

	public void doMedicine() {
		for (Patient p : pats)
			p.checkPulse();
	}
}
