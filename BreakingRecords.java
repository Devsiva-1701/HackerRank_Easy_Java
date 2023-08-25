package javaPackage;

import java.util.Scanner;

public class BreakingRecords {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		int arr[] = new int[size];
		int maxcount = 0 , mincount = 0;
		for(int i=0 ; i<size;i++)
		{
			arr[i] = input.nextInt();
		}
		int  maxnum = arr[0];
		int minnum = arr[0];
		
		for(int i =0 ; i< size ; i++)
			
		{
			if(arr[i] > maxnum)
			{
				maxnum=arr[i];
				maxcount++;
			}
			else if (arr[i] < minnum) {
				minnum = arr[i];
				mincount++;
			}
		}
		System.out.print(maxcount);
		System.out.print(" "+mincount);
		
		input.close();

	}

}
