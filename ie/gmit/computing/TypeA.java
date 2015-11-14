package ie.gmit.computing;

import java.util.*;

public class TypeA {
	public static void main(String[] args) throws Throwable {
		System.out.println("**Start**");
		
		TypeB typeb = new TypeB();
//		Date date = new Date();
		List<TypeD> list;
		
		// create an instance of TypeC
		TypeC typec = new TypeC(typeb);
		
		// Instances of TypeD to be passed to TypeC
		TypeD typed1 = new TypeD();
		TypeD typed2 = new TypeD();
		
		// Exercise all of TypeC's methods
		typec.add(typed1);
		typec.add(typed2);
		System.out.println(typec.delete(typed1));
		System.out.println(typec.count());
		typec.contains(typed2);
		
		list = typec.elements();
		System.out.println("list: " + list.toString());
		
		// remove references to check finalize method works (GC)
		typed2 = null;
		typed1 = null;
		typec = null;
		list = null;
		
		// hint to GC that you want to GC
		System.gc();
		
		// finalize
		// typed2.finalize();
		// typed1.finalize();
		// typec.finalize();
		
		System.out.println("**End**\n");
	}
}
