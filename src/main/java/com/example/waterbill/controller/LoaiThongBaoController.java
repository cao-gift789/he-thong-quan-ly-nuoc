package com.example.waterbill.controller;

import com.example.waterbill.model.LoaiThongBao;
import com.example.waterbill.service.LoaiThongBaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/loaithongbao")
public class LoaiThongBaoController {

    @Autowired
    private LoaiThongBaoService loaiThongBaoService;

    @GetMapping
    public List<LoaiThongBao> getAllLoaiThongBao() {
        return loaiThongBaoService.getAllLoaiThongBao();
    }

    @GetMapping("/{id}")
    public Optional<LoaiThongBao> getLoaiThongBaoById(@PathVariable int id) {
        return loaiThongBaoService.getLoaiThongBaoById(id);
    }

    @PostMapping
    public LoaiThongBao saveLoaiThongBao(@RequestBody LoaiThongBao loaiThongBao) {
        return loaiThongBaoService.saveLoaiThongBao(loaiThongBao);
    }

    @DeleteMapping("/{id}")
    public void deleteLoaiThongBao(@PathVariable int id) {
        loaiThongBaoService.deleteLoaiThongBao(id);
    }
}
