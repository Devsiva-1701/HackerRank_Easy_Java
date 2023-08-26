package javaPackage;

import java.io.*;
import java.util.concurrent.atomic.AtomicInteger;


class Res {


    public static int countingValleys(int steps, String path) {
    	
    	AtomicInteger seaLevel_Atomic = new AtomicInteger(0);
    	AtomicInteger valleys_Atomic = new AtomicInteger(0);
    	
    	
    	path.chars().forEach( character -> {
    		
    		if(character == 'U')
    		{
    			 seaLevel_Atomic.incrementAndGet() ;
    			 if(seaLevel_Atomic.get() == 0)
    			 {
    				 valleys_Atomic.incrementAndGet();
    			 }
    			 
    		}
    		else {
				seaLevel_Atomic.decrementAndGet();
				
			}
    		
    		
    	} );
    	
    	return valleys_Atomic.get();

    }

}

public class Counting_Valleys {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int steps = Integer.parseInt(bufferedReader.readLine().trim());

        String path = bufferedReader.readLine();

        int result = Res.countingValleys(steps, path);

        System.out.println(result);

        bufferedReader.close();
        
    }
}

