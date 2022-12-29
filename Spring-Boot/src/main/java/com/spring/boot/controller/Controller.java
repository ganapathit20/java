package com.spring.boot.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.boot.model.Registraction;
import com.spring.boot.model.Student;
import com.spring.boot.service.Service;

@RestController
public class Controller {

	private static boolean status = false;
	// private static boolean regStatus = false;
	// private final static String uName = "admin";
	// private final static String uPass = "admin";

	@PostMapping("/registration")
	public static String registration(@RequestBody Registraction reg) {
		boolean statusLogin = Service.registration(reg);

		return (statusLogin) ? "Registration Successfully." : "error occure...";
	}

	@PostMapping("/login")
	public static String login(@RequestBody Registraction reg) {

		boolean statusLogin = Service.logIn(reg.getuName(), reg.getuPass());

		if (statusLogin) {
			status = true;
			System.out.println("UserName : " + reg.getuName() + " Password : " + reg.getuPass());
			return "login succussfully...";
		} else {
			status = false;
			return "user not register...";
		}
	}

	@GetMapping("/getAllInfo")
	public static List<Map<String, Object>> getAllInfo() throws Exception {
		if (status) {
			return Service.getAllInfo();
		}

		List<Map<String, Object>> stu = new ArrayList<Map<String, Object>>();
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("status", false);
		map.put("result", "Invalid Login...");
		stu.add(map);
		return stu;

	}

	@PostMapping("/insertStudentInfo")
	public static Map<String, Object> insertStudentInfo(@RequestBody Student student) throws Exception {
		Map<String, Object> map = new HashMap<String, Object>();
		if (status) {
			return Service.insertStudentInfo(student);
		}else {
			map.put("status", false);
			map.put("result", "Invalid Login...");
		}
		return map;
	}
	

}
