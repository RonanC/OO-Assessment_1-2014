package ie.gmit.computing;

import java.util.Date;

public class TypeB {
	private Date date;
	
	public TypeB() {
		super();
	}
	
	public TypeB(Date date) {
		this();
		setDate(date);
	}
	
	public void setDate(Date date) {
		this.date = date;
	}
	
	public Date getDate() {
		return this.date;
	}
	
	// finalize
	protected void finalize() throws Throwable {
		System.out.println("TypeB about to be GCd\nObject ID: " + this + "\n");
		//super.finalize();
	}
}
