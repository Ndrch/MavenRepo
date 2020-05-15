package package5;

public class Smartphon {
	private String brandName;
	private boolean isNew;
	private double tsina;
	
	Smartphon() {}
	
	Smartphon(String brandName, boolean isNew) {
		this.brandName = brandName;
		this.isNew = isNew;
	}
	Smartphon (String brandName, boolean isNew, double tsina) {
		this.brandName = brandName;
		this.isNew = isNew;
		this.tsina = tsina;
	}
	
	String getBrandName() {
		return brandName;
	}
	void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	boolean isNew() {
		return isNew;
	}
	void setNew(boolean isNew) {
		this.isNew = isNew;
	}
	double getTsina() {
		return tsina;
	}
	void setTsina(double tsina) {
		if (tsina < 0) {
			this.tsina = 0;
		} else {
		this.tsina = tsina;
		}
	}


}
