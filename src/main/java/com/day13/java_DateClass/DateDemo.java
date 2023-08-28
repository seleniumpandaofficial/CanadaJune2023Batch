package com.day13.java_DateClass;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		Date date = new Date();
		String format = date.toString().replace(" ", "_").replace(":", "_");
		System.out.println(format); //this is very dynamic
		System.out.println(date.toString());
		
		//you want to save your date in different formats
		//  mm/dd/yyyy
		
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		System.out.println(sdf.format(date));
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss");
		System.out.println(sdf1.format(date));
	}

}
