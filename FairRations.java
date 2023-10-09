package javaPackage;

import java.util.Scanner;

public class FairRations {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		int array[] = new int[size];
		
		for(int i =0 ; i< size ; i++)
		{
			array[i] = input.nextInt();
		}
		
		int evenCount = 0;
		
		for(int i : array)
		{
			if( i%2 != 0 )
			{
				evenCount++;
			}
		}
		
		if(evenCount%2 != 0 )
		{
			System.out.println("NO");
		}
		else {
			int storage = 0;
			int betweenNumbers = 0;
			boolean iseven = false;
			for(int i =0 ; i <size ; i++)
			{
				if(iseven)
				{
					betweenNumbers++;
				}
				if(array[i]%2 !=0)
				{
					iseven = !iseven;
					if(betweenNumbers != 0)
					{
						storage += (betweenNumbers*2) ;
						betweenNumbers = 0;
					}
				}
			}
			System.out.println(Integer.toString(storage));
		}


	}


}

/*
 * EXPLANATION : 
 * 
 * I use some arithmetical approach for this problem although we have a simple method to solve it I can give you the perspective of the a arithmetical approach 
 * for this problem : 
 * 
 * 	I going to give loaf to 2 persons compulsory as that is the condition of this problem I just found out the number of even persons present in between two odd people
 * 		because I will finished the providing of loaf to persons if I have one odd person is adjacent to another odd person 
 * 
 * 		if(iseven)
				{
					betweenNumbers++;
				}
				if(array[i]%2 !=0)
				{
					iseven = !iseven;
					if(betweenNumbers != 0)
					{
						storage += (betweenNumbers*2) ;
						betweenNumbers = 0;
					}
				}
				
		That's why I am not changing the iseven to false as I need to get the last member also who is the second odd person to complete the rotation
		
		
		And I have a "NO" condition if the number of odd count is a odd I woudn't give the loaf to people to satisfy the condition So I print "NO" there. 
		
		
		Happy Coding..!!!
 * 
 * */
