package RunnerPractice;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import SpecBuilderPractice.post;
import io.restassured.RestAssured;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import pojo_Practice.Register_pojo;

public class Shopper_profile_runner 
{
  
	  @Test
	  public void create() throws JsonProcessingException
	  {
		  String random = RandomStringUtils.randomAlphanumeric(3);
		  String remail = "Devika"+random+"@gmail.com";
		  
		  Register_pojo p=new Register_pojo();
		  p.setCity("Bangalore");
		  p.setCountry("India");
		  p.setEmail(remail);
		  p.setFirstName("Devika");
		  p.setGender("MALE");
		  p.setLastName("Madhu");
		  p.setPassword("Dev@675");
		  p.setPhone("9876456432");
		  p.setState("Karnataka");
		  p.setZoneId("ALPHA");
		  
		  
		  ObjectMapper obj=new ObjectMapper();
		  String jsonbody = obj.writeValueAsString(p);
		  
		  post po=new post();
		  
		  RequestSpecification req = po.request("https://www.shoppersstack.com/shopping", jsonbody, "application/json");
		  ResponseSpecification res = po.response(201, "HTTP/1.1 201 ", "message", "Created", 3l, 
				  "Server", "nginx", "application/json");
	     RestAssured.given().spec(req).when().post("/shoppers").then().spec(res).log().all();
      }
}
