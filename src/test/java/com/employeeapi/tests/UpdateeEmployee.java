package com.employeeapi.tests;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import com.employeeapi.genaric.AutoConstants;
import com.employeeapi.genaric.GetResponse;
import com.employeeapi.utilities.RestUtilis;

import io.restassured.RestAssured;
import io.restassured.http.Method;

public class UpdateeEmployee extends AutoConstants
{
	@Test
	public void updateEmployee()
	{
		String empId = "91";
		String eName = RestUtilis.empName();
		String eAge = RestUtilis.empAge();
		String eSal = RestUtilis.empSal();
		
		RestAssured.baseURI = "http://dummy.restapiexample.com/api/v1";
		
		httpRequest = RestAssured.given();
		JSONObject requestParameters = new JSONObject();
		requestParameters.put("name", eName);
		requestParameters.put("salary", eAge);
		requestParameters.put("age", eSal);
		
		httpRequest.header("Content-Type","application/json");
		
		httpRequest.body(requestParameters.toJSONString());
		
		response = httpRequest.request(Method.PUT, "/update/"+empId);
		
		GetResponse getresponse = new GetResponse(response);
		getresponse.getResponseBody();
		
	}
	

}
