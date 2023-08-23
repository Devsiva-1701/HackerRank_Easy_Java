package javaPackage;


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TimeConversion {
	
	public void convertTime12hrs(String time24hrs)
	{
		String time12hrs = "";
		int getTime;
		String convertTime = "";
		
		Pattern pattern = Pattern.compile("AM" , Pattern.CASE_INSENSITIVE);
		Matcher match = pattern.matcher(time24hrs);
		if (match.find()) {
			
			
			time12hrs += time24hrs.substring(0,time24hrs.length()-2);
			convertTime = time24hrs.substring(0,2);
			getTime = Integer.parseInt(convertTime);
			if(getTime == 12)
			{
				time12hrs = "";
				time12hrs += time24hrs.substring(2,time24hrs.length()-2);
				getTime = 0;
				System.out.println(Integer.toString(getTime)+0+time12hrs);
			}
			else {
				System.out.println(time12hrs);
			}
			
		}
		else {
			time12hrs += time24hrs.substring(2,time24hrs.length()-2);
			convertTime = time24hrs.substring(0,2);
			getTime = Integer.parseInt(convertTime);
			getTime = 12+getTime;
			if(getTime == 24)
			{
				
				getTime = 12;
				System.out.println(Integer.toString(getTime)+time12hrs);
			}
			else {
				System.out.println(Integer.toString(getTime)+time12hrs);
			}
			
		}
	}


	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String time24 = input.nextLine();

		input.close();
		
		TimeConversion obj = new TimeConversion();
		
		obj.convertTime12hrs(time24);
		
		

	}
	
	 
}
