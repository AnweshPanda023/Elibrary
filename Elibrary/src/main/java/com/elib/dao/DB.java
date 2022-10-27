package com.elib.dao;

import java.sql.*;

public class DB {
public static Connection getCon(){
	Connection con=null;
	try{
		  //loading drivers for mysql
        Class.forName("com.mysql.cj.jdbc.Driver");

        //creating connection with the database
        con= DriverManager.getConnection("jdbc:mysql://localhost:3306/elibrary","root","Ansh@2323");
		
	}catch(Exception e){System.out.println(e);}
	return con;
}
}
