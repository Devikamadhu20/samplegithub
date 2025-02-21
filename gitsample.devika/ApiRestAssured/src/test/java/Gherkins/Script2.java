package Gherkins;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Script2 
{
	@Test
	public void post()
	{
		Response res = RestAssured.given().baseUri("https://reqres.in/").body("{\r\n"
				+ "    \"name\": \"morpheus\",\r\n"
				+ "    \"job\": \"leader\"\r\n"
				+ "}").contentType("application/json").
		when().post("/api/users").
		then().statusCode(201)
		.and().statusLine("HTTP/1.1 201 Created").extract().response();
		System.out.println(res.asPrettyString());
		
	}
	@Test
	public void get()
	{
//		Response res = RestAssured.given().baseUri("https://reqres.in/").
//				when().
				
	}
	

}
