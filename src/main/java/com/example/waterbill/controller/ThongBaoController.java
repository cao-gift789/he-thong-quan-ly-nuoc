package com.example.waterbill.controller;

import com.example.waterbill.model.ThongBao;
import com.example.waterbill.service.ThongBaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/thongbao")
public class ThongBaoController {

    @Autowired
    private ThongBaoService thongBaoService;

    @GetMapping
    public List<ThongBao> getAllThongBao() {
        return thongBaoService.getAllThongBao();
    }

    @GetMapping("/{id}")
    public Optional<ThongBao> getThongBaoById(@PathVariable int id) {
        return thongBaoService.getThongBaoById(id);
    }

    @PostMapping
    public ThongBao saveThongBao(@RequestBody ThongBao thongBao) {
        return thongBaoService.saveThongBao(thongBao);
    }

    @DeleteMapping("/{id}")
    public void deleteThongBao(@PathVariable int id) {
        thongBaoService.deleteThongBao(id);
    }
}
