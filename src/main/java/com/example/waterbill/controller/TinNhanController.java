package com.example.waterbill.controller;

import com.example.waterbill.model.TinNhan;
import com.example.waterbill.service.TinNhanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/tinnhan")
public class TinNhanController {

    @Autowired
    private TinNhanService tinNhanService;

    @GetMapping
    public List<TinNhan> getAllTinNhan() {
        return tinNhanService.getAllTinNhan();
    }

    @GetMapping("/{id}")
    public Optional<TinNhan> getTinNhanById(@PathVariable int id) {
        return tinNhanService.getTinNhanById(id);
    }

    @PostMapping
    public TinNhan saveTinNhan(@RequestBody TinNhan tinNhan) {
        return tinNhanService.saveTinNhan(tinNhan);
    }

    @DeleteMapping("/{id}")
    public void deleteTinNhan(@PathVariable int id) {
        tinNhanService.deleteTinNhan(id);
    }
}
