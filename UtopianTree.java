package javaPackage;

import java.util.Scanner;

public class UtopianTree {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int height , cycle ;
		int testCases = input.nextInt();
		int arr[] = new int[testCases];
		for(int i =0 ; i <testCases ; i++)
		{
			
			cycle = input.nextInt();
			height = 0;
			
			for(int j =0 ; j<=cycle ; j++)
			{
				if(j%2 == 0)
				{
					height += 1;
					
				}
				else {
					height *= 2;
				}
			}

			
			arr[i] = height;
			
		}
		
		for(int num : arr)
		{
			
			System.out.println(num);
			
		}
		

	}

}
