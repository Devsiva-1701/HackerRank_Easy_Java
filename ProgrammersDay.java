package javaPackage;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ProgrammersDay {

	public static void main(String[] args) {
		
		int days = 30;
		Map<String, Integer> monthmap = new HashMap<>() ;
		for(int i =1 ; i<8 ; i++ )
		{
			if(days==31)
			{
				monthmap.put(Integer.toString(i) , 30 );
				days = 30;
			}
			else {
				monthmap.put(Integer.toString(i) , 31 );
				days = 31;
			}
			
		}
		monthmap.put("8", 31);
		
		Scanner input = new Scanner(System.in);
		int year = input.nextInt();
		
		getprogrammerday(year, monthmap);
		

	}
	
	static void getprogrammerday( int getyear , Map<String, Integer>monmap )
	{
		int lastTwoDigits = getyear % 100 ;
		int totalDays = 0;
		if(getyear == 1800 || getyear == 1700 || getyear == 1900)
		{
			System.out.println("12.09."+ Integer.toString(getyear));
		}
		else if (getyear == 1918) {
			monmap.put("2", 28);
			for(int day : monmap.values())
			{
				
				totalDays = totalDays + day;
			}
			System.out.println(Integer.toString((256-totalDays)+13)+".09."+Integer.toString(getyear)); 
//			14 is 32nd day of the year in Julian calender Feb 14.1918 So in Gregorian calender it is Feb 27.1918
//			and we got 13 day difference so I used the +13 to caLculate the day correctly and 1918 is not a leap year so we got Feb : 28 days.
				
		}
		else {
			if(lastTwoDigits == 0)	
			{
				if((getyear % 400) == 0)
				{
					
					monmap.put("2", 29);
				}
				else {
					monmap.put("2", 28);
				}
			}
			else {
				if((lastTwoDigits % 4) == 0)
				{
					monmap.put("2", 29);
				}
				else {
					monmap.put("2", 28);
				}
			}
			
		
			for(int day : monmap.values())
			{
				
				totalDays = totalDays + day;
			}
			
			System.out.println(Integer.toString(256-totalDays)+".09."+Integer.toString(getyear));
		}
		
	}

}
