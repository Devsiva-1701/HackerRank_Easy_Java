package javaPackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sherlock_and_Squares {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		
		int size = input.nextInt();
		int num;
		
		
		
		List<ArrayList<Integer>> mainList = new ArrayList<>();
		
		for(int i =0 ; i < size ; i++)
		{
			List<Integer> array = new ArrayList<>();
			
			for(int j = 0 ; j < 2 ; j++)
			{
				num = input.nextInt();
				array.add( num );	
			}

			mainList.add((ArrayList<Integer>)array);

		}
		input.close();
		
		for(int i =0 ; i < mainList.size(); i++)
		{
			
			System.out.println(getsquares( mainList.get(i).get(0) , mainList.get(i).get(1) ));
			
			
		}
		

	}
	
	public static int getsquares( int a , int b ) 
	{
		
		if (a > b) {
	        return 0; 
	    }
	    return (int)(Math.floor(Math.sqrt(b)) - Math.ceil(Math.sqrt(a)) + 1);
		
	}

}
