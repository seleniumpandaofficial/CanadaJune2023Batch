package com.oops.abstraction_AbstractClass;

public class PrivateSchool extends Student{
	
	public static void main(String[] args) {
		PrivateSchool ref = new PrivateSchool();
		Student student = new PrivateSchool();
		student.studentHallBooking();
		student.studentMarksheet();
		student.studentPlaySports();
	}

	@Override
	public void studentMarksheet() {
		System.out.println("Student marksheet");
		
	}

	@Override
	public void studentPlaySports() {
		System.out.println("Student play sports");
		
	}
	
	

}
