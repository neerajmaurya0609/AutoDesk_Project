package practice.ddt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

import com.mysql.cj.jdbc.Driver;

public class DatabaseUtils {
	/*@Test
	public void getExecuteQuery() throws SQLException{
		//step1: resister the database
		Driver driverref=new Driver();
		DriverManager.registerDriver(driverref);
		
		//step2: establish connection with database
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/customers", "root","root");
		
		//step3: Issue create statement
		Statement stat = con.createStatement();
		
		//step4:Execute any query
		ResultSet res = stat.executeQuery("select * from customer;");
		while(res.next()) {
			System.out.println(res.getString(1)+"\t"+res.getString(2));
		}		
		//step5:close database connection
		con.close();
	}*/
	@Test
	public void getExecuteUpdate() throws SQLException{
		//step1: resister the database
		Connection con = null;
		try {
		Driver driverref=new Driver();
		DriverManager.registerDriver(driverref);
		
		//step2: establish connection with database
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/customers", "root","root");
		
		//step3: Issue create statement
		Statement stat = con.createStatement();
		
		//step4:Execute any query
		int res = stat.executeUpdate("insert into customer value('raghvandra','raghvandra ojha','phulpur allahabad','allahabad',635647,'india')");
		
		//int res = stat.executeUpdate("delete from customer where CustomerName='raghvandra';");
		
		
		if(res==1) {
			System.out.println("update successfully updated");
		}
		else {
			System.out.println("query failed");
		}
		}
		catch(Exception e) {
			
		}
		finally {
		//step5:close database connection
		con.close();
		System.out.println("database closed");
		}
	}
	
	/*@Test
	public void getExecuteQueryValidate() throws SQLException{
		Connection con = null;
		try {
		//step1: resister the database
		Driver driverref=new Driver();
		DriverManager.registerDriver(driverref);
		
		//step2: establish connection with database
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/customers", "root","root");
		
		//step3: Issue create statement
		Statement stat = con.createStatement();
		
		//step4:Execute any query
		ResultSet res = stat.executeQuery("select * from customer;");
		int i=0;
		while(res.next()) {				
			String cName = res.getString(1);			
			if(cName.equals("neeraj")) {
				i++;
			}			
		}
		if(i>0) {
			System.out.println("present");
		}
		else {
			System.out.println("not present");
		}
		}
		catch(Exception e) {
			
		}
		//step5:close database connection
		finally {
		con.close();
		}
	}
	*/;

}
