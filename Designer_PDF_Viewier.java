package javaPackage;

import java.util.Random;
import java.util.Scanner;

public class Designer_PDF_Viewier {

    public static void main(String[] args) {
        
        
        Scanner input = new Scanner(System.in);
        
        int[] array = new int[26];
        
        
        for(int i =0 ; i<26 ; i++)
        {
            array[i] = input.nextInt();
        }

        String userInput = input.next();
        
        int max = 0 ;
        
        for(int i = 0 ; i<userInput.length()-1 ; i++)
        {
            int num = (int) userInput.charAt(i);
           
            if( (array[num-97] ) > max )
            {
                max = array[num-97];
            }
        }
        
        System.out.println(max*userInput.length());
        
    }

}
