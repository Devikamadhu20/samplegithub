package Runner_propertyfile;

import java.io.IOException;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import utils.Get_variables;

public class reqres_runner
{
   @Test
   public void listusers() throws IOException
   {
	   Get_variables v=new Get_variables();
	   String baseurl = v.getvar("baseurl");
	   System.out.println(baseurl);
	   String endpt = v.getvar("endpoint_LU");
	   Response res = RestAssured.given().baseUri(baseurl).when().get(endpt).then().statusCode(200).extract().response();
	   System.out.println(res.asPrettyString());
   }
}
