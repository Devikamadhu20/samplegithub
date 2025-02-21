package Reqres_Specbuilder;

import io.restassured.specification.RequestSpecification;

public class Reqres_runner
{
	public void post()
	{
		SpecBuilder_reqres s=new SpecBuilder_reqres();
		RequestSpecification req = s.request();
	}
		
}
     


