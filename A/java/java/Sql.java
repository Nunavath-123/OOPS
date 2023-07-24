package java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Sql {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/upendar","root","root");
			Statement st=c.createStatement();
			int i=st.executeUpdate("create table gullycricket(id int,name varchar(30),score int)");
		}
		catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
			}
	}


