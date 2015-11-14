package ie.gmit.computing;

public class TypeD {
	private String name;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	// finalize
	protected void finalize() throws Throwable {
		System.out.println("TypeD about to be GCd\nObject ID: " + this + "\n");
		//super.finalize();
	}
}
