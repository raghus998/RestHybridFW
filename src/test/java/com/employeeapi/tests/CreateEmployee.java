package com.employeeapi.tests;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.employeeapi.genaric.AutoConstants;
import com.employeeapi.genaric.GetResponse;
import com.employeeapi.utilities.RestUtilis;

import io.restassured.RestAssured;
import io.restassured.http.Method;

public class CreateEmployee extends AutoConstants
{
	@Test
	public void createEmployee()
	{
		String eName = RestUtilis.empName();
		String eAge = RestUtilis.empAge();
		String eSal = RestUtilis.empSal();
		
		RestAssured.baseURI = "http://dummy.restapiexample.com/api/v1";
		
		httpRequest = RestAssured.given();
		//response = httpRequest.request(Method.POST,"/create");
		
		JSONObject requestParameters = new JSONObject();
		requestParameters.put("name", eName);
		requestParameters.put("salary", eSal);
		requestParameters.put("age", eAge);
		
		httpRequest.header("Content-Type","application/json");
		
		httpRequest.body(requestParameters.toJSONString());
		
		response = httpRequest.request(Method.POST, "/create");
		
		GetResponse getresponse = new GetResponse(response);
		getresponse.getResponseBody();
		
	}

}
