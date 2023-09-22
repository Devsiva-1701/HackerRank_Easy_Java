package javaPackage;

import java.util.Scanner;

public class CamelCase {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		
		String inputString = input.nextLine();

		System.out.println(getWordsCount(inputString)); 
	}

	private static Long getWordsCount(String inputString) {


		Long count = 1L;
		
		for(int i  =0 ; i < inputString.length() ; i++)
		{
			
			if((int)inputString.charAt(i) >= 65 && (int)inputString.charAt(i) <= 90)
			{
				
				count++;
			}
		}
		
		return count;
				
		
	}
	
	

}
