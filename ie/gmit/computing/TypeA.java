package ie.gmit.computing;

import java.util.*;

public class TypeA {
	public static void main(String[] args) throws Throwable {
		System.out.println("**Start**");
		
//		Date date = new Date();
//		TypeB tb = new TypeB();
//		List<TypeD> list;
		
		// create an instance of TypeC
		///TypeC tc = new TypeC(tb);
		TypeC tc = new TypeC(new Date());
		
		// Instances of TypeD to be passed to TypeC
//		TypeD td1 = new TypeD();
//		TypeD td2 = new TypeD();
//		TypeD td3 = new TypeD();
//		TypeD td4 = new TypeD();
		for (int i = 0; i < 100; i++) {
			tc.add(new TypeD("G" + i));
		}
		
		System.out.println("Count: " + tc.count());
		
		TypeD td = new TypeD("G50");
		boolean result = tc.delete(td);
		
		System.out.println("Removed returned " + result + ". There are " + tc.count() + " elements in the container.");
		// Exercise all of TypeC's methods
//		tc.add(td1);
//		tc.add(td2);
//		tc.add(td3);
//		tc.add(td4);
		//System.out.println(tc.delete(td1));
		//tc.contains(td2);
		
		List<TypeD> tds = tc.elements();
		tds.clear();
//		list = tc.elements();
//		System.out.println("list: " + list.toString());
		
		// remove references to check finalize method works (GC)
//		td4 = null;
//		td3 = null;
//		td2 = null;
//		td1 = null;
//		tc = null;
//		list = null;
		
		// hint to GC that you want to GC
		//System.gc();
		
		// finalize
		// td2.finalize();
		// td1.finalize();
		// tc.finalize();
		
		System.out.println("Count: " + tc.count());
		
		tc = null;
		System.gc();
		
		System.out.println("**End**\n");
	}
}
