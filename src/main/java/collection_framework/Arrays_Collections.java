package collection_framework;

import java.util.ArrayList;

public class Arrays_Collections {

	public static void main(String[] args) {
		//1. Arrays can store both primitive and nonprimitive type of Data
		int[] a = {1,2,3,4,5};
		
		Arrays_Collections obj1 = new Arrays_Collections();
		Arrays_Collections obj2 = new Arrays_Collections();
		Arrays_Collections obj3 = new Arrays_Collections();
		Arrays_Collections obj4 = new Arrays_Collections();
		Arrays_Collections obj5 = new Arrays_Collections();
		
		Arrays_Collections[] objects = {obj1, obj2, obj3, obj4, obj5};
		
		//1. Collections can only hold non-primitive types of Data
		ArrayList al = new ArrayList();
		al.add(obj1);
		al.add(10); //Integer Wrapper Class Object
		
		//2. Arrays can store only homogeneous type of data excepting in some cases like int as it will be
		//    type casted
		int[] b = {1, 2, 3, 'c', 4, 5, 6};
		//Collections can store heterogeneous data
		

	}

}
