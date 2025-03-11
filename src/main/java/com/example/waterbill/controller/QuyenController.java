package com.example.waterbill.controller;

import com.example.waterbill.model.Quyen;
import com.example.waterbill.service.QuyenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/quyen")
public class QuyenController {

    @Autowired
    private QuyenService quyenService;

    @GetMapping
    public List<Quyen> getAllQuyen() {
        return quyenService.getAllQuyen();
    }

    @GetMapping("/{id}")
    public Optional<Quyen> getQuyenById(@PathVariable int id) {
        return quyenService.getQuyenById(id);
    }

    @PostMapping
    public Quyen saveQuyen(@RequestBody Quyen quyen) {
        return quyenService.saveQuyen(quyen);
    }

    @DeleteMapping("/{id}")
    public void deleteQuyen(@PathVariable int id) {
        quyenService.deleteQuyen(id);
    }
}
