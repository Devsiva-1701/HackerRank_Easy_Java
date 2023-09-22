package javaPackage;

import java.util.Scanner;

public class InsertionSortAlgorithm {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int size = input.nextInt();
		int array[] = new int[size];
		
		for(int i =0 ; i< size ; i ++)
		{
			
			array[i] = input.nextInt();
			
		}
		
		insertionSort(array);
		

	}

	private static void insertionSort(int[] array) {
		
		for(int i = 1 ; i<array.length ; i++)
		{
			
			int tempCharacter = array[i];
			int j = i - 1;
			while( j>=0 && array[j] > tempCharacter  )
			{
				array[j+1] = array[j];
				j--;
			}

				array[j+1] = tempCharacter;
				
			

		}
		
		System.out.println("result : \n");
		for(int num : array)
		{
			System.out.print(num +" ");
		}
		
	}
	
	

}
