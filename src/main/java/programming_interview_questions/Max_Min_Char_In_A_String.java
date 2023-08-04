package programming_interview_questions;

public class Max_Min_Char_In_A_String {

	// Steps:-

	// 1. You will declare a String
	// 2. Declare an array whose size will be same as the String

	public static void main(String[] args) {
		String S = "We are learning Java";
		
		int[] arr = new int[S.length()];
		
		//mincharacter
		//maxcharacater
		
		char minChar = S.charAt(0);
		char maxChar = S.charAt(0);
		
		//Convert my String to Character Array
		
		char[] String = S.toCharArray();
		
		//now we need to count the words first and let's store it in the array arr
		
		for(int i=0 ; i<String.length ; i++) {
			 for (int j=i+1 ; j<String.length ; j++) {
				 if(String[i] == String[j] && String[i]!= '0') {
					 arr[i]++;
					 String[j] = '0';
					
				 }
				 
				 arr[i]=1;
			 }
		}
		
		int min;
		int max;
		
		min=max=arr[0];
		for(int i=0 ; i<arr.length ; i++) {
			if(min > arr[i] && arr[i]!='0') {
				min = arr[i];
						minChar = String[i];
			}
			
			if(max < arr[i]) {
				max = arr[i];
			    maxChar = String[i];
			}
		}
		
		System.out.println(minChar);
		System.out.println(maxChar);
	}

}
