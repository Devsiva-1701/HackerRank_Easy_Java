package javaPackage;

import java.util.Scanner;

public class FindDigits {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int size = input.nextInt();
		
		int array[] = new int[size];
		
		for( int i =0 ; i< size ; i++ )
		{
			
			array[i] = input.nextInt();
			
		}

		input.close();

		
		getcount(array);

	}
	
	private static void getcount( int array[] )
	{
		
		int digit , count = 0 , single;
		
		for(int num : array )
		{
			digit = num;
			single = num % 10;
			while( digit > 0 )
			{
				
				if( single!=0 && num % single == 0 )
				{
					
					count++;
					
					
				}
				digit = digit / 10;
				if(digit == 0 )
				{
					break;
				}
				single = digit % 10;
				
			}
			
			System.out.println(count);
			count = 0;
			
		}
		
	
		
	}

}
