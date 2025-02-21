package reqres;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class ToPerformPost

{
	@Test(priority = 0)
	public void post()
	{
		RestAssured.baseURI="https://reqres.in/";
	RequestSpecification req = RestAssured.given();
	JSONObject obj=new JSONObject();
	obj.put("name", "morpheus");
	obj.put("job", "leader");
	req.contentType("application/json");
	req.body(obj.toJSONString());
	Response res = req.request(Method.POST,"api/users");
	System.out.println(res.asPrettyString());
	System.out.println(res.statusCode());
	System.out.println("POST Method");
	}
	@Test(priority = 2)
	public void edit()
	{
		RestAssured.baseURI="https://reqres.in/";
	RequestSpecification req = RestAssured.given();
	JSONObject obj=new JSONObject();
	obj.put("name", "morpheus");
	obj.put("job", "leaders");
	req.contentType("application/json");
	req.body(obj.toJSONString());
	Response res = req.request(Method.PUT,"api/users/2");
	System.out.println(res.asPrettyString());
	System.out.println(res.statusCode());
	System.out.println("PUT Method");
	}
	
	
		@Test(priority = 1)
		public void swalpa_edit()
		{
			RestAssured.baseURI="https://reqres.in/";
		RequestSpecification req = RestAssured.given();
		JSONObject obj=new JSONObject();
		obj.put("name", "morpheus");
		obj.put("jobs", "leader");
		req.contentType("application/json");
		req.body(obj.toJSONString());
		Response res = req.request(Method.POST,"api/users/2");
		System.out.println(res.asPrettyString());
		System.out.println(res.statusCode());
		System.out.println("PATCH Method");
		}

}