package spring.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Run {

	public static void main(String[] args) {

		try {

			String url = "jdbc:mysql://localhost:8080/test";
			String uName = "root";
			String uPass = "welcome123";
			String query = "select * from demo";

			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection(url, uName, uPass);

			Statement sta = con.createStatement();

			ResultSet rs = sta.executeQuery(query);

			while (rs.next()) {

				System.out.println(rs.getInt(1) + " : " + rs.getString("name"));

			}
		} catch (Exception ex) {

			System.out.println(ex.toString());

		}

	}

}
