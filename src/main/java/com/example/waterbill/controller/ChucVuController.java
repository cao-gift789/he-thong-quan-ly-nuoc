package com.example.waterbill.controller;

import com.example.waterbill.model.ChucVu;
import com.example.waterbill.service.ChucVuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/chucvu")
public class ChucVuController {

    @Autowired
    private ChucVuService chucVuService;

    @GetMapping
    public List<ChucVu> getAllChucVu() {
        return chucVuService.getAllChucVu();
    }

    @GetMapping("/{id}")
    public Optional<ChucVu> getChucVuById(@PathVariable int id) {
        return chucVuService.getChucVuById(id);
    }

    @PostMapping
    public ChucVu saveChucVu(@RequestBody ChucVu chucVu) {
        return chucVuService.saveChucVu(chucVu);
    }

    @DeleteMapping("/{id}")
    public void deleteChucVu(@PathVariable int id) {
        chucVuService.deleteChucVu(id);
    }
}
