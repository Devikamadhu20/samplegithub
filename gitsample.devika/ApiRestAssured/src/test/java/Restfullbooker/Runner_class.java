package Restfullbooker;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Runner_class 
{
    @Test
    public void post() throws JsonProcessingException
    {
    	Pojo_create p=new Pojo_create();
    	p.setFirstname("Devika");
    	p.setLastname("Madhu");
    	p.setTotalprice(111);
    	p.setDepositpaid(true);
    	
    	Pojo_bookingdates bd=new Pojo_bookingdates();
    	bd.setCheckin("2018-01-01");
    	bd.setCheckout("2019-01-01");
    	p.setBookingdates(bd);
    	p.setAdditionalneeds("Breakfast");

	    ObjectMapper obj=new ObjectMapper();
	    String jsonbody = obj.writeValueAsString(p);
	    System.out.println(jsonbody);
	    
	    Response res = RestAssured.given().body(jsonbody).contentType("application/json")
	    .when().post("https://restful-booker.herokuapp.com/booking").then().statusCode(200).statusLine("HTTP/1.1 200 OK").extract().response();
	    System.out.println(res.asPrettyString());
    	
    			
    }
}
