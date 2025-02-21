package Shoppersstack;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Register_Shopper
{
	
   @Test
   public void create()
   {
	   RestAssured.baseURI="https://www.shoppersstack.com/shopping";
	   RequestSpecification req = RestAssured.given();
	   JSONObject obj=new JSONObject();
	   obj.put("city", "Bangalore");
	   obj.put("country", "India");
	   obj.put("email", "dev612@gmail.com");
	   obj.put("firstName", "devika");
	   obj.put("gender", "FEMALE");
	   obj.put("lastName", "madhu");
	   obj.put("password", "Devu@6219");
	   obj.put("phone", "9876543421");
	   obj.put("state", "karnataka");
	   obj.put("zoneId", "ALPHA");
	   req.contentType("application/json");
		req.body(obj.toJSONString());
		Response res = req.request(Method.POST,"/shoppers");
		System.out.println(res.asPrettyString());
		System.out.println(res.statusCode());
		System.out.println("create method is pass");
	   }
   @Test
   public void login()
	{
		RestAssured.baseURI="https://www.shoppersstack.com/shopping";
		   RequestSpecification req = RestAssured.given();
		   JSONObject obj=new JSONObject();
		   obj.put("email", "dev612@gmail.com");
		   obj.put("password", "Devu@6219");
		   obj.put("role", "SHOPPER");
		   req.contentType("application/json");
			req.body(obj.toJSONString());
			Response res = req.request(Method.POST,"/users/login");
			System.out.println(res.asPrettyString());
			System.out.println(res.statusCode());
			System.out.println("login method is pass");
		}
   @Test
   public void get()
   {
	   RestAssured.baseURI="https://www.shoppersstack.com/shopping";
	   RequestSpecification req = RestAssured.given().auth().oauth2("eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkZXY2MTJAZ21haWwuY29tIFNIT1BQRVIiLCJleHAiOjE3MzUxNjA2NDcsImlhdCI6MTczNTEyNDY0N30.gNJBwAMeD2o88lSA0f8Y7qUftUR98IGupexB6duQjXs");
	   Response res = req.request(Method.GET,"/shoppers/196350");
		System.out.println(res.asPrettyString());
		System.out.println(res.statusCode());
	   
   }
   
	
}
