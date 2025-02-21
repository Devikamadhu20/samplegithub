package DataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class ExecuteNanSelectQueryTest {

	public static void main(String[] args) throws SQLException {
		Driver driverRef=new Driver();
	       DriverManager.registerDriver(driverRef);
	       Connection conn = DriverManager.getConnection("jdbc:mysql://49.249.28.218:3333/ninza_hrm", "root", "root");
	       System.out.println("------Done-----");
	       Statement stat=conn.createStatement();
	       stat.executeUpdate("insert into project values('NH_PROJ_2000','Madhu','09/01/2025','wish_02','on Going','100')");
           System.out.println("result");
           conn.close();
	}

}
