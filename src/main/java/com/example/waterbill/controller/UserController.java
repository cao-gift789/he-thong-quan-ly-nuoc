package com.example.waterbill.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.waterbill.model.NguoiDung;
import com.example.waterbill.service.NguoiDungService;

@Controller
public class UserController {
	
	@Autowired
	private NguoiDungService nguoiDungservice;
	
	// Trang đăng ký người dùng
	@GetMapping("/signup")
	public String signup() {
		return "signup"; 
	}
	
	// Xử lý đăng ký người dùng
	@PostMapping("/signup")
	public String registerUser(NguoiDung nguoiDung, Model model) {
		nguoiDungservice.saveNguoiDung(nguoiDung); // Lưu người dùng vào CSDL
		// Thêm thông báo vào model
		model.addAttribute("message", "Đăng ký thành công! Vui lòng đăng nhập.");
		// Chuyển hướng đến trang login và hiển thị thông báo
		return "redirect:/login";  // Bạn có thể chuyển hướng về trang login hoặc trang khác
	}
	
	@GetMapping("/login")
	public String loginPage() {
		return "login";
	}
}
