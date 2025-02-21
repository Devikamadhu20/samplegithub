package SpecBuilderPractice;

import org.hamcrest.Matchers;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.specification.RequestSpecification;

public class get 
{
	  @BeforeMethod
	    public RequestSpecification request(String url)
	    {
	    	
			RequestSpecBuilder s=new RequestSpecBuilder();
	    	 RequestSpecification req = s.setBaseUri(url).build();
	    	 return req;	
	    }
	    @AfterMethod
	    public ResponseSpecBuilder response(int code,String line,String bkey,String bvalue,long time,String hkey,String hvalue,String content)
	    {
	    	ResponseSpecBuilder s=new ResponseSpecBuilder();
	    	s.expectStatusCode(code)
	    	.expectStatusLine(line)
	    	.expectBody(bkey,Matchers.equalTo(bvalue))
	    	.expectResponseTime(Matchers.lessThanOrEqualTo(time))
	    	.expectHeader(hkey, Matchers.equalTo(hvalue))
	    	.expectContentType(content).build();
	    	return s;
	    	}
	}


