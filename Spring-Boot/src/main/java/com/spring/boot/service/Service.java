package com.spring.boot.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.spring.boot.model.Registraction;
import com.spring.boot.model.Student;

public class Service {

	public static Connection getConnection() throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Login", "root", "welcome123");

		return connection;

	}

	public static boolean registration(Registraction reg) {
		try {
			if (reg != null) {

				PreparedStatement ps = getConnection().prepareStatement(
						"INSERT INTO registration(name, email, mobileno, uname, upass) VALUES (?,?,?,?,?)");
				ps.setString(1, reg.getName());
				ps.setString(2, reg.getEmail());
				ps.setString(3, reg.getMobileNo());
				ps.setString(4, reg.getuName());
				ps.setString(5, reg.getuPass());

				ps.executeUpdate();
				return true;
			}

		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return false;
	}

	public static boolean logIn(String uName, String uPass) {
		try {

			Statement statement = getConnection().createStatement();

			ResultSet resultSet = statement.executeQuery("select * from registration");

			while (resultSet.next()) {
				if (resultSet.getString("uName").equals(uName) && resultSet.getString("uPass").equals(uPass)) {
					// System.out.println(uName + " : " + uName);
					return true;
				}
			}

		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return false;
	}

	public static Map<String, Object> insertStudentInfo(Student student) {
		
		Map<String, Object> map = new HashMap<String, Object>();

		try {
			
			if ((student.getsName() != null) && (student.getRollNo() > 0) && (student.getDepartment() !=null)
					&& (student.getCollege() != null)) {
			PreparedStatement ps = getConnection().prepareStatement(
					"INSERT INTO Student(sNo, sName, rollNo, department, college) VALUES (?,?,?,?,?)");
			ps.setInt(1, student.getsNo());
			ps.setString(2, student.getsName());
			ps.setInt(3, student.getRollNo());
			ps.setString(4, student.getDepartment());
			ps.setString(5, student.getCollege());

			ps.executeUpdate();
			
			map.put("status", true);
			map.put("result", "Insert Done..");
			}else {
				map.put("status", false);
				map.put("result", "Invalid Input.");
			}
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return map;
	}

	public static List<Map<String, Object>> getAllInfo() {

		List<Map<String, Object>> stu = new ArrayList<Map<String, Object>>();
		try {
			Statement ps = getConnection().createStatement();
			ResultSet resultSet = ps.executeQuery("SELECT * FROM Student");

			while (resultSet.next()) {

				Map<String, Object> map = new HashMap<String, Object>();
				map.put("department", resultSet.getString("department"));
				map.put("college", resultSet.getString("college"));
				map.put("rollNo", resultSet.getString("rollNo"));
				map.put("sName", resultSet.getString("sName"));
				map.put("sNo", resultSet.getString("sNo"));
				stu.add(map);
			}

		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return stu;
	}
}
