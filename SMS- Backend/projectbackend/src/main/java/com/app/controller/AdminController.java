package com.app.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.app.dto.LoginRequest;
import com.app.model.Admin;
import com.app.model.Student;
import com.app.service.AdminService;

@CrossOrigin("*")
@RestController
public class AdminController {
	@Autowired
	private AdminService adminService;
	@PostMapping("/admin/login")
	public ResponseEntity<Admin> adminLogin(@RequestBody LoginRequest request){
		System.out.println("email: "+ request.getEmail());
		System.out.println("Pass: "+ request.getPassword());
		
	return new ResponseEntity<>(adminService.adminLogin(request.getEmail(), request.getPassword()), HttpStatus.OK);
	}
	
	@GetMapping("/getadmin/{adminId}")
	public Admin getAdminDetails(@PathVariable int adminId)
	{
		return adminService.getAdminById(adminId);
	}

}