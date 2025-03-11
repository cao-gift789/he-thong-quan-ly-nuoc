package com.example.waterbill.controller;

import com.example.waterbill.model.CuocTroChuyen;
import com.example.waterbill.service.CuocTroChuyenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/cuoctrochuyen")
public class CuocTroChuyenController {

    @Autowired
    private CuocTroChuyenService cuocTroChuyenService;

    @GetMapping
    public List<CuocTroChuyen> getAllCuocTroChuyen() {
        return cuocTroChuyenService.getAllCuocTroChuyen();
    }

    @GetMapping("/{id}")
    public Optional<CuocTroChuyen> getCuocTroChuyenById(@PathVariable int id) {
        return cuocTroChuyenService.getCuocTroChuyenById(id);
    }

    @PostMapping
    public CuocTroChuyen saveCuocTroChuyen(@RequestBody CuocTroChuyen cuocTroChuyen) {
        return cuocTroChuyenService.saveCuocTroChuyen(cuocTroChuyen);
    }

    @DeleteMapping("/{id}")
    public void deleteCuocTroChuyen(@PathVariable int id) {
        cuocTroChuyenService.deleteCuocTroChuyen(id);
    }
}
