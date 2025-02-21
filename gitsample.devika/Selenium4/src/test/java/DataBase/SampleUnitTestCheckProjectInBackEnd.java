package DataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.mysql.jdbc.Driver;

public class SampleUnitTestCheckProjectInBackEnd
{
   @Test
   public void projectcheckTest() throws SQLException
   {
	   String expectedProjectName="wish_02";
	   boolean flag=false;
	   Driver driverRef=new Driver();
       DriverManager.registerDriver(driverRef);
       Connection conn = DriverManager.getConnection("jdbc:mysql://49.249.28.218:3333/ninza_hrm", "root", "root");
       System.out.println("------Done-----");
       Statement stat=conn.createStatement();ResultSet resultset = stat.executeQuery("select * from project");
       while(resultset.next()) {
    	   String actualProjectName = resultset.getString(4);
    	   if(expectedProjectName.equals(actualProjectName))
    	   {
    		   flag=true;
    		   System.out.println(expectedProjectName+"is available====PASS");
    	   }
       }
       if(flag==false)
       {
    	   System.out.println(expectedProjectName+"is not available====FAIL");
    	   Assert.fail();
       }
       conn.close();
   }
}
