package utils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class Get_variables 
{
	@Test
	public String getvar(String key) throws IOException
	{
		FileInputStream fis=new FileInputStream("./property_file/Reqres.properties");
		Properties p=new Properties();
		p.load(fis);
		String value = p.getProperty(key);
		return value;
		
	}
	@Test
	public Object store(String key,String value) throws IOException
	{
		FileOutputStream fos=new FileOutputStream("./property_file/Reqres.properties",true);
		Properties p=new Properties();
		Object store = p.setProperty(key, value);
		p.store(fos, "store the data");
		return store;
		}

}
