package com.employeeapi.utilities;

import org.apache.commons.lang3.RandomStringUtils;

public class RestUtilis 
{
	public static String empName()
	{
		String randomString = RandomStringUtils.randomAlphabetic(1);
		return ("RS"+randomString);
	}
	
	public static String empSal()
	{
		String empsal = RandomStringUtils.randomNumeric(5);
		return empsal;
	}
	
	public static String empAge()
	{
		return RandomStringUtils.randomNumeric(2);
	}

}
