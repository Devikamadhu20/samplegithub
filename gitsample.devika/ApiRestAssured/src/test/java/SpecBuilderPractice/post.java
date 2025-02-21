package SpecBuilderPractice;

import org.hamcrest.Matchers;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class post 
{
    @BeforeMethod
    public RequestSpecification request(String url, String body,String content)
    {
    	
		RequestSpecBuilder s=new RequestSpecBuilder();
    	 RequestSpecification req = s.setBaseUri(url).setBody(body).setContentType(content).build();
    	 return req;	
    }
    @AfterMethod
    public ResponseSpecification response(int code,String line,String bkey,String bvalue,long time,
    		
    		String hkey,String hvalue,String content)
    {
    	ResponseSpecBuilder s=new ResponseSpecBuilder();
    	ResponseSpecification res = s.expectStatusCode(code)
    	.expectStatusLine(line)
    	.expectBody(bkey,Matchers.equalTo(bvalue))
    	.expectResponseTime(Matchers.lessThanOrEqualTo(time))
    	.expectHeader(hkey, Matchers.equalTo(hvalue))
    	.expectContentType(content).build();
    	return res;
    	}
}
