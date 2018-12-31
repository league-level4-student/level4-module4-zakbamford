package _04_hospital;

public class Patient {
	
	private boolean cared;
	
	Patient() {
		cared = false;
	}

	public void checkPulse() {
		cared = true;
	}

	public boolean feelsCaredFor() {
		return cared;
	}
}
