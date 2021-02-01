package com.employeeapi.tests;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.employeeapi.genaric.AutoConstants;
import com.employeeapi.genaric.GetResponse;

import io.restassured.RestAssured;
import io.restassured.http.Method;

public class GetSingleEmployee  extends AutoConstants 
{
	@Test 
	public void getSingleEmployee()
	{
		int empId = 99;
		RestAssured.baseURI = "http://dummy.restapiexample.com/api/v1";
		
		httpRequest = RestAssured.given();
		
		response = httpRequest.request(Method.GET,"/employee/91");
		
		GetResponse getresponse = new GetResponse(response);
		
		
		getresponse.getResponseBody();
		
		Assert.assertEquals(getresponse.getStatusCode(), 200);
		
		Assert.assertEquals(getresponse.getStatusLine(), "HTTP/1.1 200 OK");
		
		Assert.assertEquals(getresponse.getContentType(), "application/json;charset=utf-8");
		
		Assert.assertTrue(getresponse.getResponseTime()<2000);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
