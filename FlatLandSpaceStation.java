package javaPackage;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class FlatLandSpaceStation {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int totalcities = input.nextInt();
		int totalSpaceStations = input.nextInt();
		int spaceStations[] = new int[totalSpaceStations];
		for(int i =0 ; i< totalSpaceStations ; i++)
		{
			spaceStations[i] = input.nextInt();
		}
		
		System.out.println(getMaxDistance( totalcities ,spaceStations ));
	}
	
	private static int getMaxDistance(  int totalcities , int spaceStations[] )
	{
		int maxDistance = -1;
        Arrays.sort(spaceStations);
        for(int i =0 ; i < spaceStations.length-1 ; i++ )
        {
            maxDistance = Math.max(maxDistance, ((spaceStations[i+1] - spaceStations[i])/2));
        }
        
         maxDistance = Math.max(maxDistance, (totalcities-1) - spaceStations[spaceStations.length-1] );
        
        return Math.max(maxDistance , spaceStations[0]);
	}

}

/* Explanation : 
 * 	
 * First I am initializing the maximum Distance as -1 after that I am sorting the array as the space stations from the 
 * 	hacker rank input may not sure that they are in ascending order.
 * 
 * I am taking the maximum distance between spaceStations first because we can get the max distance between the
 * 	spaceStations by the middle city (i.e median).
 * 
 * After taking the maximum distance among the space Stations I need to ensure that the first city and last city
 * 	have less distance than the maximum distance that we found among the stations because it is uncertain that may be
 * 	the first city may be a spaceStation or may not be as well as the last city.
 *  
 * So I also need to check the distance between the last city to the last space station 
 * 
 * 				maxDistance = Math.max(maxDistance, (totalcities-1) - spaceStations[spaceStations.length-1] );
 * 
 * and the first city to the first spaceStation by this
 * 
 * 				return Math.max(maxDistance , spaceStations[0]);
 * 
 * here spaceStaions[0] mentioned because if I have the space Station number as 4 I have 4 cities before the spaceStation.
 *  
 * so that I can fetch the max distance and return the distance.
 * 
 * Happy coding..!!
 *  */
