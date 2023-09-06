package javaPackage;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PickingNumbers_App_1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		int array[] = new int[size];
		
		for(int i =0 ; i <size ; i++)
		{
			
			array[i] = input.nextInt();
			
		}
		
		getmax(setmap(array) , array);
		
	}
	
	private static HashMap<String, Integer> setmap(int[] array )
	{
		
		String key;
		Map<String, Integer> arrayMap = new HashMap<>();
		for(int num : array)
		{
			key = Integer.toString(num);
			if(arrayMap.containsKey(key))
			{
				int value = arrayMap.get(key);
				arrayMap.replace(key, value+1);
			}
			else {
				arrayMap.put(key, 1);
			}
			
		}
		
		return (HashMap<String, Integer>) arrayMap;
		
	}
	
	private static void getmax( HashMap<String, Integer> arrayMap , int[] array )
	{
		
		int sum = 0 , max = 0;
		
		for( int num : array )
		{
			
			if( arrayMap.containsKey(Integer.toString(num+1)) )
			{
				
				sum += arrayMap.get(Integer.toString(num+1));
				
			}
			if( arrayMap.containsKey(Integer.toString(num)) )
			{
				sum += arrayMap.get(Integer.toString(num));
			}
			
			if(sum > max)
			{
				max = sum;
			}
			
			sum = 0;
		}
		
		System.out.println(max);
		
		
	}

}
