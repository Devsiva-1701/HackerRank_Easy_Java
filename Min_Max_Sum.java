package javaPackage;

import java.util.Scanner;

public class Min_Max_Sum {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		long inputArray[] = new long[5];

		for(int i = 0 ; i< 5 ; i++)
		{
			
			inputArray[i] = input.nextLong();
			
		}
		input.close();
		
		getMinMax(inputArray);
	}
	
	public static void getMinMax( long[] inputArray )
	{
		long minmaxArr[] = {0L , 0L}; 
		long sum = (inputArray[0]+inputArray[1]+inputArray[2]+inputArray[3]+inputArray[4]) , Tempsum = 0;
		minmaxArr[0] = sum;
		minmaxArr[1] = 0;
		
		for(long num : inputArray)
		{
			
			Tempsum = sum - num;
			if(Tempsum <= minmaxArr[0] ) 
			{
				
				minmaxArr[0] = Tempsum;
				
			}	
			if(Tempsum > minmaxArr[1]) {
				minmaxArr[1] = Tempsum;
			}
			
		}
		
		System.out.print(minmaxArr[0] +" ");
		System.out.print(minmaxArr[1]);
		
		
	}

}
