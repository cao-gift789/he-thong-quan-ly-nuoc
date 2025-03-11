package com.example.waterbill.controller;

import com.example.waterbill.model.PhuongThucThanhToan;
import com.example.waterbill.service.PhuongThucThanhToanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/phuongthucthanhtoan")
public class PhuongThucThanhToanController {

    @Autowired
    private PhuongThucThanhToanService phuongThucThanhToanService;

    @GetMapping
    public List<PhuongThucThanhToan> getAllPhuongThucThanhToan() {
        return phuongThucThanhToanService.getAllPhuongThucThanhToan();
    }

    @GetMapping("/{id}")
    public Optional<PhuongThucThanhToan> getPhuongThucThanhToanById(@PathVariable int id) {
        return phuongThucThanhToanService.getPhuongThucThanhToanById(id);
    }

    @PostMapping
    public PhuongThucThanhToan savePhuongThucThanhToan(@RequestBody PhuongThucThanhToan phuongThucThanhToan) {
        return phuongThucThanhToanService.savePhuongThucThanhToan(phuongThucThanhToan);
    }

    @DeleteMapping("/{id}")
    public void deletePhuongThucThanhToan(@PathVariable int id) {
        phuongThucThanhToanService.deletePhuongThucThanhToan(id);
    }
}
