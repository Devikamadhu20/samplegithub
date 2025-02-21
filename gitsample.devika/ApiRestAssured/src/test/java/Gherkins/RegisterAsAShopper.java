package Gherkins;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import POJO.CreateShopperPojo;
import POJO.Shoppers_login_POJO;
import io.restassured.RestAssured;
import io.restassured.config.ObjectMapperConfig;
import io.restassured.response.Response;

public class RegisterAsAShopper
{
	String  randomemail;
	
@Test
public void post() throws JsonProcessingException
{
	String random = RandomStringUtils.randomAlphanumeric(6);
	randomemail = random+"@gmail.com";
	
	CreateShopperPojo data=new CreateShopperPojo();
	data.setCity("Bangalore");
	data.setCountry("India");
	data.setEmail(randomemail);
	data.setFirstName("Devika");
	data.setGender("FEMALE");
	data.setLastName("Madhu");
	data.setPassword("Devvv&456");
	data.setPhone("9876564478");
	data.setState("Karnataka");
	data.setZoneId("ALPHA");
	
	ObjectMapper obj=new ObjectMapper();
	String jsonbody = obj.writerWithDefaultPrettyPrinter().writeValueAsString(data);
	System.out.println(jsonbody);
	
	Response res = RestAssured
	.given().baseUri("https://www.shoppersstack.com/shopping")
	.body(jsonbody).contentType("application/json")
	.when().post("/shoppers")
	.then().statusCode(201).and().statusLine("HTTP/1.1 201 ").extract().response();
	System.out.println(res.asPrettyString());
	}



	
	
}


