package com.example.waterbill.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.waterbill.model.NguoiDung;
import com.example.waterbill.service.NguoiDungService;

@Controller
public class UserController {
	
	@Autowired
	private NguoiDungService nguoiDungservice;
	
	// Trang dang ky nguoi duung
	@GetMapping("/signup")
	public String sigup() {
		return "signup"; 
	}
	
	// Xu ly dang ky nguoi dung
	@PostMapping("/signup")
	public String registerUser(NguoiDung nguoiDung) {
		nguoiDungservice.saveNguoiDung(nguoiDung);//Luu ng dung vao CSDL
		return "redirect:/login";
	}
}
