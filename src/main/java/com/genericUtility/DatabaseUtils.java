package com.genericUtility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class DatabaseUtils {

	Connection con = null;
	
	public void connectToDB() throws SQLException
	{
	//1. Register the driver
	Driver driver = new Driver();
	DriverManager.registerDriver(driver);
	
	//2. get connection for database
	con = DriverManager.getConnection(IPathConstants.DBURL, IPathConstants.DBUsername, IPathConstants.DBPassword);
	}
	
	public String executeAndgetData(String query, int colIndex, String ExpData) throws SQLException
	{
		//3. Create statement
		Statement state = con.createStatement();
		
		//4. execute/update query
		ResultSet result = state.executeQuery(query);
		boolean flag = false;
		
		while(result.next())
		{
			String actual = result.getString(colIndex);
			
			if(actual.equalsIgnoreCase(ExpData))
			{
				flag = true;
				break;
			}
		}
		if(flag==true)
		{
			System.out.println(" Data verified");
			return ExpData;
		}
		else
		{
			System.out.println(" Exp data is not present");
			return "";
		}
	
	}
	
	public void closeDB() throws SQLException
	{
		
		//close database connection
		con.close();
	}
	
}
	

