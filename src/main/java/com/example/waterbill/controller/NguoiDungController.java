package com.example.waterbill.controller;

import com.example.waterbill.model.NguoiDung;
import com.example.waterbill.service.NguoiDungService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import jakarta.servlet.http.HttpSession;
import java.util.Optional;

@Controller
@RequestMapping("/nguoidung")
public class NguoiDungController {

    @Autowired
    private NguoiDungService nguoiDungService;

    @PostMapping("/login")
    public String login(@RequestParam String tenNguoiDung, @RequestParam String matKhau, HttpSession session) {
        Optional<NguoiDung> user = nguoiDungService.getNguoiDungByTenNguoiDungAndMatKhau(tenNguoiDung, matKhau);
        if (user.isPresent()) {
            session.setAttribute("loggedUser", user.get());
            return "redirect:/";
        } else {
            return "redirect:/login?error";
        }
    }

    @GetMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:/";
    }

    @GetMapping("/check-login")
    @ResponseBody
    public String checkLogin(HttpSession session) {
        Object loggedUser = session.getAttribute("loggedUser");
        if (loggedUser == null) {
            return "Bạn chưa đăng nhập";
        }
        return "OK";
    }
}
