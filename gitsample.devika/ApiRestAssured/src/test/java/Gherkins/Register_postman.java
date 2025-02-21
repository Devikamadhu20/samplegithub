package Gherkins;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;


public class Register_postman
{
	String Email;
	String userid;
	String token;
	@Test(priority = 0)
	public void create()
	{
		String random = RandomStringUtils.randomAlphanumeric(5);
		String email = "Devika"+random+"@gmail.com";
		Response res = RestAssured.given().baseUri("https://www.shoppersstack.com/shopping").
		body("{\r\n"
				
				+ "  \"city\": \"Bangalore\",\r\n"
				+ "  \"country\": \"India\",\r\n"
				+ "  \"email\": \""+email+"\",\r\n"
				+ "  \"firstName\": \"Madhu\",\r\n"
				+ "  \"gender\": \"FEMALE\",\r\n"
				+ "  \"lastName\": \"Madhusudhankumar\",\r\n"
				+ "  \"password\": \"Dev#123\",\r\n"
				+ "  \"phone\": 9863878937,\r\n"
				+ "  \"state\": \"karnataka\",\r\n"
				+ "  \"zoneId\": \"ALPHA\"\r\n"
				+ "}").contentType("application/json").when().post("/shoppers").then().statusCode(201).extract().response();
		System.out.println(res.asPrettyString());
		System.out.println("create method is pass");
		
		
		JsonPath jp=new JsonPath(res.asPrettyString());
		Email = jp.getString("data.email");
		System.out.println("Email");
	}
		@Test(priority = 1,  dependsOnMethods= {"create"})
		
		public void login()
		{
			Response res = RestAssured.given().baseUri("https://www.shoppersstack.com/shopping")
					.body("{\r\n"
							+ "  \"email\": \""+Email+"\",\r\n"
							+ "  \"password\": \"Dev#123\",\r\n"
							+ "  \"role\": \"SHOPPER\"\r\n"
							+ "}").contentType("application/json").when().post("/users/login")
			.then().statusCode(200).statusLine("HTTP/1.1 200 ").extract().response();
			System.out.println(res.asPrettyString());
			System.out.println("login method is pass");
			
			JsonPath jp=new JsonPath(res.asPrettyString());
		     userid = jp.getString("data.userId");
		     System.out.println("userid");
		    token = jp.getString("data.jwtToken");
		  
		}
		@Test(priority = 2)
		public void get()
		{
			Response res = RestAssured.given().baseUri("https://www.shoppersstack.com/shopping")
			.auth().oauth2(token)
			.when().get("/shoppers/"+userid).then().statusCode(200).statusLine("HTTP/1.1 200 ").extract().response();
			System.out.println(res.asPrettyString());
			
		}
		@Test(priority = 3)
		public void update()
		{
			Response res = RestAssured.given().baseUri("https://www.shoppersstack.com/shopping").body("{\r\n"
					+ "  \"city\": \"Bangalore\",\r\n"
					+ "  \"country\": \"India\",\r\n"
					+ "  \"email\": \""+Email+"\",\r\n"
					+ "  \"firstName\": \"Madhusudhankumar\",\r\n"
					+ "  \"gender\": \"MALE\",\r\n"
					+ "  \"lastName\": \"Madhu\",\r\n"
					+ "  \"password\": \"Dev#123\",\r\n"
					+ "  \"phone\": 9987656785,\r\n"
					+ "  \"state\": \"karnataka\",\r\n"
					+ "  \"zoneId\": \"ALPHA\"\r\n"
					+ "}").contentType("application/json").auth().oauth2(token).
			when().patch("/shoppers/"+userid).then().statusCode(200).statusLine("HTTP/1.1 200 ").extract().response();
			System.out.println(res.asPrettyString());
			System.out.println("update method is passed");
		}
		@Test(priority=4)
		public void verify_account()
		{
			Response res = RestAssured.given().baseUri("https://www.shoppersstack.com/shopping").header("password","Dev#123")
			.queryParam("token", token).when().post("/users/verify-account").then().statusCode(200).extract().response();
			System.out.println(res.asPrettyString());
			System.out.println("verify-account is passed");
			
		}
		
		
}

