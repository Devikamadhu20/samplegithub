package Gherkins;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import POJO.Shoppers_login_POJO;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class ShoppersLogin 
{
	@Test
	public void post1() throws JsonProcessingException
	{
		
		Shoppers_login_POJO data=new Shoppers_login_POJO();

		
		data.setEmail("Devika1MQMD@gmail.com");
		data.setPassword("Dev#123");
		data.setRole("SHOPPER");
		
		
		ObjectMapper obj=new ObjectMapper();
		String jsonbody = obj.writerWithDefaultPrettyPrinter().writeValueAsString(data);
		System.out.println(jsonbody);
		
		Response res = RestAssured
		.given().baseUri("https://www.shoppersstack.com/shopping").body("jsonbody").contentType("application/json")
		.when().post("/users/login")
		.then().statusCode(200).and().statusLine("HTTP/1.1 200 ").extract().response();
		System.out.println(res.asPrettyString());
	}
	
			
	
	
}
