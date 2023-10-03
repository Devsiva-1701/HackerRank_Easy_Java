package javaPackage;

import java.util.Scanner;

public class ArrayRotation {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int size = input.nextInt();
		int rotation = input.nextInt();
		int queryLength = input.nextInt();
		
		int array[] = new int[size];
		int queries[] = new int[queryLength];
		
		for(int i=0 ; i < size ; i++)
		{
			array[i] = input.nextInt();
		}
		for(int i=0 ; i < queryLength ; i++)
		{
			queries[i] = input.nextInt();
		}
		
		input.close();
		
		getElements(array, queries, rotation);
		
	}
	
	private static void getElements( int[] array , int[] queries , int rotation )
	{
		
		int rotatedZeroIndex = (array.length - (rotation % array.length) == array.length ? 0 : array.length - (rotation % array.length) );
		int difference = Math.abs((array.length-1) - (rotatedZeroIndex));
		for(int query : queries)
		{
			

			if((query-1) - difference < 0)
			{
				System.out.println(array[Math.abs( array.length + ((query-1) - difference))]);
			}
			else {
				System.out.println(array[Math.abs((query-1) - difference)]);
			}
			
			
		}
		
	}

}

/*
 * Explanation : 
 * 
 * First I initialized and fetched the user inputs.
 * 
 * I am getting the 0th index of the rotated array the steps are follows :
 * 
 * int rotatedZeroIndex = (array.length - (rotation % array.length) == array.length ? 0 : array.length - (rotation % array.length) );
 * 
 * 1 - I finding the difference between the given user input array length to the modulus of the number of rotations to the array length because we get every
 * 	index value between the length of the array we get 5 mod 6 = 1 and 11 mod 6 = 1 so we are getting the mod value which is subtracted to array length 
 *  to get the index as I would get the index between the size of the array so that I can find the rotated array index that's why I took mod between rotation 
 *  to array length.
 *  
 * 2 - Now I got the 0th index of the rotated array and I need to find how much element does the 0th index moved So that I can able to judge the given query 
 * 	index to find the element by using the following I can get the difference :
 *  
 *	int difference = Math.abs((array.length-1) - (rotatedZeroIndex));
 *
 *	The reason I have used the array.length-1 is because we are focusing on the index array.length-1 we get the last index of the array.
 *
 * 3 - Next I am iterating through the queries to fetch the elements from the respected index the steps involved are follows :
 * 
 * 	I have one condition :
 * 
 * 		 I need to check the index from the query by getting the moved array with the difference from the query , as I have the difference I know how much index
 * 		 I got moved so the same I going to do the queries to get the element from the non rotated array for example I have array like 1,2,3
 *		 if have 2 rotation they the rotated array will be like this 2,3,1 the difference is 1 and the 0th index of the rotated array from the non rotated array
 *		 is 1st index I got moved 2 index forward from my logic perspective the same would happened to other elements so I have used the formula like  
 *
 *				if((query-1) - difference < 0)
 *			{
 *				System.out.println(array[Math.abs( array.length + ((query-1) - difference))]);
 *			}
 *		else {
 *				System.out.println(array[Math.abs((query-1) - difference)]);
 *			}
 *
 *		 May be I would get the negative value which is less than the initial index of the array so if I have those results I would subtract it from the length 
 * 	 	 of the input array to get the actual index. 
 *		 
 *	By using this logic for all the query I would get the excepted result.		 
 *
 * Happy coding..!!
 * 
 * */
