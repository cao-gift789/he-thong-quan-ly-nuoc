package com.example.waterbill.controller;

import com.example.waterbill.model.CoSoDangKy;
import com.example.waterbill.service.CoSoDangKyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/cosodangky")
public class CoSoDangKyController {

    @Autowired
    private CoSoDangKyService coSoDangKyService;

    @GetMapping
    public List<CoSoDangKy> getAllCoSoDangKy() {
        return coSoDangKyService.getAllCoSoDangKy();
    }

    @GetMapping("/{id}")
    public Optional<CoSoDangKy> getCoSoDangKyById(@PathVariable int id) {
        return coSoDangKyService.getCoSoDangKyById(id);
    }

    @PostMapping
    public CoSoDangKy saveCoSoDangKy(@RequestBody CoSoDangKy coSoDangKy) {
        return coSoDangKyService.saveCoSoDangKy(coSoDangKy);
    }

    @DeleteMapping("/{id}")
    public void deleteCoSoDangKy(@PathVariable int id) {
        coSoDangKyService.deleteCoSoDangKy(id);
    }
}
