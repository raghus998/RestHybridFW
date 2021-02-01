package com.employeeapi.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.employeeapi.genaric.AutoConstants;
import com.employeeapi.genaric.GetResponse;

import io.restassured.RestAssured;
import io.restassured.http.Method;

public class GetAllEmployeeDataTest  extends AutoConstants
{
	@Test
	public void getAllEmployee()
	{
		//Specify the URI
		RestAssured.baseURI = "http://dummy.restapiexample.com/api/v1";
		
		// Request object
		httpRequest = RestAssured.given();
		
		//Response object
		response = httpRequest.request(Method.GET,"/employees");
		
		//Verification methods
		GetResponse getresponse = new GetResponse(response);
		
		String aResponseBody = getresponse.getResponseBody();
		Assert.assertTrue(aResponseBody.contains("Tiger Nixon"));
		
		
		Assert.assertEquals(getresponse.getStatusCode(), 200);
		
		Assert.assertEquals(getresponse.getStatusLine(), "HTTP/1.1 200 OK");
		
		Assert.assertEquals(getresponse.getContentType(), "application/json;charset=utf-8");
		
		Assert.assertTrue(getresponse.getResponseTime()<2000);
		
		
		
		
		
		
		
		
	}

}
