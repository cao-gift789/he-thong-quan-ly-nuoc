package com.example.waterbill.controller;

import com.example.waterbill.model.TinTuc;
import com.example.waterbill.service.TinTucService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/tintuc")
public class TinTucController {

    @Autowired
    private TinTucService tinTucService;

    @GetMapping
    public List<TinTuc> getAllTinTuc() {
        return tinTucService.getAllTinTuc();
    }

    @GetMapping("/{id}")
    public Optional<TinTuc> getTinTucById(@PathVariable int id) {
        return tinTucService.getTinTucById(id);
    }

    @PostMapping
    public TinTuc saveTinTuc(@RequestBody TinTuc tinTuc) {
        return tinTucService.saveTinTuc(tinTuc);
    }

    @DeleteMapping("/{id}")
    public void deleteTinTuc(@PathVariable int id) {
        tinTucService.deleteTinTuc(id);
    }
}
