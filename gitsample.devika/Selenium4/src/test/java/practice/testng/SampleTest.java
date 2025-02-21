package practice.testng;

import org.testng.annotations.Test;


public class SampleTest {
	@Test(priority = 1)
	public void createContactTest() {
		System.out.println("execute createContactTest");
		System.out.println(1/0);
		}
	
	
	@Test(priority = 2)
	public void modifyContact() {
		System.out.println("execute modifyContact ");
	}
	
	@Test(priority = 3)
	public void deleteContact() {
		System.out.println("execute deleteContact");
	}

}
