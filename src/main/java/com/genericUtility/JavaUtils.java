package com.genericUtility;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class JavaUtils {

	/**
	 * This method is used to get random no.
	 * @author Vijayalaxmi
	 * @return
	 */
	public int getRandomNo()
	{
		Random ran = new Random();
		int random = ran.nextInt(100);
		return random;
	}
	
	/**
	 * This method is used to get system date
	 * @return
	 */
	public String getSystemDate()
	{
		Date dt = new Date();
		String date = dt.toString();
		return date;
	}
	
	/**
	 * This method is used to get system date in format
	 * @return
	 */
	public String getSystemDateInFormat()
	{
		SimpleDateFormat dateformat = new SimpleDateFormat("dd-MM-yyyy HH-mm-ss");
		Date dt = new Date();
		
		String SystemDateInFormat = dateformat.format(dt);
		return SystemDateInFormat;
	}
	
	
	
	
	
	
	
}
