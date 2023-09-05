package javaPackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AngryProfessor {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		List<String> mainarray = new ArrayList<>();
		List<Integer> array = new ArrayList<>();
		int innerList , threshold , queries;
		queries = input.nextInt();
		int thresholdNum[] = new int[queries];
		for(int i =0 ; i < queries ; i++)
		{
			
			innerList = input.nextInt();
			threshold = input.nextInt();
			thresholdNum[i] = threshold;
			for(int j = 0 ; j<innerList ; j++ )
			{
				array.add( j , input.nextInt());
			}
			mainarray.add(i,getclass(thresholdNum[i],(ArrayList<Integer>) array) );
			array.clear();
		}
		
		
		for(String str : mainarray)
		{
			System.out.println(str);
		}

	}
	
	public static String getclass(int k, ArrayList<Integer> array )
	{

		int count = 0;
		
		for(int a : array )
		{

			if( a<= 0 )
			{

				count++;
			}
			if(count == k )
			{

				return "NO";
			}
		}
		
		return "YES";
		
	}

}
