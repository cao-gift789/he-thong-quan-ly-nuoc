package com.example.waterbill.controller;

import com.example.waterbill.model.GiaoDich;
import com.example.waterbill.service.GiaoDichService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/giaodich")
public class GiaoDichController {

    @Autowired
    private GiaoDichService giaoDichService;

    @GetMapping
    public List<GiaoDich> getAllGiaoDich() {
        return giaoDichService.getAllGiaoDich();
    }

    @GetMapping("/{id}")
    public Optional<GiaoDich> getGiaoDichById(@PathVariable int id) {
        return giaoDichService.getGiaoDichById(id);
    }

    @PostMapping
    public GiaoDich saveGiaoDich(@RequestBody GiaoDich giaoDich) {
        return giaoDichService.saveGiaoDich(giaoDich);
    }

    @DeleteMapping("/{id}")
    public void deleteGiaoDich(@PathVariable int id) {
        giaoDichService.deleteGiaoDich(id);
    }
}
