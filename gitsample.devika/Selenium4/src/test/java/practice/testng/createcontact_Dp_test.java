package practice.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class createcontact_Dp_test {
	@Test(dataProvider = "getData")
	public void createContactTest(String firstName, String lastName,long phNo) {
		System.out.println("FirstName:"+ firstName+",LastName:"+lastName+",PhoneNumber:"+phNo);
		
	}
	@DataProvider
	public Object[][] getData() {
		Object[][] objArr=new Object[3][3];
		objArr[0][0]="Devika";
		objArr[0][1]="M";
		objArr[0][2]=9867564536l;
		
		objArr[1][0]="sam";
		objArr[1][1]="sh";
		objArr[1][2]=986757536l;
		
		objArr[2][0]="Jhon";
		objArr[2][1]="Steve";
		objArr[2][2]=9867564678l;
		
		return objArr;
		
	}

}