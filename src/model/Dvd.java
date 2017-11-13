package model;

public class Dvd extends Material {
	
	private String director;
	private String catalogNr;
	private int runningTime;
	private boolean licenced;
	
	public Dvd(int dvdID, String title, String branch, String director, String catalogNr, int runningTime) {
		super(dvdID, title, branch);
		this.director = director;
		this.catalogNr = catalogNr;
		this.runningTime = runningTime;
		licenced = false;
	}
	
	public void licence() {
		licenced = true;
	}
	
	public boolean lend(Customer customer) {
		if (licenced) {
			return super.lend(customer);
		}else {
			return false;
		}
	}
	
	public int getLoanPeriod() {
		return 7;
	}
}
