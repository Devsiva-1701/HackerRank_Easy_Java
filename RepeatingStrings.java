package javaPackage;

import java.util.Scanner;

public class RepeatingStrings {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		
		String userString = input.nextLine();
		
		long infiniteStringLength = input.nextLong();
		
		getLetter_a(userString, infiniteStringLength);
		
	}
	
	public static void getLetter_a( String userString , long infiniteStringLength )
	{
		
		long count = 0l;
		
		for(int i = 0 ; i < userString.length() ; i++)
		{
			
			if(userString.charAt(i)== 'a')
			{
				count++;
			}
			
		}
		count = count  * ( infiniteStringLength / userString.length() );
		
		for(int i= 0 ; i < ( infiniteStringLength % userString.length()) ; i ++)
		{
			
			if(userString.charAt(i)== 'a')
			{
				count++;
			}
			
		}
		
		System.out.println(count);
		
	}

}
