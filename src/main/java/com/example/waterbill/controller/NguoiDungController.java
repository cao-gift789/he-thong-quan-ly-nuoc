package com.example.waterbill.controller;

import com.example.waterbill.model.NguoiDung;
import com.example.waterbill.service.NguoiDungService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller  // Thay đổi từ @RestController thành @Controller
@RequestMapping("/nguoidung")
public class NguoiDungController {

    @Autowired
    private NguoiDungService nguoiDungService;

    // API này vẫn trả về dữ liệu JSON cho các request REST API
    @GetMapping
    public List<NguoiDung> getAllNguoiDung() {
        return nguoiDungService.getAllNguoiDung();
    }

    @GetMapping("/{id}")
    public Optional<NguoiDung> getNguoiDungById(@PathVariable int id) {
        return nguoiDungService.getNguoiDungById(id);
    }

    @PostMapping
    public NguoiDung saveNguoiDung(@RequestBody NguoiDung nguoiDung) {
        return nguoiDungService.saveNguoiDung(nguoiDung);
    }

    @DeleteMapping("/{id}")
    public void deleteNguoiDung(@PathVariable int id) {
        nguoiDungService.deleteNguoiDung(id);
    }

    // Phương thức này sẽ trả về trang HTML (Thymeleaf template) để hiển thị người dùng
    @GetMapping("/list")
    public String getAllUsers(Model model) {
        List<NguoiDung> danhSachNguoiDung = nguoiDungService.getAllNguoiDung();
        model.addAttribute("danhSachNguoiDung", danhSachNguoiDung);  // Truyền dữ liệu vào model
        return "nguoidung";  // Trả về file nguoidung.html
    }
}
