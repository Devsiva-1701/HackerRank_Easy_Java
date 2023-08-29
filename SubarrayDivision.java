package javaPackage;


import java.util.Scanner;

public class SubarrayDivision {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int size = input.nextInt();
		
		
		
		int[] chocolates = new int[size];
		
		
		for(int i = 0 ; i< size ; i++)
		{
			chocolates[i] = input.nextInt();
		}
		
		int month = input.nextInt();
		int day = input.nextInt();
		
		birthday(chocolates, month, day);

	}
	
	public static void birthday( int[] chocolates , int month , int day )
	{
		int sum = 0 , count = 0 , prev = 0 , prevIndex = 0 , res_count =0 ;
		int last_choco = 0;
		for(int chocolate : chocolates )
		{
			
			if(count == day  ) {
				sum = sum - prev;
				
				if(sum == month)
				{
					res_count++;
					
					sum = sum + chocolate;
					
				}
				else {
					
					
					sum = sum + chocolate;
					
					
				}
				prev = chocolates[prevIndex];
				prevIndex++;
				
			}

			if(count != day )
			{
				sum = sum + chocolate;
				count++;
			}
			
			last_choco =chocolate;
			
			
			
		}
		
		if(count == day  ) {
			sum = sum - prev;
			
			if(sum == month)
			{
				res_count++;
				
				sum = sum + last_choco;
				
			}
		}
		
		System.out.println(res_count);
	}

}
