package model;

public abstract class Material {
	
	private int id;
	private String title;
	private String branch;
	private Customer borrower;
	
	public Material(int ID, String title, String branch) {
		super();
		ID = id;
		this.title = title;
		this.branch = branch;
	}
	
	public int getID() {
		return id;
	}

	public String getTitle() {
		return title;
	}
	
	public void relocate(String newBranch) {
		this.branch = newBranch;
	}
	
	public boolean lend(Customer customer) {
		if(borrower == null) {
			borrower = customer;
			return true;
		}else {return false;}
	}
	public abstract int getLoanPeriod();
	
	public boolean equals(Object obj) {
		if(obj == null) {
			return false;
		}
		if(getClass() == obj.getClass()) {
			Material otherClass = (Material)obj;
			if(id == otherClass.id) {
				return true;
			}else {return false;}
		}else {return false;}
	}
}
