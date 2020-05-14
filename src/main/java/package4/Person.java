package package4;

public class Person {
	private String imya;
	private String prizv;
	private int vik;
	private double zrist;
	private String profesija;

	String getImya() {
		return imya;
	}

	void setImya(String imya) {
		if (imya.length() > 50) {
			this.imya = imya.substring(0, 50);
		} else {
			this.imya = imya;
		}
	}

	String getFullName() {
		return imya + " " + getPrizv();
	}

	String getFullInfo() {
		return getFullName() + " (vik: " + getVik() + "; zrist: " + getZrist() + ")";
	}

	String getPrizv() {
		return prizv;
	}

	void setPrizv(String prizv) {
		this.prizv = prizv;
	}

	int getVik() {
		return vik;
	}

	void setVik(int vik) {
		if (vik > 80) {
			this.vik = 80;
		} else {
			this.vik = vik;
		}
	}

	double getZrist() {
		return zrist;
	}

	void setZrist(double zrist) {
		this.zrist = zrist;
	}

	String getProfesija() {
		return profesija;
	}

	void setProfesija(String profesija) {
		this.profesija = profesija;
	}

}
