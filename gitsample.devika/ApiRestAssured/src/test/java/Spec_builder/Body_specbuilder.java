package Spec_builder;

import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.hamcrest.text.MatchesPattern;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.specification.RequestSpecification;

public class Body_specbuilder
{
    @BeforeMethod
    public RequestSpecification create_request(String url,String body,String content)
    {
    	RequestSpecBuilder spec =new RequestSpecBuilder();
    	RequestSpecification req = spec.setBaseUri(url).setBody(body).setContentType(content).build();
    	return req;
    }
    @AfterMethod
    public ResponseSpecBuilder create_response(int code,String line,String Header,String head_value,
    		String body,String body_value,long time,String content)
    {
    	ResponseSpecBuilder spec=new ResponseSpecBuilder();
    	ResponseSpecBuilder res = spec.expectStatusCode(code).expectStatusLine(line).expectHeader(Header, Matchers.equalTo(head_value))
    	.expectResponseTime(Matchers.equalTo(500l)).expectContentType(content).expectBody(body, Matchers.equalTo(body_value));
    	return res;
    	
    }
}
