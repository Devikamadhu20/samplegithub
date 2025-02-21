package Runner;

import java.io.IOException;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import POJO.CreateShopperPojo;

import POJO.Shoppers_login_POJO;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import utils.Get_variables;

public class Shopper_runner 
{
	String randmail;
	@Test
	public void create() throws IOException
	{
		Get_variables v=new Get_variables();//get the properties
		Object baseurl = v.getvar("baseurl");
		
		
		String random = RandomStringUtils.randomAlphanumeric(5);
		 randmail = random+"@gmail.com";
		

		CreateShopperPojo data=new CreateShopperPojo();
		    data.setCity("Bangalore");
		    data.setCountry("India");
		    data.setEmail(randmail);
		    data.setFirstName("Devika");
		    data.setGender("MALE");
		    data.setLastName("Madhu");
		    data.setPassword("Devika@897");
		    data.setPhone("9845986678");
		    data.setState("Karnataka");
		    data.setZoneId("ALPHA");
		    
		    ObjectMapper obj=new ObjectMapper();
		    String jsonbody = obj.writerWithDefaultPrettyPrinter().writeValueAsString(data);
		    System.out.println(jsonbody);
		    
		    Response res = RestAssured.given().baseUri("https://www.shoppersstack.com/shopping").body(jsonbody).contentType("application/json")
		    .when().post("/shoppers").then().statusCode(201).statusLine("HTTP/1.1 201 ").extract().response();
		    System.out.println(res.asPrettyString());
		    
		    JsonPath jp=new JsonPath(res.asPrettyString());
		    Object id = jp.get("data.userId");
		    Object email = jp.get("data.email");
		    
		    
		    v.store("id",""+id+"");           //store the properties into propertyfile
		    v.store("email",""+email+"");
		    
		
	}
	@Test
	public void login() throws JsonProcessingException
	{
		//String random = RandomStringUtils.randomAlphanumeric(5);
		 //randmail = random+"@gmail.com";
		Shoppers_login_POJO data=new Shoppers_login_POJO();
		data.setEmail(randmail);
		data.setPassword("Devika@897");
		data.setRole("SHOPPER");
		
		ObjectMapper obj=new ObjectMapper();
		String jsonbody = obj.writerWithDefaultPrettyPrinter().writeValueAsString(data);
		System.out.println(jsonbody);
		
		
		Response res = RestAssured.given().baseUri("https://www.shoppersstack.com/shopping").body(jsonbody).contentType("application/json")
	    .when().post("/users/login").then().statusCode(200).statusLine("HTTP/1.1 200 ").extract().response();
	    System.out.println(res.asPrettyString());
	    
	    
		
		
       
	}

}
