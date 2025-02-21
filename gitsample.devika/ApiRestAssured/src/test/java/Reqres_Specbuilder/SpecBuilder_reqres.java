package Reqres_Specbuilder;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class SpecBuilder_reqres
{
     @BeforeMethod
     public RequestSpecification request()
     {
    	 RequestSpecBuilder spec=new RequestSpecBuilder();
    	 RequestSpecification req = spec.setBaseUri("https://reqres.in/")
    	 .setBody("{\r\n"
    	 		+ "    \"name\": \"morpheus\",\r\n"
    	 		+ "    \"job\": \"leader\"\r\n"
    	 		+ "}")
    	 .setContentType("application/json").build();
    	 return req;
     }
    	 
    	 @AfterMethod
    	 public ResponseSpecification response()
    	 {
    		  ResponseSpecBuilder spec=new ResponseSpecBuilder();
    		  ResponseSpecification res = spec.expectStatusCode(201).expectStatusLine("HTTP/1.1 201 Created").build();
    		   return res;

         }
		
     }

