package DataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class ExecuteSelectQueryTest {

	public static void main(String[] args) throws SQLException 
	{
		
       Driver driverRef=new Driver();
       DriverManager.registerDriver(driverRef);
       Connection conn = DriverManager.getConnection("jdbc:mysql://49.249.28.218:3333/ninza_hrm", "root", "root");
       System.out.println("------Done-----");
       Statement stat=conn.createStatement();
       ResultSet resultset = stat.executeQuery("select * from project");
       while(resultset.next()) {
    	 
    		  System.out.println(resultset.getString(1)+"\t"+resultset.getString(2)+"\t"+resultset.getString(3)+"\t"+resultset.getString(4)+"\t"+resultset.getString(5)+"\t"+resultset.getString(6));
    	  }
       
       conn.close();
	}

}
