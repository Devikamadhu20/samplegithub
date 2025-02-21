package Admin_specbuilder;

import org.hamcrest.Matchers;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class Post 
{
   @BeforeMethod
   public RequestSpecification request(String url,String body,String content)
   {
	  RequestSpecBuilder s=new RequestSpecBuilder();
	  RequestSpecification req = s.setBaseUri(url).setBody(body).setContentType(content).build();
	  return req;
   }
   
   @AfterMethod
   public ResponseSpecification response(int code,String line,String content,String b_key,String b_value,String h_key,String h_value,long time)
   {
	  ResponseSpecBuilder s=new ResponseSpecBuilder();
	  ResponseSpecification res = s.expectStatusCode(code)
	  .expectStatusLine(line)
	  .expectContentType(content)
	  .expectBody(b_key, Matchers.equalTo(b_value))
	  .expectHeader(h_key, Matchers.equalTo(h_value))
	  .expectResponseTime(Matchers.lessThanOrEqualTo(time)).build();
	  return res;
   }
}
