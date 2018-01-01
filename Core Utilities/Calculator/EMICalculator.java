/*
 * This file is part of SSolutions framework.
 * File creation date: 28-Dec-2017
 */

import java.util.Scanner;

/**
 * @author Sairam Sekhar P
 * @date 28-Dec-2017
 * 
 */
public class EMICalculator
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		 //Scanner class to take user input.
        Scanner scanner = new Scanner(System.in);
         
        double principal, rate, time, emi;
  
        System.out.print("Enter principal: ");
        principal = scanner.nextFloat();
      
        System.out.print("Enter rate: ");
        rate = scanner.nextFloat();
      
        System.out.print("Enter time in year: ");
        time = scanner.nextFloat();
      
        //close the scanner input stream
        scanner.close();
        
        rate=rate/(12*100); /*one month interest*/
        time=time*12; /*one month period*/
      
      
        emi= (principal*rate*Math.pow(1+rate,time))/(Math.pow(1+rate,time)-1);
      
        System.out.print("Monthly EMI is= "+emi+"\n");
	}
}
