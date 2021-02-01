package com.employeeapi.genaric;

import org.testng.Assert;
import org.testng.Reporter;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

/**
 * @author Raghavendras
 *
 */
public class GetResponse 
{
	public  Response response;

	public GetResponse(Response response)
	{
		this.response = response;
	}
	
	public String getResponseBody()
	{
		String responseBody = response.getBody().asString();
		Reporter.log("Response Body is : "+responseBody,true);
		return responseBody;
	}
	
	
	public int getStatusCode()
	{
		int statusCode = response.getStatusCode();
		Reporter.log("Status Code is :"+statusCode,true);
		return statusCode;
	}
	
	
	public String getStatusLine()
	{
		String statusLine = response.getStatusLine();
		Reporter.log("Status Line is :"+statusLine,true);
		return statusLine;
	}
	
	public String getContentType()
	{
		String contentType = response.header("Content-Type");
		Reporter.log("Content Type is :"+contentType,true);
		return contentType;
	}
	
	public long getResponseTime() 
	{
		long responseTime = response.getTime();
		Reporter.log("ResponseTime is :"+responseTime,true);
		return responseTime;
		
	}
	
	
	/*//Verify response Body city node
	 String city = response.jsonPath().get("City").toString();
	System.out.println(city);
	Assert.assertEquals(city, "Hyderabad");
	 
		 JsonPath JSONEVE = response.jsonPath();
		 Object data = JSONEVE.get("ad");
		 System.out.println(data);
	*
	*/
	
	
	

}
