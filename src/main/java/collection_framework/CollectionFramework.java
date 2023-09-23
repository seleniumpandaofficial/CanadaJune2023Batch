package collection_framework;

import java.util.ArrayList;
import java.util.HashMap;

public class CollectionFramework {

	public static void main(String[] args) {
	//Collection - is a single entity in which we can store multiple data
	//framework - represents the library (API)
	
	//Define Collection framework?
	//pre-defined API(interfaces, classes and methods) to store data
		
	//it has 2 main packages:
		 //java.util.Collection - we can store data directly
		 //java.util.Map - we store data in key value pair
		
		ArrayList al = new ArrayList();
		al.add(10);
		al.add("Selenium");
		al.add('z');
		
		HashMap hm = new HashMap();
		hm.put(101, "Java");
		hm.put(102, "C++");
		hm.put(103, "C#");

	}

}
