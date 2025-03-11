package com.example.waterbill.controller;

import com.example.waterbill.model.TaiKhoan;
import com.example.waterbill.service.TaiKhoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/taikhoan")
public class TaiKhoanController {

    @Autowired
    private TaiKhoanService taiKhoanService;

    @GetMapping
    public List<TaiKhoan> getAllTaiKhoan() {
        return taiKhoanService.getAllTaiKhoan();
    }

    @GetMapping("/{id}")
    public Optional<TaiKhoan> getTaiKhoanById(@PathVariable int id) {
        return taiKhoanService.getTaiKhoanById(id);
    }

    @PostMapping
    public TaiKhoan saveTaiKhoan(@RequestBody TaiKhoan taiKhoan) {
        return taiKhoanService.saveTaiKhoan(taiKhoan);
    }

    @DeleteMapping("/{id}")
    public void deleteTaiKhoan(@PathVariable int id) {
        taiKhoanService.deleteTaiKhoan(id);
    }
}
