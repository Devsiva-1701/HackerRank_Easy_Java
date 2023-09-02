package javaPackage;

import java.util.Scanner;


public class DivisibleSumPairsApproach1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		int k = input.nextInt();
	
		int[] array = new int[n];
		
		for(int i = 0 ; i < n ; i++)
		{
			
			array[i] = input.nextInt();
			
		}
		System.out.println(getPairs(k, n, array));
		
	}
	
	public static int getPairs( int k , int n , int[] array)
	{
		
		int pairCount = 0;
		
		for(int i = 0 ; i< n-1 ; i++)
			
		{
			for(int  j = i+1 ; j<n ; j++)
			{
				if((array[i]+array[j]) % k == 0)
				{
					pairCount++;
				}
			}
		}
		
		return pairCount;
		
	}

}
