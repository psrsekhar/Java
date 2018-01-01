/*
 * This file is part of SSolutions framework.
 * File creation date: 29-Dec-2017
 */

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Sairam Sekhar P
 * @date 29-Dec-2017
 * 
 */
public class DateTime
{
	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// Current Date and Time using java.util.Date package
		Date utilDate = new Date();
		System.out.println("Java Util(Date) Package --> Date and Time : " + utilDate);

		// Current Date and Time using java.util.Date package
		Date calendarDate = java.util.Calendar.getInstance().getTime();
		System.out.println("Java Util(Calendar) Package --> Date and Time : " + calendarDate);
		
		// Current Date and Time using java.text.SimpleDateFormat package
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date formatDate = new Date();
		System.out.println("Java Text Package --> Date and Time : " + simpleDateFormat.format(formatDate));

		// Current Date and Time using java.time package
		System.out.println("Java Time package --> Date : " + java.time.LocalDate.now());
		System.out.println("Java Time package --> Time : " + java.time.LocalTime.now());

		// Current Date and Time using java.sql
		long milliSeconds = System.currentTimeMillis();
		java.sql.Date sqlDate = new java.sql.Date(milliSeconds);
		System.out.println("Java Sql package --> Date : " + sqlDate);
	}
}
