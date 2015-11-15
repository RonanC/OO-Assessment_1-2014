package ie.gmit.computing;

import java.util.*;

public class TypeC {
	// delegate interface
	private Date date;
	private List<TypeD> list = new ArrayList<TypeD>();
	// Passing in typeB to this TypeC constructor but UML had DATE explicit, to make aggregation rule correct then must pass it into constructor
	//private TypeB typeb;
	
	public TypeC(Date date) {
		super();
		this.date = date;
//		this.typeb = typeb;
//		this.typeb.setDate(new Date());
	}
	
	// delegate methods
	public boolean add(TypeD element) {
		try {
			TypeD td = (TypeD) element.clone();
			return list.add(td);
		} catch (Exception e) {
			return false;
		}
	}
	
	public boolean delete(TypeD element) {
		return list.remove(element);
	}

	public int count() {
		return list.size();
	}

	public boolean contains(TypeD element) {
		return list.contains(element);
	}
	
	public List<TypeD> elements() {
		List<TypeD> temp = new ArrayList<TypeD>();
		for (TypeD element : list) {
			try {
				TypeD td = (TypeD) element.clone();
				temp.add(td);
			} catch (Exception e) {
				// ignore
			}
		}
		return temp;
	}

	// finalize
	protected void finalize() throws Throwable {
		System.out.println("TypeC about to be GCd\nObject ID: " + this + "\n");
		//super.finalize();
	}
	
	// aggregation (delagation)
	// could have made TypeB above public
	// could have delegated TypeB methods below instead of passing in TypeB as Date in Constructor
	
	//	public void setDate(Date date){
	//		typeb.setDate(date);
	//	}
	//	
	//	public Date getDate(){
	//		return typeb.getDate();
	//	}
}
